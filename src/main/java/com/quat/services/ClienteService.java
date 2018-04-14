package com.quat.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quat.dao.ClienteDAO;
import com.quat.dto.ClienteDTO;

@Service
public class ClienteService {
	@Autowired
	ClienteDAO clienteDAO;

	public ClienteDTO CrearCliente(String nombre, String correo) {
		ClienteDTO cliente = new ClienteDTO();
		cliente.setCorreo(correo);
		cliente.setNombre(nombre);
		clienteDAO.save(cliente);
		return cliente;
	}
}
