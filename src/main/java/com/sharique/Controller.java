package com.sharique;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/hello")
	public String hello() {
		String str= "Hello World !";
		return  str;
	}
	
	@GetMapping("/second")
	public String bay() {
		System.out.println("This is second URL ");
		return "Bay Bay  Wrold !";
	}

}
