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
		
		Citas almacen_seleccionado= new Citas();
		Citas almacen_actualizado= new Citas();
		
		almacen_seleccionado= citasServiceImpl.citaXID(id);
		
		almacen_seleccionado.setFecha(cita.getFecha());
		almacen_seleccionado.setCliente(cita.getCliente());
		almacen_seleccionado.setDentista(cita.getDentista());
		
		almacen_actualizado = citasServiceImpl.actualizarCita(almacen_seleccionado);
		
		return almacen_actualizado;
	}
	
	@DeleteMapping("/citas/{id}")
	public void eliminarCitas(@PathVariable(name="id")long id) {
		citasServiceImpl.eliminarCita(id);
	}

}
