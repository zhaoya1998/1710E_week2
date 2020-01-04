package com.zhaoya.domain;

import java.beans.Transient;
import java.io.Serializable;

public class Goods implements Serializable{

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private Double price;
	private int sales;
	@Transient
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getSales() {
		return sales;
	}
	public void setSales(int sales) {
		this.sales = sales;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Goods(Integer id, String name, Double price, int sales) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.sales = sales;
	}
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
