package com.coffeeshop.app.table;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import com.coffeeshop.app.drink.types.Beer;
import com.coffeeshop.app.drink.types.Coffee;
import com.coffeeshop.app.drink.types.Drinks;
import com.coffeeshop.app.drink.types.Juice;
import com.coffeeshop.app.drink.types.Liquor;

@Service
public class TableService {
	
	private static int tableId=0;
	
	private int drinkId = 0;
	
	List<Drinks> listOfDrinks=new ArrayList<>(
			Arrays.asList(
					new Coffee(++drinkId,"coffee",150,true),
					new Beer(++drinkId,"budwiser",180,true),
					new Liquor(++drinkId,"whiskey",200,true),
					new Juice(++drinkId,"coca-cola",150,false)
					)
			);
	
	List<Table> listOfTables= new ArrayList<>(
			Arrays.asList(new Table(++tableId,listOfDrinks))
			);	
	
	public List<Table> returnTables(){
		return listOfTables;
	}
	
	public Table returnTableById(int id) {
		Predicate<? super Table> tablePredicate = table -> table.getId() == tableId;
		Table table = listOfTables.stream().filter(tablePredicate).findFirst().get();
		return table;
	}
	
	public Table createTable() {
		Table table = new Table(++tableId,new ArrayList<Drinks>()); 
		listOfTables.add(table);
		return table;	
	}
	
	public void deleteTableById(int id){
		Predicate<? super Table> predicate = table -> table.getId() == id;
		listOfTables.removeIf(predicate);
	}
	
	public Table addDrinkToTable(int tableId,int drinkId) {
		Predicate<? super Table> tablePredicate = table -> table.getId() == tableId;
		Table table = listOfTables.stream().filter(tablePredicate).findFirst().get();
		Predicate<? super Drinks> drinkPredicate = drink -> drink.getId() == drinkId;
		Drinks drink = listOfDrinks.stream().filter(drinkPredicate).findFirst().get();
		table.addDrinkToTable(drink);;
		return table;
	}
	
	
	
}
