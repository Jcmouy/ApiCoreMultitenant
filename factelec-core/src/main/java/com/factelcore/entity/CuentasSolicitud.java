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
@Table( name = "CUENTAS_SOLICITUD")
@IdClass(CuentasSolicitudId.class)
public class CuentasSolicitud extends BaseObject implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cuentasSolicitud")
	@SequenceGenerator(name="cuentasSolicitud", sequenceName="PK_CSO_CUENTA", allocationSize=1)
	@Column(name="pk_cso_nro_cue")
	private Integer uid;
	
	@Id
	@Column(name="pk_fk_cso_cod_sol_inf")
	private Integer idSolInf;
	
	@Column(name="cli_fec_baj")
	@Temporal(TemporalType.DATE)
	private Date fechaBaja;
	
	@Column(name="cli_usu_act")
	private String usuarioAct;
	
	@Column(name="cli_fec_act")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaAct = new Date(System.currentTimeMillis());
	
	@JoinColumn(name="pk_fk_cso_cod_sol_inf", insertable=false, updatable=false)
	@ManyToOne(fetch=FetchType.LAZY)
	private SolicitudInformacion solicitudInformacion;
	
	public CuentasSolicitud() {
		super();
	}

	public CuentasSolicitud(Integer uid, Integer idSolInf, String usuarioAct,
			SolicitudInformacion solicitudInformacion) {
		super();
		this.uid = uid;
		this.idSolInf = idSolInf;
		this.usuarioAct = usuarioAct;
		this.solicitudInformacion = solicitudInformacion;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Integer getIdSolInf() {
		return idSolInf;
	}

	public void setIdSolInf(Integer idSolInf) {
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

	public SolicitudInformacion getSolicitudInformacion() {
		return solicitudInformacion;
	}

	public void setSolicitudInformacion(SolicitudInformacion solicitudInformacion) {
		this.solicitudInformacion = solicitudInformacion;
	}

}
