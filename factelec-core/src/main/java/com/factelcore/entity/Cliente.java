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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table( name = "CLIENTES")
public class Cliente extends BaseObject implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cliente")
	@SequenceGenerator(name="cliente", sequenceName="PK_ID_CLIENTE", allocationSize=1)
	@Column(name="pk_fk_cli_nro_cli")
	private Integer id;
	
	@JoinColumn(name="fk_cli_cod_sol_ser")
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<SolicitudServicio> solicitudesServicio = new ArrayList<>(); 
	
	@Column(name="cli_fec_baj")
	@Temporal(TemporalType.DATE)
	private Date fechaBaja;
	
	@Column(name="cli_usu_act")
	private String usuarioAct;
	
	@Column(name="cli_fec_act")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaAct = new Date(System.currentTimeMillis());
	
	public Cliente() {
		super();
	}
	
	public Cliente(Integer id, List<SolicitudServicio> solicitudesServicio, String usuarioAct) {
		super();
		this.id = id;
		this.solicitudesServicio = solicitudesServicio;
		this.usuarioAct = usuarioAct;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<SolicitudServicio> getSolicitudesServicio() {
		return solicitudesServicio;
	}

	public void setSolicitudesServicio(List<SolicitudServicio> solicitudesServicio) {
		this.solicitudesServicio = solicitudesServicio;
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

	public void addSolicitudServicio(SolicitudServicio solicitudServicio) {
		solicitudesServicio.add(solicitudServicio);
		solicitudServicio.setCliente(this);
    }
 
    public void removeComment(SolicitudServicio solicitudServicio) {
    	solicitudesServicio.remove(solicitudServicio);
    	solicitudServicio.setCliente(null);
    }

}
