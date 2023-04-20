package com.api.medica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.medica.dto.Clientes;

/**
 * @author Francisco
 *
 */
public interface IClientesDAO extends JpaRepository<Clientes, String>{

}
