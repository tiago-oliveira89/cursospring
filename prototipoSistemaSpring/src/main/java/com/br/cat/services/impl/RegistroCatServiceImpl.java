package com.br.cat.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.cat.entities.RegistroCat;
import com.br.cat.entities.repositories.RegistroCatRepository;
import com.br.cat.services.RegistroCatService;

@Service
public class RegistroCatServiceImpl implements RegistroCatService{

	@Autowired
	private RegistroCatRepository repository;
	
	@Override
	public List<RegistroCat> getCatByIdStatus(Long idStatus) {
		return repository.findByStatus(idStatus);
	}

}
