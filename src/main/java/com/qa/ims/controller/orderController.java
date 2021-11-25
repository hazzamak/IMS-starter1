package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.OrdersDAO;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.persistence.domain.Orders;
import com.qa.ims.persistence.dao.Order_ItemsDAO;
import com.qa.ims.utils.Utils;

public class orderController implements CrudController<Orders> {

	public static final Logger LOGGER = LogManager.getLogger();

	private OrdersDAO OrdersDAO;
	private Order_ItemsDAO Order_ItemsDAO;
	private Utils utils;
	
	@Override
	public List<Orders> readAll() {
		List<Orders> order = Orders.readAll();
		for (Orders Orders : order) {
			LOGGER.info(order);
		}
		return order;
	}

	@Override
	public Orders create() {
		
	}

	@Override
	public Orders update() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete() {
		// TODO Auto-generated method stub
		return 0;
	}

}
