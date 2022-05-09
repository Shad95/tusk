package com.city.service;

import java.util.List;
import java.util.Optional;

import com.city.entity.City;

public interface CityService{
	
	public List<City> getCities();
	
	public Optional<City> getCity(Long cityId);
	
	public City saveCity(City city);
	
	public String deleteCity(Long cityId);
	

}
