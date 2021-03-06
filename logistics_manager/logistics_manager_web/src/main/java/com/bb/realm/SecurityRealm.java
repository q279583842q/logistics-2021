package com.bb.realm;

import java.util.List;
import java.util.UUID;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.SimpleByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.bb.pojo.Role;
import com.bb.pojo.User;
import com.bb.service.IUserService;

/**
 * 自定义的realm 
 *   认证和授权操作
 * @author dengp
 *
 */
public class SecurityRealm extends AuthorizingRealm{

	@Autowired
	private IUserService userService;

	/**
	 * 授权
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken t = (UsernamePasswordToken) token;
		String userName = t.getUsername();
		User user = new User();
		user.setUserName(userName);
		List<User> list = userService.query(user);
		if(list == null || list.size() != 1){
			return null;
		}
		// 登录成功，封装的有登录的用户的信息
		user = list.get(0);
		
		return new SimpleAuthenticationInfo(user, user.getPassword(), new SimpleByteSource(user.getU1()), "myRealm");
	}
	
	/**
	 * 认证
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// 1.获取登录的用户信息
		User user = (User) principals.getPrimaryPrincipal();
		// 从redis中获取数据
		// 2.获取登录用户编号，获取对应的所有的角色信息
		List<Role> roles = userService.queryRoleByUserId(user.getUserId());
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		if(roles!= null && roles.size() > 0){
			for (Role role : roles) {
				info.addRole(role.getRoleName());
			}
		}
		return info;
	}
	
}
