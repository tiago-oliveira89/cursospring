package com.br.cat.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_CAT_REGISTRO",schema="rh_cat")
public class RegistroCat {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDENT", nullable = false)
	protected Long id;
	
	@Column(name="ID_TIPO_EMITENTE")
	private Long idTipoEmitente;
	
	@OneToOne(targetEntity = TipoEmitente.class, cascade = CascadeType.REFRESH)
	@JoinColumn(name = "ID_TIPO_EMITENTE", nullable = false, insertable = false, updatable = false)
	private TipoEmitente tipoEmitente;
	
	@Column(name = "DT_EMISSAO")
	@Temporal(TemporalType.DATE)
	private Date dataEmissao;
	
	@Column(name="ID_EMITENTE")
	private Long idEmitente;

	@Column(name="STATUS")
	private Long status;

	@Column(name = "DT_INCLUSAO")
	@Temporal(TemporalType.DATE)
	private Date dataInclusao;
	
	@Column(name = "DT_ALTERACAO")
	@Temporal(TemporalType.DATE)
	private Date dataAlteracao;

	@Column(name="ID_TIPO_CAT")
	private Long idTipoCat;
	
	
	@Column(name="ID_FUNC_ALTERACAO")
	private Long idFuncAlteracao;
	
	@Column(name="ID_INICIATIVA_CAT")
	private Long idIniciativaCat;
	
	@PrePersist
	public void prePersist() {
		dataEmissao = new Date();
		dataInclusao = new Date();
	}
	
	@PreUpdate
	public void preUpdate() {
		dataAlteracao = new Date();
	}

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

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
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

	public Date getDataInclusao() {
		return dataInclusao;
	}

	public void setDataInclusao(Date dataInclusao) {
		this.dataInclusao = dataInclusao;
	}

	public Date getDataAlteracao() {
		return dataAlteracao;
	}

	public void setDataAlteracao(Date dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
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
