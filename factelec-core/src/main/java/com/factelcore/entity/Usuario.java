package com.factelcore.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table( name = "USUARIO")
@NamedQueries({
	@NamedQuery(name="NQ_SELECT_USER_BY_USERNAME", 
			query="select u from Usuario u where u.usuario = :userName")
})
public class Usuario extends BaseObject{

	private static final long serialVersionUID = 7762234045142955429L;
	@Id 
	@Column(name="pk_usu_usu")
	private Integer usuario;
	
	@Column(name="usu_obs")	
	private String observacion;
	
	@Column(name="usu_fec_baj")	
	@Temporal(TemporalType.DATE)
	private Date fechaBaja;
	
	@Column(name="usu_usu_act")	
	private String usuarioAct;
	
	@Column(name="usu_fec_act")	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaAct = new Date(System.currentTimeMillis());
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private Set<PerfilUsuario> perfiles = new HashSet<PerfilUsuario>();

	@Column(name="usu_usu_pad")
	private String padre;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<SolicitudGenerada> solicitudesGeneradas = new ArrayList<>();

	public Usuario() {
		super();
	}


	public Usuario(Integer usuario, String observacion,
			String usuarioAct, String padre, Set<PerfilUsuario> perfiles) {
		super();
		this.usuario = usuario;
		this.observacion = observacion;
		this.usuarioAct = usuarioAct;
		this.perfiles = perfiles;
		this.padre = padre;
	}


	/**
	 * M�todo de acceso a la propiedad "usuario"
	 * @return usuario
	 */
	public Integer getUsuario() {
		return usuario;
	}


	/**
	 * M�todo modificador de la propiedad "usuario"
	 * @param usuario
	 */
	public void setUsuario(Integer usuario) {
		this.usuario = usuario;
	}


	/**
	 * M�todo de acceso a la propiedad "observacion"
	 * @return observacion
	 */
	public String getObservacion() {
		return observacion;
	}


	/**
	 * M�todo modificador de la propiedad "observacion"
	 * @param observacion
	 */
	public void setObservacion(String observacion) {
		this.observacion = observacion;
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
		//TODO si se quiere respetar encapsulaci�n
		//return (Date)fechaAct.clone();
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
	 * M�todo de acceso a la propiedad "perfiles"
	 * @return perfiles
	 */
	public Set<PerfilUsuario> getPerfiles() {
		//TODO si se quiere respetar encapsulaci�n
		//return Collections.unmodifiableSet(perfiles);
		return perfiles;
	}


	/**
	 * M�todo modificador de la propiedad "perfiles"
	 * @param perfiles
	 */
	public void setPerfiles(Set<PerfilUsuario> perfiles) {
		this.perfiles = perfiles;
	}


	/**
	 * M�todo de acceso a la propiedad "padre"
	 * @return padre
	 */
	public String getPadre() {
		return padre;
	}


	/**
	 * M�todo modificador de la propiedad "padre"
	 * @param padre
	 */
	public void setPadre(String padre) {
		this.padre = padre;
	}
	
	public void addSolicitudGenerada(SolicitudGenerada solicitudGenerada) {
		solicitudesGeneradas.add(solicitudGenerada);
		solicitudGenerada.setUsuario(this);
    }
 
    public void removeSolicitudGenerada(SolicitudGenerada solicitudGenerada) {
    	solicitudesGeneradas.remove(solicitudGenerada);
    	solicitudGenerada.setUsuario(null);
    }

	/**
	 * 
	 * Descripci�n: <BR>
	 *
	 * @param perfil <BR>
	 */
	public void agregarPerfil(Perfil perfil){
		if (perfil!=null){
			if (perfiles.contains(perfil)){
				perfiles.remove(perfil);
			}
			this.perfiles.add(new PerfilUsuario(this.usuario,this,perfil));
		}
	}
	
}
