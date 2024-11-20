package com.coffeeshop.app.drink;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coffeeshop.app.drink.types.Beer;
import com.coffeeshop.app.drink.types.Coffee;
import com.coffeeshop.app.drink.types.Drinks;
import com.coffeeshop.app.drink.types.Juice;
import com.coffeeshop.app.drink.types.Liquor;

@RestController
public class DrinkResource {
	
	DrinkService drinkService;
	
	public DrinkResource(DrinkService drinkService) {
		super();
		this.drinkService = drinkService;
	}

	@GetMapping("/drinks")
	public List<Drinks> drinks() {
		return drinkService.returnDrinks();
	}
	
	@GetMapping("/drinks/coffees")
	public List<Drinks> coffeeList() {
		return drinkService.returnCoffees();
	}
	
	@PostMapping("/drink/add-coffee")
	public Coffee addCoffe(@RequestBody Coffee coffee) {
		Coffee createdCoffee = drinkService.addCoffee(coffee.getType(),coffee.getPrice(),coffee.isAvailable());
		return createdCoffee;
	}
	
	@GetMapping("/drinks/beers")
	public List<Drinks> beerList() {
		return drinkService.returnBeers();
	}
	
	@PostMapping("/drink/add-beer")
	public Beer addBeer(@RequestBody Beer beer) {
		Beer createdBeer = drinkService.addBeer(beer.getType(),beer.getPrice(),beer.isAvailable());
		return createdBeer;
	}
	
	@GetMapping("/drinks/liquors")
	public List<Drinks> liquorList() {
		return drinkService.returnLiquors();
	}
	
	@PostMapping("/drink/add-liquor")
	public Liquor addLiquor(@RequestBody Liquor liquor) {
		Liquor createdLiquor = drinkService.addLiquor(liquor.getType(),liquor.getPrice(),liquor.isAvailable());
		return createdLiquor;
	}
	
	@GetMapping("/drinks/juices")
	public List<Drinks> juiceList() {
		return drinkService.returnJuices();
	}
	
	@PostMapping("/drink/add-juice")
	public Juice addJuice(@RequestBody Juice juice) {
		Juice createdJuice = drinkService.addJuice(juice.getType(),juice.getPrice(),juice.isAvailable());
		return createdJuice;
	}
	
}
