package com.example.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hello.entidades.TipoEmitente;
import com.example.hello.entidades.TipoEmitenteRepository;

@RestController
public class TipoEmitenteControler {

	@Autowired
	private TipoEmitenteRepository tipoEmitenteRepository;
	
	@RequestMapping("findByDescricao")
	public TipoEmitente testeSalvarEntidade() {
			TipoEmitente findByDescricao = tipoEmitenteRepository.findByDescricao("Sindicato");
			return findByDescricao;
	}
}
