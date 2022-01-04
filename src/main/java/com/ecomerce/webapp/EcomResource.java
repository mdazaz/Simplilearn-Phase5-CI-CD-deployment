package com.ecomerce.webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EcomResource {
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(value = "name", defaultValue="World") String name) {
		return "<h1>Today is a wonderfull day ahead ! , " + name +"</h1>";
	}
	
	@GetMapping("/")
	public String index() {
		return "<h1>Hello, Welcome ecommerce webservice application deployed using jenkins ! </h1>";
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "<h2>Hello, wonderfull job!<h2>";
	}
}
