package com.bb.service;

import org.springframework.ui.Model;

import com.bb.dto.OrderDto;

public interface IOrderService {

	/**
	 * 用来获取添加订单或修改订单需要的必要的数据
	 * @param m
	 * @param orderId
	 */
	public void getAddOrUpdateInfo(Model m,Integer orderId);

	public boolean saveOrderInfo(OrderDto dto);
}
