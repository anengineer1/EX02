package com.api.medica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.medica.dto.Citas;

/**
 * @author Francisco
 *
 */
public interface ICitasDAO extends JpaRepository<Citas, Long>{

}