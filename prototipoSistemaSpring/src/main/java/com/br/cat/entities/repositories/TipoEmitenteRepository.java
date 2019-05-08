package com.br.cat.entities.repositories;

import java.util.List;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.br.cat.entities.TipoEmitente;
import java.lang.Long;


@Transactional(readOnly=true)
@NamedQueries({
	@NamedQuery(name = "TipoEmitenteRepository.findByTipoEmitenteIdStatus", 
			query = "select t from TipoEmitente t where t.idStatus=:status")})
public interface TipoEmitenteRepository extends JpaRepository<TipoEmitente, Long>  {
	
	List<TipoEmitente> findByIdStatus(@Param("status") Long status);
	
}
