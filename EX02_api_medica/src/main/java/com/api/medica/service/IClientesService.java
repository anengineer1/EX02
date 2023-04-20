package com.api.medica.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.api.medica.dto.Clientes;

public interface IClientesService {
	// Metodos del CRUD
	public List<Clientes> listarClientes(); // Listar All

	public Clientes guardarCliente(Clientes cliente); // CREATE

	public Clientes clienteXID(String id); // READ
	
	public Clientes actualizarClientes(Clientes cliente); // UPDATE

	public void eliminarClientes(String id);// DELETE
	
}