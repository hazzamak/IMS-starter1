package com.qa.ims.persistence.domain;

public class orderItems {
	private Long id;
	private Long order_id;
	private Long item_id;
	
	public Long getId() {
		return id;
	}
	
	public Long getOrder_ID() {
		return order_id;
	}
	
	public Long getItem_ID() {
		return item_id;
	}
	
	public String toString() {
		return "id:" + id + " order id:" + order_id + " item id:" + item_id;
	}	

}
