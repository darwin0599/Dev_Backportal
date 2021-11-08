package com.gyf.backoffice.model;

import java.math.BigDecimal;

public class ProductsModel 
{
	private String iconName;
	
	private String productName;
	
	private String totalValueLabel;
	
	private String totalValue;
	
	private String id;
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIconName() {
		return iconName;
	}

	public void setIconName(String iconName) {
		this.iconName = iconName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getTotalValueLabel() {
		return totalValueLabel;
	}

	public void setTotalValueLabel(String totalValueLabel) {
		this.totalValueLabel = totalValueLabel;
	}

	public String getTotalValue() {
		return totalValue;
	}
	
	public BigDecimal getTotalValueNumber() {
		return new BigDecimal(totalValue);
	}

	public void setTotalValue(String totalValue) {
		this.totalValue = totalValue;
	}
}
