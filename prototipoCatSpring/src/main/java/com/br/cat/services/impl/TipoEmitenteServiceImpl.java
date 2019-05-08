package com.br.cat.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.cat.entities.TipoEmitente;
import com.br.cat.entities.repositories.TipoEmitenteRepository;
import com.br.cat.services.TipoEmitenteService;

@Service
public class TipoEmitenteServiceImpl implements TipoEmitenteService{

	@Autowired
	private TipoEmitenteRepository tipoEmitenteRepository;
	
	@Override
	public List<TipoEmitente> getListaTipoEmitenteValido() {
		return tipoEmitenteRepository.findByIdStatus(1l);
	}

}
