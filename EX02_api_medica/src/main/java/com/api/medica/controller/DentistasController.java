package com.api.medica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.medica.dto.Citas;
import com.api.medica.dto.Clientes;
import com.api.medica.service.CitasServiceImpl;
import com.api.medica.service.ClientesServiceImpl;
import com.api.medica.service.DentistasServiceImpl;

@RestController
@RequestMapping("/api")
public class DentistasController {

	@Autowired
	DentistasServiceImpl dentistaServiceImpl;
	
	@Autowired
	ClientesServiceImpl clienteServiceImpl;
	
	@Autowired
	CitasServiceImpl citasServiceImpl;
	
	@GetMapping("/dentista/clientes")
	public List<Clientes> listarClientes() {
		return clienteServiceImpl.listarClientes();
	}
	
	@GetMapping("/dentista/citas")
	public List<Citas> listarCitas() {
		return citasServiceImpl.listarCitas();
	}
}
