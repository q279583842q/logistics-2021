package com.bb.dto;

import com.bb.pojo.Customer;

/**
 * 客户信息的传输对象
 * @author dengp
 *
 */
public class CustomerDto extends BasePage{

	private Customer customer;
	
	// 常用区间
	private String commonInterval;
	
	// 业务员
	private String realName;
	
	// 订单数量
	private Integer orderNum;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getCommonInterval() {
		return commonInterval;
	}

	public void setCommonInterval(String commonInterval) {
		this.commonInterval = commonInterval;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Integer getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}
	
	
}
