package com.journaldev.spring.model;

import java.util.List;

public class Category {

	String categoryName;
	List<Item> itemList;
	double categoryBudget;
	
	@Override
	public String toString() {
		return "\nCategory [categoryName=" + categoryName + ",\n itemList=" + itemList + ",\n categoryBudget="
				+ categoryBudget + "]";
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public List<Item> getItemList() {
		return itemList;
	}
	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
	public double getCategoryBudget() {
		return categoryBudget;
	}
	public void setCategoryBudget(double categoryBudget) {
		this.categoryBudget = categoryBudget;
	}

}
