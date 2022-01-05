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
		return "<link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css' integrity='sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T' crossorigin='anonymous'><main role='main' class='container'><div class='d-flex align-items-center p-3 my-3 text-white-50 bg-purple rounded box-shadow'><img class='mr-3' src='https://getbootstrap.com/docs/4.0/assets/brand/bootstrap-outline.svg' alt='' width='48' height='48'><div class='lh-100'><h6 class='mb-0 text-white lh-100'>eCommerce Web Application Deployed using Jenkins </h6> <small>Since 2021</small></div></div></main>";
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "<h2>Hello, wonderfull job!<h2>";
	}
}
