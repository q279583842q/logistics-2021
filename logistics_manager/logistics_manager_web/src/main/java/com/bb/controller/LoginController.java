package com.bb.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("/login.do")
	public String login(HttpServletRequest request, Model model) {
		Object ex = request.getAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
		if (ex != null) {
			if (UnknownAccountException.class.getName().equals(ex)) {
				System.out.println("----账号不正确----->");
				model.addAttribute("msg", "账号不正确");
			} else if (IncorrectCredentialsException.class.getName().equals(ex)) {
				System.out.println("----密码不正确----->");
				model.addAttribute("msg", "密码不正确");
			} else {
				System.out.println("----其他错误----->");
				model.addAttribute("msg", "其他错误");
			}
		}
		return "login";
	}
	@RequestMapping("/logout.do")
	public String logout(){
		SecurityUtils.getSubject().logout();
		return "login";
	}
}
