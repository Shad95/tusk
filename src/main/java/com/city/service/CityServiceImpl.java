package com.city.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.city.entity.City;
import com.city.repository.CityRepository;

@Service
public class CityServiceImpl implements CityService{
	@Autowired
	private CityRepository cityRepository;

	@Override
	public List<City> getCities() {
		
		return cityRepository.findAll();
	}

	@Override
	public Optional<City> getCity(Long cityId) {
		
		Optional<City> city=cityRepository.findById(cityId);
		return city;
	}

	@Override
	public City saveCity(City city) {
		
		return cityRepository.save(city);
	}

	@Override
	public String deleteCity(Long cityId) {
		
		cityRepository.deleteById(cityId);
		return "successfully deleted" + cityId;
	}

	
	

}
