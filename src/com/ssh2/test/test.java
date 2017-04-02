package com.ssh2.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssh2.bean.Product;
import com.ssh2.service.OrderService;

public class test {

	ApplicationContext context=//
			new ClassPathXmlApplicationContext("spring-bean.xml");
	
	@Test
	public void getById(){
		OrderService orderService=(OrderService) context.getBean("orderServiceImpl");
		System.out.println(orderService.getId(1));
		
		Product product=new Product();
		
		orderService.delete(1);
		
		
	}
}
