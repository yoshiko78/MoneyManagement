package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Moneydata;

@Repository
public interface MoneyRepository extends JpaRepository <Moneydata, Long>
{
	Moneydata findOne(Integer id);
	void delete(Integer id);
}
