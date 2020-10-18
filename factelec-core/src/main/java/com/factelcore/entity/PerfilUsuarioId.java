package com.factelcore.entity;

import java.io.Serializable;

import javax.persistence.Column;

public class PerfilUsuarioId extends BaseObject implements Serializable{
	
	private static final long serialVersionUID = 5982283860174460041L;
	
	@Column(name="pk_fk_pus_usu")
	private String uid;
	
	@Column(name="pk_fk_pus_cod_per")
	private Integer idPerfil;
	
	public PerfilUsuarioId() {
		super();
	}

	public PerfilUsuarioId(String uid, Integer idPerfil) {
		super();
		this.uid = uid;
		this.idPerfil = idPerfil;
	}

	/**
	 * M�todo de acceso a la propiedad "uid"
	 * @return uid
	 */
	public String getUid() {
		return uid;
	}

	/**
	 * M�todo modificador de la propiedad "uid"
	 * @param uid
	 */
	public void setUid(String uid) {
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
}
