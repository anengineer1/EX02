package com.api.medica.service;

import java.util.List;

import com.api.medica.dto.Citas;
import com.api.medica.dto.Clientes;

public interface ICitasService {
	// Metodos del CRUD
	public List<Citas> listarCitas(); // Listar All
	
	public List<Citas> listarCitasXClientes(Clientes cliente); // READ

	public Citas guardarCita(Citas cita); // CREATE

	public Citas citaXID(long id); // READ
	
	public Citas actualizarCita(Citas cita); // UPDATE

	public void eliminarCita(long id);// DELETE
	
}