package com.code;

public enum ServicePlan {
  
	SILVER(1000),
	GOLD (2000),
	DIAMOND(5000),
	PLATINUM(10000);

	//Constructor
	private int charges;
	ServicePlan(int charges) {
	this.charges=charges;
	}
	
	//Getter and Setter 
	public int getCharges() {
		return charges;
	}
	public void setCharges(int charges) {
		this.charges = charges;
	}

}
