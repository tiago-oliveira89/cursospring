package com.br.cat.entities.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.br.cat.entities.RegistroCat;

@Transactional(readOnly=true)
public interface RegistroCatRepository extends JpaRepository<RegistroCat,Long> {
	List<RegistroCat> findByStatus(@Param("status") Long status);
	//RegistroCat findByTipoEmitenteId(@Param("tipoEmitenteId") Long tipoEmitenteId);
}
