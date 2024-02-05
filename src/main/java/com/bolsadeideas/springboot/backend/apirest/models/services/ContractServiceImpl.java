package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.backend.apirest.models.dao.IContractDao;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Contract;


@Service
public class ContractServiceImpl implements IContractServices {
	
	@Autowired
	private IContractDao contratoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Contract> findAll() {
		// TODO Auto-generated method stub
		return (List<Contract>) contratoDao.findAll();
	}

	@Override
	@Transactional
	public void saveAll(List<Contract> contracts) {
		// TODO Auto-generated method stub
		System.out.println("*** esto es lo que hay en contracts"+contracts);
		contratoDao.saveAll(contracts);
	}
	
	@Override
	@Transactional
	public Contract save(Contract contract) {
		// TODO Auto-generated method stub
		System.out.println("*** esto es lo que hay en contracts"+contract);
		return contratoDao.save(contract);
	}


}
