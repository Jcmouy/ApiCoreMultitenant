package com.factelcore.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="perfil_funcionalidad")
@IdClass(PerfilFuncionalidadId.class)
public class PerfilFuncionalidad extends BaseObject implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="pk_fk_pfu_cod_fun")
	private Integer uid;
	
	@Id
	@Column(name="pk_fk_pfu_cod_per")
	private Integer idPerfil;
	
	@Column(name="pfu_fec_baj")
	@Temporal(TemporalType.DATE)
	private Date fechaBaja;
	
	@Column(name="pfu_usu_act")
	private String usuarioAct;
	
	@Column(name="pfu_fec_act")
	@Temporal(TemporalType.TIMESTAMP)	
	private Date fechaAct = new Date(System.currentTimeMillis());
	 
	@ManyToOne
	@JoinColumn(name="pk_fk_pfu_cod_fun", referencedColumnName="pk_fun_cod_fun",insertable=false,updatable=false)
	private Funcionalidad funcionalidad;
	
	public PerfilFuncionalidad() {
		super();
	}

	public PerfilFuncionalidad(String usuarioAct, Funcionalidad funcionalidad) {
		super();
		//Set fields
		this.usuarioAct = usuarioAct;
		this.funcionalidad = funcionalidad;
		
		//Set identifier values
		this.uid = funcionalidad.getId();
		
		//Guarantee referential integrity
		funcionalidad.getPerfilFuncionalidad().add(this);
	}
	
	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Integer getIdPerfil() {
		return idPerfil;
	}

	public void setIdPerfil(Integer idPerfil) {
		this.idPerfil = idPerfil;
	}

	public Date getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	public String getUsuarioAct() {
		return usuarioAct;
	}

	public void setUsuarioAct(String usuarioAct) {
		this.usuarioAct = usuarioAct;
	}

	public Date getFechaAct() {
		return fechaAct;
	}

	public void setFechaAct(Date fechaAct) {
		this.fechaAct = fechaAct;
	}

	public Funcionalidad getFuncionalidad() {
		return funcionalidad;
	}

	public void setFuncionalidad(Funcionalidad funcionalidad) {
		this.funcionalidad = funcionalidad;
	}
}
