package com.api.medica.service;

import java.util.List;

import com.api.medica.dto.Citas;

public interface ICitasService {
	// Metodos del CRUD
	public List<Citas> listarCitas(); // Listar All

	public Citas guardarCita(Citas cita); // CREATE

	public Citas citaXID(long id); // READ
	
	public Citas actualizarCita(Citas cita); // UPDATE

	public void eliminarCita(long id);// DELETE
	
}