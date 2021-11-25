package com.qa.ims.persistence.domain;

public class Item {
	private Long id;
	private String item_name;
	private Integer item_price;
	
	public Item(String item_name, Integer item_price) {
		this.item_name = item_name;
		this.item_price = item_price;
	}
	
	
	public Item(Long id, String item_name, Integer item_price) {
		this.setId(id);
		this.setItem_name(item_name);
		this.setItem_price(item_price);
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getItem_name() {
		return item_name;
	}
	
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	
	public Integer getItem_price() {
		return item_price;
	}
	
	public void setItem_price(Integer item_price) {
		this.item_price = item_price;
	}
	
	public String toString() {
		return "id:" + id + " item name:" + item_name + " item price:" + item_price;
	}	
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((item_name == null) ? 0 : item_name.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((item_price == null) ? 0 : item_price.hashCode());
		return result;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (getItem_name() == null) {
			if (other.getItem_name() != null)
				return false;
		} else if (!getItem_name().equals(other.getItem_name()))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (item_price == null) {
			if (other.item_price != null)
				return false;
		} else if (!item_price.equals(other.item_price))
			return false;
		return true;
	}
}
