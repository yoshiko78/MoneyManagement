package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Moneydata;
import com.example.demo.repository.MoneyRepository;

@Service
public class MoneyService {

	@Autowired
	private MoneyRepository moneyRepository;

	public List<Moneydata> findAll(){
		return moneyRepository.findAll();
	}

	public Moneydata findOne(Integer id) {
		return moneyRepository.findOne(id);
	}

	public Moneydata save(Moneydata moneydata) {
		return moneyRepository.save(moneydata);
	}

	public void delete(Integer id) {
		moneyRepository.delete(id);
	}

}
