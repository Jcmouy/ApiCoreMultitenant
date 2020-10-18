package com.factelcore.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Parameter;

import com.factelcore.enumeration.EstadoTypes;

@Entity
@org.hibernate.annotations.GenericGenerator(
		name="myForeignGenerator",
		strategy="foreign",
		parameters = @Parameter(
				name="property",
				value="solicitud"
		)
)
public class Seguridad extends BaseObject implements Serializable{

	private static final long serialVersionUID = 8852706937591719964L;
	
	@Id @GeneratedValue(generator="myForeignGenerator")
	@Column(name="FK_SEG_COD_SOL_SER")
	private Long id;

	@OneToOne(optional=false,fetch=FetchType.LAZY)
	@JoinColumn(name="FK_SEG_COD_SOL_SER",referencedColumnName="PK_SSE_COD_SOL_SER",updatable=false,insertable=false)
	private SolicitudServicio solicitud;
	
	@Column(name="SEG_TIP",nullable=false)
	private Integer tipo;
	
	@Column(name="FK_SEG_COD_EST",nullable=false)
	@Enumerated
	private EstadoTypes estado;
	
	@Column(name="SEG_USU_ACT",nullable=false)
	private String usuarioAct;
	
	@Column(name="SEG_FEC_ACT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaAct = new Date(System.currentTimeMillis());
	
	public Seguridad() {
		super();
	}

	public Seguridad(Long id, Integer tipo, EstadoTypes estado,
			String usuarioAct) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.estado = estado;
		this.usuarioAct = usuarioAct;
	}

	/**
	 * Método de acceso a la propiedad "idSolicitud"
	 * @return idSolicitud
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Método modificador de la propiedad "idSolicitud"
	 * @param idSolicitud
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Método de acceso a la propiedad "tipo"
	 * @return tipo
	 */
	public Integer getTipo() {
		return tipo;
	}

	/**
	 * Método modificador de la propiedad "tipo"
	 * @param tipo
	 */
	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	/**
	 * Método de acceso a la propiedad "estado"
	 * @return estado
	 */
	public EstadoTypes getEstado() {
		return estado;
	}

	/**
	 * Método modificador de la propiedad "estado"
	 * @param estado
	 */
	public void setEstado(EstadoTypes estado) {
		this.estado = estado;
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

	/**
	 * M�todo de acceso a la propiedad "solicitud"
	 * @return solicitud
	 */
	public SolicitudServicio getSolicitud() {
		return solicitud;
	}

	/**
	 * M�todo modificador de la propiedad "solicitud"
	 * @param solicitud
	 */
	public void setSolicitud(SolicitudServicio solicitud) {
		this.solicitud = solicitud;
	}

	
}
