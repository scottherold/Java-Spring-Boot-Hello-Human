package com.sherold.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//This annotation allows for this file to be used as a 'controller'
@RestController

// Root URL map
@RequestMapping("/")
public class HomeController {
	
	// Route for GET Root
	@RequestMapping("")
	
	// @RequestParam is an annotation dictating a querying; 'q' acts as the key for the query for the syntax '/?q='
	// To not require the query, simply add 'required=false', or an error will be thrown	
	public String index(@RequestParam(value="q", required=false) String searchQuery) {
		
		// Event handlers for null queries
		if(searchQuery == null) {
			return "Hello Human, welcome to SpringBoot";
		} else {
			return "Hello " + searchQuery + ", Welcome to SpringBoot";
		}
	}
}
