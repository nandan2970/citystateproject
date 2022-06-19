package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.City;

public interface CityRepo extends JpaRepository<City, Long>{

	public List<City> findByStateId(Long stateId); // select * from city where state_id = ?

	@Query(value = "select city.id, city.name, city.state_id from city, state where city.state_id=state.id and state.name = ?1", nativeQuery = true)
	public List<City> getCityByStateName(String stateName);
}
