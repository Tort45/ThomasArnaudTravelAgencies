package com.arnaud.projet.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arnaud.projet.model.Agency;
import com.arnaud.projet.model.Travel;

public interface AgencyDaoJpa extends JpaRepository<Agency, Long>{


}