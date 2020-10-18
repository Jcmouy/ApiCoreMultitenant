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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table( name = "DETALLE_SOLICITUD_GENERADA")
public class DetalleSolicitudGenerada extends BaseObject implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@JoinColumn(name="fk_csg_cod_sol_gen", referencedColumnName="pk_sge_cod_sol_gen",insertable=false,updatable=false)
	@ManyToOne(cascade={CascadeType.PERSIST,CascadeType.MERGE})
	private SolicitudGenerada codSolGen;
	
	@Column(name="csg_nro_cte")
	private String nroCuenta;
	
	@Column(name="csg_fec_sol")
	@Temporal(TemporalType.DATE)
	private Date fechaSol;
	
	@Column(name="csg_fec_gen")
	@Temporal(TemporalType.DATE)
	private Date fechaGen;
	
	@Column(name="csg_nro_cor")
	private Integer nroCor;
	
	@Column(name="csg_obs")
	private String observaciones;
	
	@Column(name="csg_usu_act")
	private String usuarioAct;
	
	@Column(name="csg_fec_act")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaAct = new Date(System.currentTimeMillis());
	
	public DetalleSolicitudGenerada() {
		super();
	}

	public DetalleSolicitudGenerada(SolicitudGenerada codSolGen, String nroCuenta, Date fechaSol, Date fechaGen, Integer nroCor,
			String observaciones, String usuarioAct) {
		super();
		this.codSolGen = codSolGen;
		this.nroCuenta = nroCuenta;
		this.fechaSol = fechaSol;
		this.fechaGen = fechaGen;
		this.nroCor = nroCor;
		this.observaciones = observaciones;
		this.usuarioAct = usuarioAct;
	}
	
	public SolicitudGenerada getCodSolGen() {
		return codSolGen;
	}

	public void setCodSolGen(SolicitudGenerada codSolGen) {
		this.codSolGen = codSolGen;
	}

	public String getNroCuenta() {
		return nroCuenta;
	}

	public void setNroCuenta(String nroCuenta) {
		this.nroCuenta = nroCuenta;
	}

	public Date getFechaSol() {
		return fechaSol;
	}

	public void setFechaSol(Date fechaSol) {
		this.fechaSol = fechaSol;
	}

	public Date getFechaGen() {
		return fechaGen;
	}

	public void setFechaGen(Date fechaGen) {
		this.fechaGen = fechaGen;
	}

	public Integer getNroCor() {
		return nroCor;
	}

	public void setNroCor(Integer nroCor) {
		this.nroCor = nroCor;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
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
