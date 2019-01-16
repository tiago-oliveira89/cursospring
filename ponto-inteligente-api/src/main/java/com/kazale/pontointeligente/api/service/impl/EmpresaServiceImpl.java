package com.kazale.pontointeligente.api.service.impl;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kazale.pontointeligente.api.entities.Empresa;
import com.kazale.pontointeligente.api.repositories.EmpresaRepository;
import com.kazale.pontointeligente.api.service.EmpresaService;

@Service
public class EmpresaServiceImpl implements EmpresaService {
	
	@Autowired
	private EmpresaRepository empresaRepository;

	@Override
	public Optional<Empresa> buscaPorCnpj(String cnpj) {
		System.out.println("Buscando empresa para o CNPJ:"+cnpj);
		return Optional.ofNullable(empresaRepository.findByCnpj(cnpj));
	}

	@Override
	public Empresa persistir(Empresa empresa) {
		System.out.println("Persistindo empresa :" + empresa);
		return this.empresaRepository.save(empresa);
	}
}
