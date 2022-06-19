package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.City;
import com.example.demo.model.State;
import com.example.demo.service.CityService;
import com.example.demo.service.StateService;

@RestController
@RequestMapping("/state")
public class StateController {

	@Autowired
	private StateService stateService;

	@GetMapping
	public List<State> getStates() {
		return stateService.getStates();
	}

	@PutMapping
	public List<State> updateStates(@RequestBody List<State> states) {
		return stateService.updateStates(states);
	}

}
