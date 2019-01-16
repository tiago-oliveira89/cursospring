package com.kazale.pontointeligente.api.service;

import java.util.Optional;

import com.kazale.pontointeligente.api.entities.Empresa;

public interface EmpresaService {

	/***
	 * Retorna uma empresa por cnpj
	 * @param cnpj
	 * @return Optional<Empresa>
	 */
	Optional<Empresa> buscaPorCnpj(String cnpj);
	
	Empresa persistir(Empresa empresa);
}
