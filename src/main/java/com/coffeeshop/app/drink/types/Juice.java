package com.coffeeshop.app.drink.types;

public class Juice implements Drinks{
	private int id;
	private String type;
	private double price;
	private boolean available;
	
	public Juice() {}
	
	public Juice(int id, String type, double price, boolean available) {
		super();
		this.id = id;
		this.type = type;
		this.price = price;
		this.available = available;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double juice() {
		return price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Juice [id=" + id + ", type=" + type + ", price=" + price + ", available=" + available + "]";
	}
	
}
