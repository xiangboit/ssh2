package com.ssh2.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh2.bean.Orders;
import com.ssh2.bean.Product;
import com.ssh2.service.OrderService;


@Controller
@Scope("prototype")
@SuppressWarnings("serial")
public class OrderDetialAction extends ActionSupport implements ModelDriven<Product>{

	private Product product;
	private int orderId;
	@Resource
	private OrderService orderService;
	
	public String list() throws Exception {
		Orders order=orderService.getById(orderId);
		ActionContext.getContext().put("order", order);
		
		return "list";
	}
	
	public String addUI() throws Exception {
	
		return "addUI";
	}
	
	public String add() throws Exception {
		product.setOrders(orderService.getById(orderId));
		
		orderService.add(product);
		return "tolist";
	}
	
	public String updateUI() throws Exception {
		Product products=orderService.getId(product.getId());
		ActionContext.getContext().getValueStack().push(products);
	
		return "updateUI";
	}
	
	public String update() throws Exception {
		
		Product products=orderService.getId(product.getId());
		
		products.setName(product.getName());
		products.setProductDate(product.getProductDate());
		products.setOrders(orderService.getById(orderId));
		
		orderService.update(products);
		return "tolist";
	}
	
	public String delete() throws Exception {
		
		orderService.delete(product.getId());
		
		return "tolist";
	}
	
	//=====================================
	public Product getModel() {
		product=new Product();
		return product;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	


}
