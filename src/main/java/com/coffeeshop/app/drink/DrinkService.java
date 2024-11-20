package com.coffeeshop.app.drink;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.coffeeshop.app.drink.types.Beer;
import com.coffeeshop.app.drink.types.Coffee;
import com.coffeeshop.app.drink.types.Drinks;
import com.coffeeshop.app.drink.types.Juice;
import com.coffeeshop.app.drink.types.Liquor;

@Service
public class DrinkService {
	
	private List<Drinks> listOfDrinks=new ArrayList<>(Arrays.asList(
			new Coffee(++drinkId,"coffee",150,true),
			new Beer(++drinkId,"budwiser",180,true),
			new Liquor(++drinkId,"whiskey",200,true),
			new Juice(++drinkId,"coca-cola",150,false)
			));
	
	private static int drinkId=0;

	public List<Drinks> returnDrinks(){
		return listOfDrinks;
	}
	
	public Drinks returnDrinkById(int id) {
		Drinks drinkById = listOfDrinks.stream().filter(drink->drink.getId()==id).findFirst().get();
		return drinkById;
	}
	
	public List<Drinks> returnCoffees(){
		return listOfDrinks.stream()
			        .filter(drink -> drink instanceof Coffee)
			        .collect(Collectors.toList());
	}
	
	public Coffee addCoffee(String type ,double price,boolean available) {
		Coffee coffee = new Coffee(++drinkId,type,price,available); 
		listOfDrinks.add(coffee);
		return coffee;
	}
	
	public List<Drinks> returnBeers(){
		return listOfDrinks.stream()
			        .filter(drink -> drink instanceof Beer)
			        .collect(Collectors.toList());
	}
	
	public Beer addBeer(String type ,double price,boolean available) {
		Beer beer = new Beer(++drinkId,type,price,available); 
		listOfDrinks.add(beer);
		return beer;
	}
	
	public List<Drinks> returnLiquors(){
		return listOfDrinks.stream()
			        .filter(drink -> drink instanceof Liquor)
			        .collect(Collectors.toList());
	}
	
	public Liquor addLiquor(String type ,double price,boolean available) {
		Liquor liquor = new Liquor(++drinkId,type,price,available); 
		listOfDrinks.add(liquor);
		return liquor;
	}
	
	public List<Drinks> returnJuices(){
		return listOfDrinks.stream()
			        .filter(drink -> drink instanceof Juice)
			        .collect(Collectors.toList());
	}
	
	public Juice addJuice(String type ,double price,boolean available) {
		Juice juice = new Juice(++drinkId,type,price,available); 
		listOfDrinks.add(juice);
		return juice;
	}

}
