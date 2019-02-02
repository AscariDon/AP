package com.zphone.zphoneapp;

public class IPhone {

	private String sku;
	private String imei;
	private float price;
	private String model;
	
	public IPhone()
	{
		this("","",0,"");
	}

	
	public IPhone(String string, String string2, int i, String string3) {
		// TODO Auto-generated constructor stub
	}


	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
