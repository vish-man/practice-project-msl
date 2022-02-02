package com.to;

public class Product {
	private String productName;
	private String productColor;
	private int productPrice;
	
	public Product() {
		
	}
	
	
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productColor=" + productColor + ", productPrice=" + productPrice
				+ "]";
	}


	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductColor() {
		return productColor;
	}
	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	
	
}
