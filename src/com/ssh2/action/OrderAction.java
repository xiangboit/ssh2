package com.ssh2.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ssh2.bean.Orders;
import com.ssh2.service.OrderService;

@Controller
@Scope("prototype")
@SuppressWarnings("serial")
public class OrderAction extends ActionSupport{
	
	@Resource
	private OrderService orderService;
	
	public String list() throws Exception {
		List<Orders> orderlist=orderService.getAll();
		ActionContext.getContext().put("orderlist", orderlist);
		return "list";
	}
}
