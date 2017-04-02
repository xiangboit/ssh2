package com.ssh2.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssh2.bean.Orders;
import com.ssh2.bean.Product;
import com.ssh2.service.OrderService;

@Service @Transactional
@SuppressWarnings("unchecked")
public class OrderServiceImpl implements OrderService{

	@Resource
	private SessionFactory sessionFactory;
	public List<Orders> getAll() {
		
		return sessionFactory.getCurrentSession().createQuery(//
				"FROM Orders")
				.list();
	}
	public Orders getById(int orderId) {
		
		return (Orders) sessionFactory.getCurrentSession().get(Orders.class, orderId);
	}
	public void add(Product product) {
		
		sessionFactory.getCurrentSession().save(product);
	}
	public Product getId(int id) {
		
		return (Product) sessionFactory.getCurrentSession().get(Product.class, id);
	}
	public void update(Product products) {
		sessionFactory.getCurrentSession().update(products);
	}
	public void delete(int id) {
		Object obj= sessionFactory.getCurrentSession().get(Product.class, id);
		
		sessionFactory.getCurrentSession().delete(obj);
	}

}
