package com.journaldev.spring.model;

import java.util.Date;

public class Item {

	String itemName;
	float printPrice;
	float purchasePrice;
	float quantity;
	Date mgnDate;
	Date expDate;
	
	@Override
	public String toString() {
		return "\n\tItem [itemName=" + itemName + ", printPrice=" + printPrice + ", purchasePrice=" + purchasePrice
				+ ", quantity=" + quantity + ", mgnDate=" + mgnDate + ", expDate=" + expDate + "]";
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public float getPrintPrice() {
		return printPrice;
	}
	public void setPrintPrice(float printPrice) {
		this.printPrice = printPrice;
	}
	public float getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(float purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	public Date getMgnDate() {
		return mgnDate;
	}
	public void setMgnDate(Date mgnDate) {
		this.mgnDate = mgnDate;
	}
	public Date getExpDate() {
		return expDate;
	}
	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}
	
}
