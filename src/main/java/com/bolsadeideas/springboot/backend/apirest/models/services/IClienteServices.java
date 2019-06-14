package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.util.List;

import com.bolsadeideas.springboot.backend.apirest.models.entity.cliente;

public interface IClienteServices {

	public List<cliente> findAll();
}
