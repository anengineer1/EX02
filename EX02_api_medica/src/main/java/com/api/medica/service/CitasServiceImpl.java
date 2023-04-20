package com.api.medica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.medica.dao.ICitasDAO;
import com.api.medica.dto.Citas;

@Service
public class CitasServiceImpl implements ICitasService {
	
	@Autowired
	ICitasDAO iCitasDAO;
	
	@Override
	public List<Citas> listarCitas() { // GET
		return this.iCitasDAO.findAll();
	}

	@Override
	public Citas guardarCita(Citas cita) { // POST
		return this.iCitasDAO.save(cita);
	}

	@Override
	public Citas citaXID(long id) { // GET
		return this.iCitasDAO.findById(id).get();
	}

	@Override
	public Citas actualizarCita(Citas cita) {
		return this.iCitasDAO.save(cita);
	}

	@Override
	public void eliminarCita(long id) {
		this.iCitasDAO.deleteById(id);
	}

}