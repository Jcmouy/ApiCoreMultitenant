package com.factelcore.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table( name = "PERFIL")
public class Perfil extends BaseObject implements Serializable{

	private static final long serialVersionUID = 98566277239689110L;

	@Id
	@Column(name="pk_per_cod_per")
	private Integer id;
	
	@Column(name="per_des_per")
	private String descripcion;
	
	@Column(name="per_fec_baj")
	@Temporal(TemporalType.DATE)
	private Date fechaBaja;
	
	@Column(name="per_usu_act")
	private String usuarioAct;
	
	@Column(name="per_fec_act")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaAct = new Date(System.currentTimeMillis());

	@OneToMany(fetch=FetchType.LAZY)
	private Set<PerfilUsuario> usuarios = new HashSet<PerfilUsuario>();
	
	public Perfil() {
		super();
	}

	public Perfil(Integer id, String descripcion,
			String usuarioAct, Set<PerfilUsuario> usuarios) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.usuarioAct = usuarioAct;
		this.usuarios = usuarios;
	}

	/**
	 * M�todo de acceso a la propiedad "id"
	 * @return id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * M�todo modificador de la propiedad "id"
	 * @param id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * M�todo de acceso a la propiedad "descripcion"
	 * @return descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * M�todo modificador de la propiedad "descripcion"
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * M�todo de acceso a la propiedad "fechaBaja"
	 * @return fechaBaja
	 */
	public Date getFechaBaja() {
		return fechaBaja;
	}

	/**
	 * M�todo modificador de la propiedad "fechaBaja"
	 * @param fechaBaja
	 */
	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	/**
	 * M�todo de acceso a la propiedad "usuarioAct"
	 * @return usuarioAct
	 */
	public String getUsuarioAct() {
		return usuarioAct;
	}

	/**
	 * M�todo modificador de la propiedad "usuarioAct"
	 * @param usuarioAct
	 */
	public void setUsuarioAct(String usuarioAct) {
		this.usuarioAct = usuarioAct;
	}

	/**
	 * M�todo de acceso a la propiedad "fechaAct"
	 * @return fechaAct
	 */
	public Date getFechaAct() {
		return fechaAct;
	}

	/**
	 * M�todo modificador de la propiedad "fechaAct"
	 * @param fechaAct
	 */
	public void setFechaAct(Date fechaAct) {
		this.fechaAct = fechaAct;
	}

	/**
	 * M�todo de acceso a la propiedad "usuarios"
	 * @return usuarios
	 */
	public Set<PerfilUsuario> getUsuarios() {
		return usuarios;
	}

	/**
	 * M�todo modificador de la propiedad "usuarios"
	 * @param usuarios
	 */
	public void setUsuarios(Set<PerfilUsuario> usuarios) {
		this.usuarios = usuarios;
	}
}
