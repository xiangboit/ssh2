package com.ssh2.service;

import java.util.List;

import com.ssh2.bean.Orders;
import com.ssh2.bean.Product;

public interface OrderService {

	List<Orders> getAll();

	Orders getById(int orderId);

	void add(Product product);

	Product getId(int id);

	void update(Product products);

	void delete(int id);

}
