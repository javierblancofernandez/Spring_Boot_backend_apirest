package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.util.List;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Contract;

public interface IContractServices {
	
	
	public List<Contract> findAll();

	public void saveAll(List<Contract> contracts);
	
	public Contract save(Contract contract);

}
