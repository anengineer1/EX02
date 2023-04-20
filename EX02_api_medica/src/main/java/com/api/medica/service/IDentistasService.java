package com.api.medica.service;

import java.util.List;

import com.api.medica.dto.Dentistas;

public interface IDentistasService {

	// Metodos del CRUD
	public List<Dentistas> listarDentistas(); // Listar All

	public Dentistas guardarDentista(Dentistas caja); // CREATE

	public Dentistas dentistaXID(String numreferencia); // READ
	
	public Dentistas actualizarDentista(Dentistas almacen); // UPDATE

	public void eliminarDentista(String id);// DELETE
	
}
