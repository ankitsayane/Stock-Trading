package com.core;

import java.io.Serializable;
import java.time.LocalDate;

public class Stock implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3663406166869218724L;
	private String stockId;
	private String stockName;
	private String companyName;
	private double stockPrice;
	private LocalDate date;
	private int stockQuantity;
	
	public Stock(String stockId, String stockName, String companyName, double stockPrice, LocalDate date,
			int stockQuantity) {
		this.stockId = stockId;
		this.stockName = stockName;
		this.companyName = companyName;
		this.stockPrice = stockPrice;
		this.date = date;
		this.stockQuantity = stockQuantity;
	}
	public String getStockId() {
		return stockId;
	}

	public void setStockId(String stockId) {
		this.stockId = stockId;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	@Override
	public String toString() {
		return "Stock -- { Id: " + stockId + ", Name: " + stockName + ", CompanyName: " + companyName
				+ ", Price: " + stockPrice + ", Date: " + date + ", Quantity: " + stockQuantity + " }";
	}
	
	
}
