package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.State;

public interface StateRepo extends JpaRepository<State, Long> {

	State findByName(String stateName);

}
