package com.example.demo.service;

import java.util.List;

import com.example.demo.model.State;

public interface StateService {

	public List<State> getStates();

	public List<State> updateStates(List<State> states);

}
