package com.qa.ims.persistence.domain;

import java.util.List;

public class Orders {
	
	private Long id;
	private Long customer_id;
	
	public Long getId() {
		return id;
	}
	
	public Long getCustomer_ID() {
		return customer_id;
	}
	
	public Long getIDs() {
		
	}
	
	public String toString() {
		return "id:" + id + " customer id:" + customer_id;
	}
	
}
