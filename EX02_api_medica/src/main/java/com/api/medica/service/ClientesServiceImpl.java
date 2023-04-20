package com.api.medica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.medica.dao.IClientesDAO;
import com.api.medica.dto.Clientes;

@Service
public class ClientesServiceImpl implements IClientesService {

	@Autowired
	IClientesDAO iClientesDao;

	@Override
	public List<Clientes> listarClientes() { // GET
		return iClientesDao.findAll();
	}

	@Override
	public Clientes guardarCliente(Clientes cliente) { // POST
		return iClientesDao.save(cliente);
	}

	@Override
	public Clientes clienteXID(String id) { // GET
		return iClientesDao.findById(id).get();
	}

	@Override
	public Clientes actualizarClientes(Clientes cliente) { // PUT
		return iClientesDao.save(cliente);
	}

	@Override
	public void eliminarClientes(String id) { // DELETE
		iClientesDao.deleteById(id);
	}

}
