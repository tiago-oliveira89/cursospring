package com.br.cat.services;

import java.util.List;

import com.br.cat.entities.RegistroCat;

public interface RegistroCatService {
	
	public List<RegistroCat> getCatByIdStatus(Long idStatus);

}
