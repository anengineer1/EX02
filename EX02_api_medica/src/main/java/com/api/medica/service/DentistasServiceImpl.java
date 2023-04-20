package com.api.medica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.medica.dao.IDentistasDAO;
import com.api.medica.dto.Dentistas;

@Service
public class DentistasServiceImpl implements IDentistasService {
	
	@Autowired
	IDentistasDAO identistasDAO;

	@Override
	public List<Dentistas> listarDentistas() {
		return this.identistasDAO.findAll();
	}

	@Override
	public Dentistas guardarDentista(Dentistas dentista) {
		return identistasDAO.save(dentista);
	}

	@Override
	public Dentistas dentistaXID(String numreferencia) {
		return this.identistasDAO.findById(numreferencia).get();
	}

	@Override
	public Dentistas actualizarDentista(Dentistas dentista) {
		return this.identistasDAO.save(dentista);
	}

	@Override
	public void eliminarDentista(String id) {
		this.identistasDAO.deleteById(id);
	}

}
