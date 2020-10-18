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
@Table( name = "SOLICITUD_GENERADA")
public class SolicitudGenerada extends BaseObject implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="solicitudGenerada")
	@SequenceGenerator(name="solicitudGenerada", sequenceName="PK_SGE_COD_GEN", allocationSize=1)
	@Column(name="pk_sge_cod_sol_gen")
	private Integer id;
	
	@Column(name="sge_nro_cor")
	private Integer numeroCor;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fk_sge_cod_sol_inf")
    private SolicitudInformacion solicitudInformacion;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fk_sge_usu")
    private Usuario usuario;
	
	@Column(name="sge_tip_sol")
	private String tipoSolicitud;
	
	@Column(name="sge_fec_sol")
	private Date fechaSol;
	
	@Column(name="sge_fec_gen")
	private Date fechaGen;
	
	@Column(name="sge_obs")
	private String observacion;
	
	@Column(name="sge_usu_act")
	private String usuarioAct;
	
	@Column(name="sge_fec_act")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaAct = new Date(System.currentTimeMillis());
	
	@ManyToOne(fetch=FetchType.LAZY)
    private DetalleSolicitudGenerada detalleSolicitudGenerada;
	
	public SolicitudGenerada() {
		super();
	}
	
	public SolicitudGenerada(Integer id, Integer numeroCor, SolicitudInformacion solicitudInformacion, Usuario usuario,
			String tipoSolicitud, Date fechaSol, Date fechaGen, String observacion, String usuarioAct) {
		super();
		this.id = id;
		this.numeroCor = numeroCor;
		this.solicitudInformacion = solicitudInformacion;
		this.usuario = usuario;
		this.tipoSolicitud = tipoSolicitud;
		this.fechaSol = fechaSol;
		this.fechaGen = fechaGen;
		this.observacion = observacion;
		this.usuarioAct = usuarioAct;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumeroCor() {
		return numeroCor;
	}

	public void setNumeroCor(Integer numeroCor) {
		this.numeroCor = numeroCor;
	}

	public String getTipoSolicitud() {
		return tipoSolicitud;
	}

	public void setTipoSolicitud(String tipoSolicitud) {
		this.tipoSolicitud = tipoSolicitud;
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

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public DetalleSolicitudGenerada getDetalleSolicitudGenerada() {
		return detalleSolicitudGenerada;
	}

	public void setDetalleSolicitudGenerada(DetalleSolicitudGenerada detalleSolicitudGenerada) {
		this.detalleSolicitudGenerada = detalleSolicitudGenerada;
	}
}
