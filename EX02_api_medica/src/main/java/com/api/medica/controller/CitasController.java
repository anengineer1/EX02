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

import com.api.medica.service.CitasServiceImpl;
import com.api.medica.service.ClientesServiceImpl;
import com.api.medica.dto.Citas;

@RestController
@RequestMapping("/api")
public class CitasController {
	
	@Autowired
	CitasServiceImpl citasServiceImpl;
	
	@Autowired
	ClientesServiceImpl clientesServiceImpl;
	
	@GetMapping("/citas")
	public List<Citas> listarCitas(){
		return citasServiceImpl.listarCitas();
	}
	
	@PostMapping("/citas")
	public Citas salvarCitas(@RequestBody Citas departamento) {
		
		return citasServiceImpl.guardarCita(departamento);
	}
	
	@GetMapping("/citas/{id}")
	public Citas citaXID(@PathVariable(name="id") long id) {
		
		Citas almacen_xid = new Citas();
		
		almacen_xid = citasServiceImpl.citaXID(id);
		
		return almacen_xid;
	}
	
	@GetMapping("/citas/cliente/{id}")
	public List<Citas> citaXusuarioID(@PathVariable(name="id") String id) {

		return citasServiceImpl.listarCitasXClientes(clientesServiceImpl.clienteXID(id));
	}
	
	@PutMapping("/citas/{id}")
	public Citas actualizarCita(@PathVariable(name="id")long id,@RequestBody Citas cita) {
		
		Citas cita_seleccionada= new Citas();
		Citas cita_actualizada= new Citas();
		
		cita_seleccionada= citasServiceImpl.citaXID(id);
		
		cita_seleccionada.setFecha(cita.getFecha());
		cita_seleccionada.setDescripcion(cita.getDescripcion());
		cita_seleccionada.setCliente(cita.getCliente());
		cita_seleccionada.setDentista(cita.getDentista());
		
		cita_actualizada = citasServiceImpl.actualizarCita(cita_seleccionada);
		
		return cita_actualizada;
	}
	
	@DeleteMapping("/citas/{id}")
	public void eliminarCitas(@PathVariable(name="id")long id) {
		citasServiceImpl.eliminarCita(id);
	}

}
