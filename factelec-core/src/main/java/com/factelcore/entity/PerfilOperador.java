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
@Table(name="perfil_operador")
@IdClass(PerfilOperadorId.class)
public class PerfilOperador extends BaseObject implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="pk_fk_pop_cod_ope")
	private Integer uid;
	
	@Id
	@Column(name="pk_fk_pop_cod_per")
	private Integer idPerfil;
	
	@Column(name="pop_fec_baj")
	@Temporal(TemporalType.DATE)
	private Date fechaBaja;
	
	@Column(name="pop_usu_act")
	private String usuarioAct;
	
	@Column(name="pop_fec_act")
	@Temporal(TemporalType.TIMESTAMP)	
	private Date fechaAct = new Date(System.currentTimeMillis());
	 
	@ManyToOne
	@JoinColumn(name="pk_fk_pop_cod_ope", referencedColumnName="pk_ope_cod_ope",insertable=false,updatable=false)
	private Operador operador;
	
	public PerfilOperador() {
		super();
	}

	public PerfilOperador(String usuarioAct, Operador operador) {
		super();
		//Set fields
		this.usuarioAct = usuarioAct;
		this.operador = operador;
		
		//Set identifier values
		this.uid = operador.getId();
		
		//Guarantee referential integrity
		operador.getPerfilOperador().add(this);
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

	public Operador getOperador() {
		return operador;
	}

	public void setOperador(Operador operador) {
		this.operador = operador;
	}
}
