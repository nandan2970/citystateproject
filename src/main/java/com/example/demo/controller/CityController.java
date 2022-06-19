package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.City;
import com.example.demo.service.CityService;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
@RequestMapping("/city")
public class CityController {

	@Autowired
	private CityService cityService;

	@GetMapping
	public List<City> getCity() {
		log.info("CityController - getCity");
		return cityService.getCity();
	}

	@PutMapping
	public List<City> updateCity(@RequestBody List<City> city) {
		return cityService.updateCity(city);
	}

	@GetMapping("/{id}")
	public City getCityById(@PathVariable("id") Long cityId) {
		return cityService.getCityById(cityId);
	}
	
	@GetMapping("/state/{id}")
	public List<City> getCityByStateId(@PathVariable("id") Long stateId) {
		return cityService.getCityByState(stateId);
	}
	
	@GetMapping("/state/name/{name}")
	public List<City> getCityByStateName(@PathVariable("name") String stateName) {
		return cityService.getCityByStateName(stateName);
	}

}
