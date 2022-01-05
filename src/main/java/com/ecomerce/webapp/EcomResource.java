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
		return "<link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css' integrity='sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T' crossorigin='anonymous'><div class='container'><h1>Hello, Welcome ecommerce webservice application deployed using jenkins ! </h1></div>";
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "<h2>Hello, wonderfull job!<h2>";
	}
}
