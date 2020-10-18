package com.factelcore.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table( name = "FUNCIONALIDAD")
public class Funcionalidad extends BaseObject implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="funcionalidad")
	@SequenceGenerator(name="funcionalidad", sequenceName="PK_ID_FUNCIONALIDAD", allocationSize=1) 
	@Column(name="pk_fun_cod_fun")	
	private Integer id;
	
	@Column(name="fun_des_fun")
	private String descripcionFun;
	
	@Column(name="fun_cod_fun_pad")
	private Integer codigoPadre;
	
	@Column(name="fun_tip_nod")
	private Integer tipoNod;
	
	@Column(name="fun_fec_baj")
	@Temporal(TemporalType.DATE)		
	private Date fechaBaja;

	@Column(name="fun_usu_act")
	private String usuarioAct;

	@Column(name="fun_fec_act")
	@Temporal(TemporalType.TIMESTAMP)	
	private Date fechaAct = new Date(System.currentTimeMillis());
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private Set<PerfilFuncionalidad> perfilFuncionalidad = new HashSet<PerfilFuncionalidad>();
	
	public Funcionalidad() {
		super();
	}

	public Funcionalidad(Integer id, String descripcionFun, Integer codigoPadre, Integer tipoNod, String usuarioAct,
			Set<PerfilFuncionalidad> perfilFuncionalidad) {
		super();
		this.id = id;
		this.descripcionFun = descripcionFun;
		this.codigoPadre = codigoPadre;
		this.tipoNod = tipoNod;
		this.usuarioAct = usuarioAct;
		this.perfilFuncionalidad = perfilFuncionalidad;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescripcionFun() {
		return descripcionFun;
	}

	public void setDescripcionFun(String descripcionFun) {
		this.descripcionFun = descripcionFun;
	}

	public Integer getCodigoPadre() {
		return codigoPadre;
	}

	public void setCodigoPadre(Integer codigoPadre) {
		this.codigoPadre = codigoPadre;
	}

	public Integer getTipoNod() {
		return tipoNod;
	}

	public void setTipoNod(Integer tipoNod) {
		this.tipoNod = tipoNod;
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

	public Set<PerfilFuncionalidad> getPerfilFuncionalidad() {
		return perfilFuncionalidad;
	}

	public void setPerfilFuncionalidad(Set<PerfilFuncionalidad> perfilFuncionalidad) {
		this.perfilFuncionalidad = perfilFuncionalidad;
	}
}
