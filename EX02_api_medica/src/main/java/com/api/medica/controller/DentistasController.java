package com.api.medica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.medica.dto.Citas;
import com.api.medica.dto.Clientes;
import com.api.medica.dto.Dentistas;
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
	
	@GetMapping("/dentista")
	public List<Dentistas> listarDentistas() {
		return dentistaServiceImpl.listarDentistas();
	}
	
	@GetMapping("/dentista/{id}")
	public Dentistas listarDentista(@PathVariable(name="id")String id) {
		return dentistaServiceImpl.dentistaXID(id);
	}
	
	@GetMapping("/dentista/clientes")
	public List<Clientes> listarClientes() {
		return clienteServiceImpl.listarClientes();
	}
	
	@GetMapping("/dentista/citas")
	public List<Citas> listarCitas() {
		return citasServiceImpl.listarCitas();
	}
	
	@PostMapping("/dentista")
	public Dentistas salvarDentista(@RequestBody Dentistas dentista) {
		
		return dentistaServiceImpl.guardarDentista(dentista);
	}
	
	@DeleteMapping("/dentista/{id}")
	public void eliminarDentista(@PathVariable(name="id")String id) {
		dentistaServiceImpl.eliminarDentista(id);
	}
	
	@PutMapping("/dentista/{id}")
	public Dentistas actualizarDentista(@PathVariable(name="id")String id,@RequestBody Dentistas dentista) {
		
		Dentistas dentista_seleccionada= new Dentistas();
		Dentistas dentista_actualizada= new Dentistas();
		
		dentista_seleccionada= dentistaServiceImpl.dentistaXID(id);
		
		dentista_seleccionada.setNomapels(dentista.getNomapels());
		dentista_seleccionada.setEmail(dentista.getEmail());
		
		dentista_actualizada = dentistaServiceImpl.actualizarDentista(dentista_seleccionada);
		
		return dentista_actualizada;
	}
}
