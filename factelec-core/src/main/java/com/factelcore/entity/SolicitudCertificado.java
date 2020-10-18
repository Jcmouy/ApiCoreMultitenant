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
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.factelcore.enumeration.EstadoTypes;

@Entity
@Table( name = "SOLICITUD_CERTIFICADO")
public class SolicitudCertificado extends BaseObject implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="solicitudCertificado")
	@SequenceGenerator(name="solicitudCertificado", sequenceName="PK_SCE_USU", allocationSize=1)
	@Column(name="pk_fk_sce_usu")
	private Integer id;
	
	@Column(name="fk_sce_cod_est", nullable = false)	
	@Enumerated(value=EnumType.ORDINAL)
	private EstadoTypes estado;
	
	@Column(name="sce_usu_act")
	private String usuarioAct;
	
	@Column(name="sce_fec_act")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaAct = new Date(System.currentTimeMillis());
	
	public SolicitudCertificado() {
		super();
	}

	public SolicitudCertificado(Integer id, EstadoTypes estado, String usuarioAct) {
		super();
		this.id = id;
		this.estado = estado;
		this.usuarioAct = usuarioAct;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public EstadoTypes getEstado() {
		return estado;
	}

	public void setEstado(EstadoTypes estado) {
		this.estado = estado;
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
