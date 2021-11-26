package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.OrdersDAO;
import com.qa.ims.persistence.domain.Customer;
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
		LOGGER.info("Please enter customer id");
		Long custID = utils.getLong();
		LOGGER.info("Please enter order id");
		Long ordID = utils.getLong();
		LOGGER.info("Please enter item id");
		Long itmID = utils.getLong();
		Orders order = OrdersDAO.create(new Orders(custID, ordID, itmID));
		LOGGER.info("Customer created");
		return order;
	}

	@Override
	public Orders update() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the order you would like to delete");
		Long id = utils.getLong();
		return OrdersDAO.deleteOrder(id);
	}
	
	public int deleteOrder() {
		LOGGER.info("Please enter the id of the item you would like to delete");
		Long id = utils.getLong();
		LOGGER.info("Please enter the id of the order you would like to delete the item from");
		Long id2 = utils.getLong();
		return OrdersDAO.deleteItem(id, id2);
	}

}
