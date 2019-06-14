package com.bolsadeideas.springboot.backend.apirest.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bolsadeideas.springboot.backend.apirest.models.entity.cliente;
import com.bolsadeideas.springboot.backend.apirest.models.services.IClienteServices;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ClienteRestController {
	
	@Autowired
	private IClienteServices clienteService;
	@GetMapping("/clientes")
	public List<cliente> index(){
		
		return clienteService.findAll();
	}
	
	

}
