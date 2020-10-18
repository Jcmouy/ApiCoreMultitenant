package com.factelcore.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table( name = "SOLICITUD_INFORMACION")
public class SolicitudInformacion extends BaseObject implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="solicitudInformacion")
	@SequenceGenerator(name="solicitudInformacion", sequenceName="PK_SIN_COD_INF", allocationSize=1)
	@Column(name="pk_sin_cod_sol_inf")
	private Long id;
	
	@JoinColumn(name="fk_sin_cod_sol_ser")
	@ManyToOne(cascade={CascadeType.PERSIST,CascadeType.MERGE})
	private SolicitudServicio solicitudesServicio;
	
	@Column(name="sin_tip_sol")
	private String tipoSolicitud;
	
	@Column(name="sin_des_sol_info")
	private String detalleSolInformacion;
	
	@Column(name="sin_not_dis")
	private String notaDis;
	
	@Column(name="sin_not_des")
	private String notDes;
	
	@Column(name="sin_fec_baj")
	@Temporal(TemporalType.DATE)
	private Date fechaBaja;
	
	@Column(name="sin_usu_act")
	private String usuarioAct;
	
	@Column(name="sin_fec_act")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaAct = new Date(System.currentTimeMillis());
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<SolicitudGenerada> solicitudesGeneradas = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CuentasSolicitud> cuentasSolicitud = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	//Revisar
	private List<UsuarioSolicitudInfo> usuarioSolicitudInfo = new ArrayList<>();
	
	
	public SolicitudInformacion() {
		super();
	}
	
	public SolicitudInformacion(Long id, SolicitudServicio solicitudesServicio, String tipoSolicitud,
			String detalleSolInformacion, String notaDis, String notDes, String usuarioAct) {
		super();
		this.id = id;
		this.solicitudesServicio = solicitudesServicio;
		this.tipoSolicitud = tipoSolicitud;
		this.detalleSolInformacion = detalleSolInformacion;
		this.notaDis = notaDis;
		this.notDes = notDes;
		this.usuarioAct = usuarioAct;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SolicitudServicio getSolicitudesServicio() {
		return solicitudesServicio;
	}

	public void setSolicitudesServicio(SolicitudServicio solicitudesServicio) {
		this.solicitudesServicio = solicitudesServicio;
	}

	public String getTipoSolicitud() {
		return tipoSolicitud;
	}

	public void setTipoSolicitud(String tipoSolicitud) {
		this.tipoSolicitud = tipoSolicitud;
	}

	public String getDetalleSolInformacion() {
		return detalleSolInformacion;
	}

	public void setDetalleSolInformacion(String detalleSolInformacion) {
		this.detalleSolInformacion = detalleSolInformacion;
	}

	public String getNotaDis() {
		return notaDis;
	}

	public void setNotaDis(String notaDis) {
		this.notaDis = notaDis;
	}

	public String getNotDes() {
		return notDes;
	}

	public void setNotDes(String notDes) {
		this.notDes = notDes;
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
    
    public void addSolicitudGenerada(SolicitudGenerada solicitudGenerada) {
		solicitudesGeneradas.add(solicitudGenerada);
		solicitudGenerada.setSolicitudInformacion(this);
    }
 
    public void removeSolicitudGenerada(SolicitudGenerada solicitudGenerada) {
    	solicitudesGeneradas.remove(solicitudGenerada);
    	solicitudGenerada.setSolicitudInformacion(null);
    }

	public List<CuentasSolicitud> getCuentasSolicitud() {
		return cuentasSolicitud;
	}

	public void setCuentasSolicitud(List<CuentasSolicitud> cuentasSolicitud) {
		this.cuentasSolicitud = cuentasSolicitud;
	}

	public List<SolicitudGenerada> getSolicitudesGeneradas() {
		return solicitudesGeneradas;
	}

	public void setSolicitudesGeneradas(List<SolicitudGenerada> solicitudesGeneradas) {
		this.solicitudesGeneradas = solicitudesGeneradas;
	}

	public List<UsuarioSolicitudInfo> getUsuarioSolicitudInfo() {
		return usuarioSolicitudInfo;
	}

	public void setUsuarioSolicitudInfo(List<UsuarioSolicitudInfo> usuarioSolicitudInfo) {
		this.usuarioSolicitudInfo = usuarioSolicitudInfo;
	}

	
}
