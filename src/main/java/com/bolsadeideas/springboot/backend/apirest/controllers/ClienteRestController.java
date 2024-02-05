package com.bolsadeideas.springboot.backend.apirest.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Contract;
import com.bolsadeideas.springboot.backend.apirest.models.entity.cliente;
import com.bolsadeideas.springboot.backend.apirest.models.services.IClienteServices;
import com.bolsadeideas.springboot.backend.apirest.models.services.IContractServices;

//@CrossOrigin(origins = {"http://localhost:4200"})
@CrossOrigin(origins = {"http://localhost:3306","*"})
@RestController
@RequestMapping("/api")
public class ClienteRestController {
	
	@Autowired
	private IClienteServices clienteService;
	@GetMapping("/clientes")
	public List<cliente> index(){
		
		return clienteService.findAll();
	}
	
	@Autowired
	private IContractServices contractService;
	@GetMapping("/contrato")
	public List<Contract> indexContract(){
		System.out.println("*** esto es lo que hay en contracts rest controller");
		return contractService.findAll();
	}
	
	@PostMapping("/clientes")
	@ResponseStatus(HttpStatus.CREATED)
	public void createcliente(@RequestBody List<cliente> clientes) {
		System.out.println("*** esto es lo que hay en contracts rest controller"+clientes);
		clienteService.saveAll(clientes);
	}
	
	@PostMapping("/contratos")
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody List<Contract> contracts) {
		System.out.println("*** esto es lo que hay en contracts rest controller"+contracts);
		contractService.saveAll(contracts);
	}
	@PostMapping("/contract")
	@ResponseStatus(HttpStatus.CREATED)
	public Contract create(@RequestBody Contract contract) {
		System.out.println("*** esto es lo que hay en contracts rest controller"+contract);
		return contractService.save(contract);
	}
	
	

}
