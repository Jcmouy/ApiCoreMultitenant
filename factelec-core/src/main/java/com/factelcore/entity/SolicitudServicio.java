package com.factelcore.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.factelcore.enumeration.CausalTypes;
import com.factelcore.enumeration.EstadoTypes;

@Entity
@Table( name = "SOLICITUD_SERVICIO")
@NamedQueries({
	@NamedQuery(name="NQ_SELECT_SOLICITUD_BY_USERNAME", 
			query="select ss from SolicitudServicio ss where UPPER(ss.usuario.usuario) = :userName"),
	@NamedQuery(name="NQ_EXIST_SOLICITUD_BY_USERNAME", 
			query="select count(ss) from SolicitudServicio ss where UPPER(ss.usuario.usuario) = :userName")
			
})
public class SolicitudServicio extends BaseObject {

	private static final long serialVersionUID = 8472850954207864537L;
	
	@Id  @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ss_servicio")
	@SequenceGenerator(name="ss_servicio", sequenceName="S_ID_SOLICITUD_SERVICIO", allocationSize=1)
	@Column(name="PK_SSE_COD_SOL_SER")
	private Long id;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="FK_SSE_USU")
	private Usuario usuario;
	
	@Column(name="SSE_CUE_VAL")	
	private String cuenta;
	
	@Column(name="FK_SSE_TIP_SOL_SER")
	private String tipoSolicitud;
	
	@Column(name="SSE_CON_HOR_INI")
	private String horaInicial;
	
	@Column(name="SSE_CON_HOR_FIN")	
	private String horaFinal;
	
	@Column(name="SSE_NRO_RES")		
	private String nroResolucion;
	
	@Column(name="FK_SSE_COD_EST", nullable = false)	
	@Enumerated(value=EnumType.ORDINAL)
	private EstadoTypes estado;

	@Column(name="SSE_OBS_EST")
	private String observacionEstado;
	
	@Column(name="FK_SSE_COD_CAU")
	@Enumerated(value=EnumType.ORDINAL)
	private CausalTypes causal;
	
	@Column(name="SSE_FEC_HOR_BLO")
	@Temporal(TemporalType.TIMESTAMP)	
	private Date fechaBloqueo;

	@Column(name="SSE_USU_BLO")
	private String usuarioBloqueado;
	
	@Column(name="SSE_FEC_BAJ")
	@Temporal(TemporalType.DATE)
	private Date fechaBaja;
	
	@Column(name="SSE_FEC_INI_SOL")
	@Temporal(TemporalType.TIMESTAMP)	
	private Date fechaInicialSol;

	@Column(name="sse_vis")
	private Integer vis;
	
	@Column(name="SSE_USU_ACT", nullable = false)
	private String usuarioAct;
	
	@Column(name="SSE_FEC_ACT", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaAct = new  Date(System.currentTimeMillis());
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private Seguridad seguridad;
	
	@ManyToOne(fetch=FetchType.LAZY)
    private Cliente cliente;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SolicitudInformacion> solicitudInformacion;
	
	public SolicitudServicio() {
		super();
	}

	public SolicitudServicio(Long id, Usuario usuario, String cuenta,
			String tipoSolicitud, String horaInicial, String horaFinal,
			String nroResolucion, EstadoTypes estado, String observacionEstado,
			CausalTypes causal, Date fechaInicialSol, Integer vis, String usuarioAct) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.cuenta = cuenta;
		this.tipoSolicitud = tipoSolicitud;
		this.horaInicial = horaInicial;
		this.horaFinal = horaFinal;
		this.nroResolucion = nroResolucion;
		this.estado = estado;
		this.observacionEstado = observacionEstado;
		this.causal = causal;
		this.fechaInicialSol = fechaInicialSol;
		this.vis = vis;
		this.usuarioAct = usuarioAct;
	}


	/**
	 * M�todo de acceso a la propiedad "id"
	 * @return id
	 */
	public Long getId() {
		return id;
	}


	/**
	 * M�todo modificador de la propiedad "id"
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
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


	/**
	 * M�todo de acceso a la propiedad "cuenta"
	 * @return cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}


	/**
	 * M�todo modificador de la propiedad "cuenta"
	 * @param cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}


	/**
	 * M�todo de acceso a la propiedad "tipoSolicitud"
	 * @return tipoSolicitud
	 */
	public String getTipoSolicitud() {
		return tipoSolicitud;
	}


	/**
	 * M�todo modificador de la propiedad "tipoSolicitud"
	 * @param tipoSolicitud
	 */
	public void setTipoSolicitud(String tipoSolicitud) {
		this.tipoSolicitud = tipoSolicitud;
	}


	/**
	 * M�todo de acceso a la propiedad "horaInicial"
	 * @return horaInicial
	 */
	public String getHoraInicial() {
		return horaInicial;
	}


	/**
	 * M�todo modificador de la propiedad "horaInicial"
	 * @param horaInicial
	 */
	public void setHoraInicial(String horaInicial) {
		this.horaInicial = horaInicial;
	}


	/**
	 * M�todo de acceso a la propiedad "horaFinal"
	 * @return horaFinal
	 */
	public String getHoraFinal() {
		return horaFinal;
	}


	/**
	 * M�todo modificador de la propiedad "horaFinal"
	 * @param horaFinal
	 */
	public void setHoraFinal(String horaFinal) {
		this.horaFinal = horaFinal;
	}


	/**
	 * M�todo de acceso a la propiedad "nroResolucion"
	 * @return nroResolucion
	 */
	public String getNroResolucion() {
		return nroResolucion;
	}


	/**
	 * M�todo modificador de la propiedad "nroResolucion"
	 * @param nroResolucion
	 */
	public void setNroResolucion(String nroResolucion) {
		this.nroResolucion = nroResolucion;
	}


	/**
	 * M�todo de acceso a la propiedad "estado"
	 * @return estado
	 */
	public EstadoTypes getEstado() {
		return estado;
	}


	/**
	 * M�todo modificador de la propiedad "estado"
	 * @param estado
	 */
	public void setEstado(EstadoTypes estado) {
		this.estado = estado;
	}


	/**
	 * M�todo de acceso a la propiedad "observacionEstado"
	 * @return observacionEstado
	 */
	public String getObservacionEstado() {
		return observacionEstado;
	}


	/**
	 * M�todo modificador de la propiedad "observacionEstado"
	 * @param observacionEstado
	 */
	public void setObservacionEstado(String observacionEstado) {
		this.observacionEstado = observacionEstado;
	}


	/**
	 * M�todo de acceso a la propiedad "causal"
	 * @return causal
	 */
	public CausalTypes getCausal() {
		return causal;
	}


	/**
	 * M�todo modificador de la propiedad "causal"
	 * @param causal
	 */
	public void setCausal(CausalTypes causal) {
		this.causal = causal;
	}


	/**
	 * M�todo de acceso a la propiedad "fechaBloqueo"
	 * @return fechaBloqueo
	 */
	public Date getFechaBloqueo() {
		return fechaBloqueo;
	}


	/**
	 * M�todo modificador de la propiedad "fechaBloqueo"
	 * @param fechaBloqueo
	 */
	public void setFechaBloqueo(Date fechaBloqueo) {
		this.fechaBloqueo = fechaBloqueo;
	}


	/**
	 * M�todo de acceso a la propiedad "usuarioBloqueado"
	 * @return usuarioBloqueado
	 */
	public String getUsuarioBloqueado() {
		return usuarioBloqueado;
	}


	/**
	 * Método modificador de la propiedad "usuarioBloqueado"
	 * @param usuarioBloqueado
	 */
	public void setUsuarioBloqueado(String usuarioBloqueado) {
		this.usuarioBloqueado = usuarioBloqueado;
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
	 * Método de acceso a la propiedad "vis"
	 * @return vis
	 */
	public Integer getVis() {
		return vis;
	}


	/**
	 * Método modificador de la propiedad "vis"
	 * @param vis
	 */
	public void setVis(Integer vis) {
		this.vis = vis;
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
	 * M�todo de acceso a la propiedad "seguridad"
	 * @return seguridad
	 */
	public Seguridad getSeguridad() {
		return seguridad;
	}


	/**
	 * M�todo modificador de la propiedad "seguridad"
	 * @param seguridad
	 */
	public void setSeguridad(Seguridad seguridad) {
		this.seguridad = seguridad;
		seguridad.setSolicitud(this);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<SolicitudInformacion> getSolicitudInformacion() {
		return solicitudInformacion;
	}

	public void setSolicitudInformacion(List<SolicitudInformacion> solicitudInformacion) {
		this.solicitudInformacion = solicitudInformacion;
	}
}
