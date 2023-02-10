package com.arnaud.projet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arnaud.projet.model.Travel;

public interface TravelDaoJpa extends JpaRepository<Travel, Long>{

}