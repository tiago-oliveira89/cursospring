package com.br.cat.dtos;

import javax.validation.constraints.NotNull;

public class RegistroCatDto {

	private Long id;
	
	@NotNull(message="id do tipo Emitente não pode ser vazio")
	private Long idTipoEmitente;
	private Long idEmitente;
	private Long status;
	@NotNull(message="id do tipo da cat não pode ser vazio")	
	private Long idTipoCat;
	private Long idFuncAlteracao;
	@NotNull(message="id iniciativa cat não pode ser vazio")
	private Long idIniciativaCat;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getIdTipoEmitente() {
		return idTipoEmitente;
	}
	public void setIdTipoEmitente(Long idTipoEmitente) {
		this.idTipoEmitente = idTipoEmitente;
	}
	public Long getIdEmitente() {
		return idEmitente;
	}
	public void setIdEmitente(Long idEmitente) {
		this.idEmitente = idEmitente;
	}
	public Long getStatus() {
		return status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}
	public Long getIdTipoCat() {
		return idTipoCat;
	}
	public void setIdTipoCat(Long idTipoCat) {
		this.idTipoCat = idTipoCat;
	}
	public Long getIdFuncAlteracao() {
		return idFuncAlteracao;
	}
	public void setIdFuncAlteracao(Long idFuncAlteracao) {
		this.idFuncAlteracao = idFuncAlteracao;
	}
	public Long getIdIniciativaCat() {
		return idIniciativaCat;
	}
	public void setIdIniciativaCat(Long idIniciativaCat) {
		this.idIniciativaCat = idIniciativaCat;
	}
	
}
