package com.api.medica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.medica.dto.Clientes;
import com.api.medica.service.ClientesServiceImpl;

@RestController
@RequestMapping("/api")
public class ClienteController {

	@Autowired
	ClientesServiceImpl clienteServiceImpl;
	
	
	@GetMapping("/cliente")
	public List<Clientes> listarClientes() {
		return clienteServiceImpl.listarClientes();
	}
	
	@GetMapping("/cliente/{id}")
	public Clientes listarClientes(@PathVariable(name="id")String id) {
		return clienteServiceImpl.clienteXID(id);
	}
	
	@PutMapping("/cliente/{id}")
	public Clientes modCliente(@PathVariable(name="id")String id,@RequestBody Clientes cliente) {
		Clientes cliente_seleccionado = new Clientes();
		Clientes cliente_actualizado = new Clientes();
		
		cliente_seleccionado= clienteServiceImpl.clienteXID(id);
		
		cliente_seleccionado.setNomapels(cliente.getNomapels());
		cliente_seleccionado.setEmail(cliente.getEmail());
		
		cliente_actualizado = clienteServiceImpl.actualizarClientes(cliente_seleccionado);
		
		
		return cliente_actualizado;
	}
}