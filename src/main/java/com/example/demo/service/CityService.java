package com.example.demo.service;

import java.util.List;

import com.example.demo.model.City;

public interface CityService {

	public List<City> getCity();

	public List<City> updateCity(List<City> city);
	
	public List<City> getCityByState(Long state_id);

	public City getCityById(Long cityId);

	public List<City> getCityByStateName(String stateName);
}
