package com.zhaoya.domain;

public class Vo{

	private String startPrice;
	private String endPrice;
	private String startSales;
	private String endSales;
	private String orderName;
	private String orderMethod;
	public String getStartPrice() {
		return startPrice;
	}
	public void setStartPrice(String startPrice) {
		this.startPrice = startPrice;
	}
	public String getEndPrice() {
		return endPrice;
	}
	public void setEndPrice(String endPrice) {
		this.endPrice = endPrice;
	}
	public String getStartSales() {
		return startSales;
	}
	public void setStartSales(String startSales) {
		this.startSales = startSales;
	}
	public String getEndSales() {
		return endSales;
	}
	public void setEndSales(String endSales) {
		this.endSales = endSales;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getOrderMethod() {
		return orderMethod;
	}
	public void setOrderMethod(String orderMethod) {
		this.orderMethod = orderMethod;
	}
	public Vo(String startPrice, String endPrice, String startSales, String endSales, String orderName,
			String orderMethod) {
		super();
		this.startPrice = startPrice;
		this.endPrice = endPrice;
		this.startSales = startSales;
		this.endSales = endSales;
		this.orderName = orderName;
		this.orderMethod = orderMethod;
	}
	public Vo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
