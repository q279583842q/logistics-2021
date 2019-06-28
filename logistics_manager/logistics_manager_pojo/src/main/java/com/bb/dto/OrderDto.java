package com.bb.dto;

import java.util.List;

import com.bb.pojo.Order;
import com.bb.pojo.OrderDetail;

public class OrderDto extends Order{

	private List<OrderDetail> orderDetails;

	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	
	
	
}
