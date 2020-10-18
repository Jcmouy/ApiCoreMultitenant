package com.factelcore.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="perfil_usuario")
@IdClass(PerfilUsuarioId.class)
public class PerfilUsuario extends BaseObject implements Serializable {

	private static final long serialVersionUID = 8162402788121084079L;

	@Id
	@Column(name="pk_fk_pus_usu")
	private Integer uid;
	@Id
	@Column(name="pk_fk_pus_cod_per")
	private Integer idPerfil;
	
	@Column(name="pus_fec_baj")
	@Temporal(TemporalType.DATE)
	private Date fechaBaja;
	
	@Column(name="pus_usu_act")
	private Integer usuarioAct;
	
	@Column(name="pus_fec_act")
	@Temporal(TemporalType.TIMESTAMP)	
	private Date fechaAct = new Date(System.currentTimeMillis());
	 
	@ManyToOne
	@JoinColumn(name="pk_fk_pus_usu", referencedColumnName="pk_usu_usu",insertable=false,updatable=false)
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name="pk_fk_pus_cod_per", referencedColumnName="pk_per_cod_per",insertable=false,updatable=false)
	private Perfil perfil;
	
	public PerfilUsuario() {
		super();
	}
	
	public PerfilUsuario(Integer usuarioAct, Usuario usuario, Perfil perfil) {
		super();
		//Set fields
		this.usuarioAct = usuarioAct;
		this.usuario = usuario;
		this.perfil = perfil;
		
		//Set identifier values
		this.uid = usuario.getUsuario();
		this.idPerfil = perfil.getId();
		
		//Guarantee referential integrity
		usuario.getPerfiles().add(this);
		perfil.getUsuarios().add(this);
	}

	/**
	 * M�todo de acceso a la propiedad "uid"
	 * @return uid
	 */
	public Integer getUid() {
		return uid;
	}


	/**
	 * M�todo modificador de la propiedad "uid"
	 * @param uid
	 */
	public void setUid(Integer uid) {
		this.uid = uid;
	}


	/**
	 * M�todo de acceso a la propiedad "idPerfil"
	 * @return idPerfil
	 */
	public Integer getIdPerfil() {
		return idPerfil;
	}


	/**
	 * M�todo modificador de la propiedad "idPerfil"
	 * @param idPerfil
	 */
	public void setIdPerfil(Integer idPerfil) {
		this.idPerfil = idPerfil;
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
	public Integer getUsuarioAct() {
		return usuarioAct;
	}


	/**
	 * M�todo modificador de la propiedad "usuarioAct"
	 * @param usuarioAct
	 */
	public void setUsuarioAct(Integer usuarioAct) {
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
	 * M�todo de acceso a la propiedad "usuario"
	 * @return usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}


	/**
	 * M�todo modificador de la propiedad "usuario"
	 * @param usuario
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
}
