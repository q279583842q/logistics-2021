package com.bb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bb.dto.OrderDto;
import com.bb.service.IOrderService;

@Controller
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private IOrderService orderService;

	@RequestMapping("/goAddOrUpdate")
	public String goAddOrUpdate(Model m,Integer orderId){
		orderService.getAddOrUpdateInfo(m, orderId);
		return "order/order_update";
	}
	@RequestMapping("/save")
	@ResponseBody
	public String save(@RequestBody OrderDto dto){
		boolean flag = orderService.saveOrderInfo(dto);
		if(flag){
			return "ok";
		}else{
			return "失败....";
		}
	}
}
