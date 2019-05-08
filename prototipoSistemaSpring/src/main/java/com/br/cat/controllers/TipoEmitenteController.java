package com.br.cat.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.cat.entities.TipoEmitente;
import com.br.cat.services.TipoEmitenteService;

@RestController
public class TipoEmitenteController {

	@Autowired
	private TipoEmitenteService tipoEmitenteService;
	
	
	@GetMapping("tipoEmitenteValido")
	public List<TipoEmitente> getListaTipoEmitenteValido(){
			return tipoEmitenteService.getListaTipoEmitenteValido();
	}
}
