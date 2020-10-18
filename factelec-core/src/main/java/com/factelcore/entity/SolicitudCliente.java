package com.factelcore.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.factelcore.enumeration.CausalTypes;
import com.factelcore.enumeration.Departments;
import com.factelcore.enumeration.EstadoTypes;

@Entity
@Table( name = "SOLICITUD_CLIENTE")
@NamedQueries({
	@NamedQuery(name="NQ_SELECT_SOLICITUD_CLIENTE_BY_CLIENTE", 
			query="select sc from SolicitudCliente sc where sc.nroCliente = :nroCliente"),
	@NamedQuery(name="NQ_EXIST_SOLICITUD_CLIENTE_BY_CLIENTE", 
			query="select count(sc) from SolicitudCliente sc where sc.nroCliente = :nroCliente")
			
})

public class SolicitudCliente extends BaseObject implements Serializable{

	private static final long serialVersionUID = -3212768225578788611L;

	
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ss_cliente")
	@SequenceGenerator(name="ss_cliente", sequenceName="S_ID_SOLICITUD_CLIENTE", allocationSize=1)
	@Column(name="SCL_COD_SOL_CLI",unique=true,nullable=false)
	private Integer codigoSolicitud;

	@Column(name="pk_scl_nro_cli",unique=true,nullable=false)
	private String nroCliente;
	
	@ManyToOne(cascade={CascadeType.PERSIST,CascadeType.MERGE})
	@JoinColumn(name="fk_scl_sol_ser")
	private SolicitudServicio solicitudServicio;

	@Column(name="fk_cod_tip_sol")
	private String tipoSolicitud;
	
	@Column(name="fk_scl_tip_doc")
	private Integer tipoDocumento;
	
	@Column(name="scl_nro_doc")
	private String documento;
	
	@Column(name="scl_dir")
	private String direccion;
	
	@Column(name="scl_tel")
	private String telefono;
	
	@Column(name="fk_scl_cod_dep")
	@Enumerated(value=EnumType.ORDINAL)
	private Departments departamento;
	
	@Column(name="scl_ciu")
	private String ciudad;
	
	@Column(name="scl_raz_soc")
	private String razolSocial;
	
	@Column(name="scl_nro_res")
	private String nroResolucion;
	
	@ManyToOne
	@JoinColumn(name="fk_scl_org")
	private Organismo organismo;
	
	@Column(name="fk_scl_cod_est")
	@Enumerated(value=EnumType.ORDINAL)
	private EstadoTypes estado;
	
	@Column(name="fk_scl_cod_cau")
	@Enumerated(value=EnumType.ORDINAL)
	private CausalTypes causal;
	
	@Column(name="scl_fec_ini_sol")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaInicialSol;
	
	@Column(name="scl_fec_baj")
	@Temporal(TemporalType.DATE)
	private Date fechaBaja;
	
	@Column(name="scl_usu_act")
	private String usuarioAct;
	
	@Column(name="scl_fec_act")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaAct = new Date(System.currentTimeMillis());

	public SolicitudCliente() {
		super();
	}

	public SolicitudCliente(String nroCliente, Integer codigoSolicitud,
			SolicitudServicio solicitudServicio, String tipoSolicitud,
			Integer tipoDocumento, String documento, String direccion,
			String telefono, Departments departamento, String ciudad,
			String razolSocial, String nroResolucion, Organismo organismo,
			EstadoTypes estado, CausalTypes causal, Date fechaInicialSol, String usuarioAct) {
		super();
		this.nroCliente = nroCliente;
		this.codigoSolicitud = codigoSolicitud;
		this.solicitudServicio = solicitudServicio;
		this.tipoSolicitud = tipoSolicitud;
		this.tipoDocumento = tipoDocumento;
		this.documento = documento;
		this.direccion = direccion;
		this.telefono = telefono;
		this.departamento = departamento;
		this.ciudad = ciudad;
		this.razolSocial = razolSocial;
		this.nroResolucion = nroResolucion;
		this.organismo = organismo;
		this.estado = estado;
		this.causal = causal;
		this.fechaInicialSol = fechaInicialSol;
		this.usuarioAct = usuarioAct;
	}

	/**
	 * Método de acceso a la propiedad "nroCliente"
	 * @return nroCliente
	 */
	public String getNroCliente() {
		return nroCliente;
	}

	/**
	 * Método modificador de la propiedad "nroCliente"
	 * @param nroCliente
	 */
	public void setNroCliente(String nroCliente) {
		this.nroCliente = nroCliente;
	}

	/**
	 * Método de acceso a la propiedad "codigoSolicitud"
	 * @return codigoSolicitud
	 */
	public Integer getCodigoSolicitud() {
		return codigoSolicitud;
	}

	/**
	 * Método modificador de la propiedad "codigoSolicitud"
	 * @param codigoSolicitud
	 */
	public void setCodigoSolicitud(Integer codigoSolicitud) {
		this.codigoSolicitud = codigoSolicitud;
	}

	/**
	 * Método de acceso a la propiedad "solicitudServicio"
	 * @return solicitudServicio
	 */
	public SolicitudServicio getSolicitudServicio() {
		return solicitudServicio;
	}

	/**
	 * Método modificador de la propiedad "solicitudServicio"
	 * @param solicitudServicio
	 */
	public void setSolicitudServicio(SolicitudServicio solicitudServicio) {
		this.solicitudServicio = solicitudServicio;
	}

	/**
	 * Método de acceso a la propiedad "tipoSolicitud"
	 * @return tipoSolicitud
	 */
	public String getTipoSolicitud() {
		return tipoSolicitud;
	}

	/**
	 * Método modificador de la propiedad "tipoSolicitud"
	 * @param tipoSolicitud
	 */
	public void setTipoSolicitud(String tipoSolicitud) {
		this.tipoSolicitud = tipoSolicitud;
	}

	/**
	 * Método de acceso a la propiedad "tipoDocumento"
	 * @return tipoDocumento
	 */
	public Integer getTipoDocumento() {
		return tipoDocumento;
	}

	/**
	 * Método modificador de la propiedad "tipoDocumento"
	 * @param tipoDocumento
	 */
	public void setTipoDocumento(Integer tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	/**
	 * Método de acceso a la propiedad "documento"
	 * @return documento
	 */
	public String getDocumento() {
		return documento;
	}

	/**
	 * Método modificador de la propiedad "documento"
	 * @param documento
	 */
	public void setDocumento(String documento) {
		this.documento = documento;
	}

	/**
	 * Método de acceso a la propiedad "direccion"
	 * @return direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Método modificador de la propiedad "direccion"
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Método de acceso a la propiedad "telefono"
	 * @return telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * Método modificador de la propiedad "telefono"
	 * @param telefono
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * Método de acceso a la propiedad "departamento"
	 * @return idDepartamento
	 */
	public Departments getDepartamento() {
		return departamento;
	}

	/**
	 * Método modificador de la propiedad "departamento"
	 * @param idDepartamento
	 */
	public void setDepartamento(Departments departamento) {
		this.departamento = departamento;
	}

	/**
	 * Método de acceso a la propiedad "ciudad"
	 * @return ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * Método modificador de la propiedad "ciudad"
	 * @param ciudad
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * Método de acceso a la propiedad "razolSocial"
	 * @return razolSocial
	 */
	public String getRazolSocial() {
		return razolSocial;
	}

	/**
	 * Método modificador de la propiedad "razolSocial"
	 * @param razolSocial
	 */
	public void setRazolSocial(String razolSocial) {
		this.razolSocial = razolSocial;
	}

	/**
	 * Método de acceso a la propiedad "nroResolucion"
	 * @return nroResolucion
	 */
	public String getNroResolucion() {
		return nroResolucion;
	}

	/**
	 * Método modificador de la propiedad "nroResolucion"
	 * @param nroResolucion
	 */
	public void setNroResolucion(String nroResolucion) {
		this.nroResolucion = nroResolucion;
	}

	/**
	 * Método de acceso a la propiedad "organismo"
	 * @return organismo
	 */
	public Organismo getOrganismo() {
		return organismo;
	}

	/**
	 * Método modificador de la propiedad "organismo"
	 * @param organismo
	 */
	public void setOrganismo(Organismo organismo) {
		this.organismo = organismo;
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
	 * Método de acceso a la propiedad "causal"
	 * @return causal
	 */
	public CausalTypes getCausal() {
		return causal;
	}

	/**
	 * Método modificador de la propiedad "causal"
	 * @param causal
	 */
	public void setCausal(CausalTypes causal) {
		this.causal = causal;
	}

	/**
	 * Método de acceso a la propiedad "fechaInicialSol"
	 * @return fechaInicialSol
	 */
	public Date getFechaInicialSol() {
		return fechaInicialSol;
	}

	/**
	 * Método modificador de la propiedad "fechaInicialSol"
	 * @param fechaInicialSol
	 */
	public void setFechaInicialSol(Date fechaInicialSol) {
		this.fechaInicialSol = fechaInicialSol;
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
