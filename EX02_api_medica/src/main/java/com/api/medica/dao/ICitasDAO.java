package com.api.medica.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.medica.dto.Citas;
import com.api.medica.dto.Clientes;

/**
 * @author Francisco
 *
 */
public interface ICitasDAO extends JpaRepository<Citas, Long>{

	List<Citas> findByCliente(Clientes cliente);

}