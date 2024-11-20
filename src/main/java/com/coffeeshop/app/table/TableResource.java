package com.coffeeshop.app.table;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TableResource {
	
	TableService tableService;

	public TableResource(TableService tableService) {
		super();
		this.tableService = tableService;
	}
	
	@GetMapping("/tables")
	public List<Table> tables() {
		return tableService.returnTables();
	}
	
	@GetMapping("/table/{id}")
	public Table returnTable(@PathVariable int id) {
		return tableService.returnTableById(id);
	}
	
	@PostMapping("/create-table")
	public ResponseEntity<Table> createTable() {
	    // Assuming you have a Table class with fields like id, name, etc.
	    // Validate and save the table
	    Table savedTable = tableService.createTable();
	    return new ResponseEntity<>(savedTable, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete-table/{id}")
	public void deleteTodo(@PathVariable int id){
		tableService.deleteTableById(id);
	}
	
	@PutMapping("/table/{tableId}/drink/{drinkId}")
	public void updateTodo(@PathVariable int tableId,@PathVariable int drinkId){
		tableService.addDrinkToTable(tableId, drinkId);
	}
}
