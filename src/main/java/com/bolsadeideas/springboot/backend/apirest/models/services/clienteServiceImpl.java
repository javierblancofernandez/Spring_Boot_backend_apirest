package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.backend.apirest.models.dao.IClienteDao;
import com.bolsadeideas.springboot.backend.apirest.models.entity.cliente;

@Service
public class clienteServiceImpl implements IClienteServices {
	
	@Autowired
	private IClienteDao clienteDao;
	@Override
	@Transactional(readOnly=true)
	public List<cliente> findAll(){
		
		return (List<cliente>) clienteDao.findAll();
		
	}
	@Override
	public void saveAll(List<cliente> clientes) {
		// TODO Auto-generated method stub
		clienteDao.saveAll(clientes);
		
	}
	
	

}
