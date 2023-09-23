package com.example.bike;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BikeController {
	@GetMapping(value="/bikename")
	public String getBrand() {
		return "Harley Davidson";
	}
}
