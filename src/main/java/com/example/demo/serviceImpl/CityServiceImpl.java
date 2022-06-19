package com.example.demo.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CityRepo;
import com.example.demo.dao.StateRepo;
import com.example.demo.model.City;
import com.example.demo.model.State;
import com.example.demo.service.CityService;

@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private CityRepo cityRepo;
	
	@Autowired
	private StateRepo stateRepo;

	@Override
	public List<City> getCity() {
		return cityRepo.findAll();
	}

	@Override
	public List<City> updateCity(List<City> city) {
		return cityRepo.saveAll(city);
	}

	@Override
	public List<City> getCityByState(Long state_id) {
		return cityRepo.findByStateId(state_id);
	}

	@Override
	public City getCityById(Long cityId) {
		return cityRepo.findById(cityId).get();
	}

	@Override
	public List<City> getCityByStateName(String stateName) {
//		State state = stateRepo.findByName(stateName);
//		return this.getCityByState(state.getId());
		
		return cityRepo.getCityByStateName(stateName);
	}

}
