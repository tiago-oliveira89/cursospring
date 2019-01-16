package com.example.hello.entidades;

import javax.persistence.NamedQuery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;


@NamedQuery(name="TipoEmitenteRepository.listarTodos",query = "select t from TipoEmitente t")
public interface TipoEmitenteRepository extends JpaRepository<TipoEmitente, Long> {
	
	//como é só consulta não cria uma transação
	@Transactional(readOnly=true)
	TipoEmitente findByDescricao(String descricao);
	
	
	

}
