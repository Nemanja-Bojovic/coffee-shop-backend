package com.coffeeshop.app.table;

import java.util.List;
import com.coffeeshop.app.drink.types.Drinks;

public class Table {
	private int id;
	private List<Drinks> tableDrinks;
	
	public Table(int id, List<Drinks> tableDrinks) {
		super();
		this.id = id;
		this.tableDrinks = tableDrinks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Drinks> getTableDrinks() {
		return tableDrinks;
	}

	public void setTableDrinks(List<Drinks> tableDrinks) {
		this.tableDrinks = tableDrinks;
	}
	public void addDrinkToTable(Drinks drink) {
		tableDrinks.add(drink);
	}
	@Override
	public String toString() {
		return "Table [id=" + id + ", tableDrinks=" + tableDrinks + "]";
	}
	
	
}
