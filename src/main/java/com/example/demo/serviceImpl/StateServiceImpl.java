package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StateRepo;
import com.example.demo.model.State;
import com.example.demo.service.StateService;
@Service
public class StateServiceImpl implements StateService {

	@Autowired
	private StateRepo stateRepo;

	@Override
	public List<State> getStates() {
		// TODO Auto-generated method stub
		return stateRepo.findAll();
	}

	@Override
	public List<State> updateStates(List<State> states) {
		// TODO Auto-generated method stub
		return stateRepo.saveAll(states);
	}

}
