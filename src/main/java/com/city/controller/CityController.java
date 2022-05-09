package com.city.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.city.entity.City;
import com.city.service.CityService;

@RestController
@RequestMapping("/example")
public class CityController {
	@Autowired
	private CityService cityService;
	
	
	@GetMapping("/cities")
	public List<City> findAllCities(){
		return cityService.getCities();
	}
	
	@GetMapping("/city/{id}")
	public Optional<City> findSingleCity(@PathVariable(value = "id") Long cityId)   {
		return cityService.getCity(cityId);
	}
	
	@PostMapping("/city")
	public City createCity(@RequestBody City city) {
		return cityService.saveCity(city);
	}
	
	@PutMapping("/city")
	public City updateCity(@RequestBody City city) {
		return cityService.saveCity(city);
	}
	
	@DeleteMapping("/delete/{id}")
	public String removeCity(@PathVariable(value = "id") Long cityId) {
		
		return cityService.deleteCity(cityId);
		
	}

}
