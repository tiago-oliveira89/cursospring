package com.br.cat.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.cat.dtos.RegistroCatDto;
import com.br.cat.entities.RegistroCat;
import com.br.cat.response.Response;
import com.br.cat.services.RegistroCatService;

@RestController
@RequestMapping("/api-cat/registro-cat")
public class RegistroCatController {
	
	@Autowired
	private RegistroCatService registroCatService;
	
	//com variável de path	
	@GetMapping("idStatus/{idStatus}")
	public List<RegistroCat> getCatsByIdStatus(@PathVariable Long idStatus) {
		return registroCatService.getCatByIdStatus(idStatus);
	}
	
	@PostMapping
	public ResponseEntity<Response<RegistroCatDto>> cadastrar(@Valid @RequestBody RegistroCatDto registroCatDto,BindingResult result){
		Response<RegistroCatDto> response = new Response<RegistroCatDto>();
		//passo 1 converter o dto para entity
		RegistroCat registroCat = converterDtoParaCat(registroCatDto, result);
		if(result.hasErrors()) {
			result.getAllErrors().forEach(erro -> response.getErrors().add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(response);
		}
		return ResponseEntity.ok(response);
	}
	
	private RegistroCat converterDtoParaCat(RegistroCatDto dto,BindingResult result) {
		RegistroCat registro = new RegistroCat();		
		registro.setIdEmitente(dto.getIdEmitente());
		registro.setIdFuncAlteracao(dto.getIdFuncAlteracao());
		registro.setIdIniciativaCat(dto.getIdIniciativaCat());
		registro.setIdTipoCat(dto.getIdTipoCat());
		registro.setIdTipoEmitente(dto.getIdTipoEmitente());
		return registro;
	}

}
