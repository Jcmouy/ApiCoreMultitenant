package com.factelcore.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQueries({
	@NamedQuery(name="NQ_SELECT_ORGANISMO", 
			query="Select o from Organismo o where o.fechaBaja is null")
})
public class Organismo extends BaseObject implements Serializable{

	private static final long serialVersionUID = 4948846679370263292L;

	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="organismo")
	@SequenceGenerator(name="organismo", sequenceName="PK_ID_ORGANISMO", allocationSize=1)  
	@Column(name="PK_ORG_COD_ORG")	
	private Integer id;

	@Column(name="ORG_DES_ORG")
	private String nombre;

	@Column(name="ORG_FEC_BAJ")
	@Temporal(TemporalType.DATE)		
	private Date fechaBaja;

	@Column(name="ORG_USU_ACT")
	private String usuarioAct;

	@Column(name="ORG_FEC_ACT")
	@Temporal(TemporalType.TIMESTAMP)	
	private Date fechaAct = new Date(System.currentTimeMillis());
	
	public Organismo() {
		super();
	}
	public Organismo(int id, String nombre,
			String usuarioAct) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.usuarioAct = usuarioAct;
	}
	/**
	 * Método de acceso a la propiedad "id"
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * Método modificador de la propiedad "id"
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * Método de acceso a la propiedad "nombre"
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Método modificador de la propiedad "nombre"
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Método de acceso a la propiedad "fechaBaja"
	 * @return fechaBaja
	 */
	public Date getFechaBaja() {
		return fechaBaja;
	}
	/**
	 * Método modificador de la propiedad "fechaBaja"
	 * @param fechaBaja
	 */
	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
	/**
	 * Método de acceso a la propiedad "usuarioAct"
	 * @return usuarioAct
	 */
	public String getUsuarioAct() {
		return usuarioAct;
	}
	/**
	 * Método modificador de la propiedad "usuarioAct"
	 * @param usuarioAct
	 */
	public void setUsuarioAct(String usuarioAct) {
		this.usuarioAct = usuarioAct;
	}
	/**
	 * Método de acceso a la propiedad "fechaAct"
	 * @return fechaAct
	 */
	public Date getFechaAct() {
		return fechaAct;
	}
	/**
	 * Método modificador de la propiedad "fechaAct"
	 * @param fechaAct
	 */
	public void setFechaAct(Date fechaAct) {
		this.fechaAct = fechaAct;
	}
	
	
	
}
