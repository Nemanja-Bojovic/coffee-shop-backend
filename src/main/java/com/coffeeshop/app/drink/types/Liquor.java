package com.coffeeshop.app.drink.types;

public class Liquor implements Drinks {
	private int id;
	private String type;
	private double price;
	private boolean available;
	
	public Liquor() {
		super();
	}

	public Liquor(int id, String type, double price, boolean available) {
		super();
		this.id = id;
		this.type = type;
		this.price = price;
		this.available = available;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	@Override
	public String toString() {
		return "Drink [id=" + id + ", type=" + type + ", price=" + price + ", available=" + available + "]";
	}
	
}
