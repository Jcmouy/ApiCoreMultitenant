package com.factelcore.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table( name = "USUARIO_SOLICITUD_INFO")
@IdClass(UsuarioSolicitudInfo.class)
public class UsuarioSolicitudInfo extends BaseObject implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="usuarioSolicitudInfo")
	@SequenceGenerator(name="usuarioSolicitudInfo", sequenceName="PK_ID_USUSOL_INFO", allocationSize=1)
	@Column(name="pk_fk_usi_usu")
	private Integer id;
	
	@Id
	@JoinColumn(name="pk_fk_usi_cod_sol_inf", insertable=false, updatable=false)
	@ManyToOne(fetch=FetchType.LAZY)
	private SolicitudInformacion idSolInf;
	
	@Column(name="usi_fec_baj")
	@Temporal(TemporalType.DATE)
	private Date fechaBaja;
	
	@Column(name="usi_usu_act")
	private String usuarioAct;
	
	@Column(name="usi_fec_act")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaAct = new Date(System.currentTimeMillis());
	
	public UsuarioSolicitudInfo() {
		super();
	}

	public UsuarioSolicitudInfo(Integer id, SolicitudInformacion idSolInf, String usuarioAct) {
		super();
		this.id = id;
		this.idSolInf = idSolInf;
		this.usuarioAct = usuarioAct;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public SolicitudInformacion getIdSolInf() {
		return idSolInf;
	}

	public void setIdSolInf(SolicitudInformacion idSolInf) {
		this.idSolInf = idSolInf;
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
	
}
