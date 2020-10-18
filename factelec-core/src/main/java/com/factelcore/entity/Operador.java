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
@Table( name = "OPERADOR")
public class Operador extends BaseObject implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="operador")
	@SequenceGenerator(name="operador", sequenceName="PK_ID_OPERADOR", allocationSize=1) 
	@Column(name="pk_ope_cod_ope")	
	private Integer id;
	
	@Column(name="ope_fec_baj")
	@Temporal(TemporalType.DATE)		
	private Date fechaBaja;

	@Column(name="ope_usu_act")
	private String usuarioAct;

	@Column(name="ope_fec_act")
	@Temporal(TemporalType.TIMESTAMP)	
	private Date fechaAct = new Date(System.currentTimeMillis());
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private Set<PerfilOperador> perfilOperador = new HashSet<PerfilOperador>();
	
	public Operador() {
		super();
	}

	public Operador(Integer id, String usuarioAct) {
		super();
		this.id = id;
		this.usuarioAct = usuarioAct;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Set<PerfilOperador> getPerfilOperador() {
		return perfilOperador;
	}

	public void setPerfilOperador(Set<PerfilOperador> perfilOperador) {
		this.perfilOperador = perfilOperador;
	}
	
	
}
