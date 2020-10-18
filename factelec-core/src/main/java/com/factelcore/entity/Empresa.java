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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table( name = "EDE_REG_EMPRESA")
public class Empresa extends BaseObject implements Serializable{
	
	private static final long serialVersionUID = -7432460540686170934L;
	
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="empresa")
	@SequenceGenerator(name="empresa", sequenceName="PK_ID_EMPRESA", allocationSize=1) 
	@Column(name="ID")	
	private Integer id;
	
	@Column(name="RAZON_SOCIAL")
	private String razSocial;
	
	@Column(name="DOMICILIO")
	private String domicilio;
	
	@Column(name="TIPO_DOC")
	private String tipoDoc;
	
	@Column(name="DOCUMENTO")
	private String documento;
	
	@Column(name="NOMBRE_REPRESENTANTE")
	private String nombreRep;
	
	@Column(name="TIPO_DOC_REP")
	private String tipoDocRep;
	
	@Column(name="DOC_REPRESENTANTE")
	private String docRep;
	
	@Column(name="TIPO_SERVICIO")
	private String tipoServicio;
	
	@Column(name="NRO_SERVICIO")
	private String nroServicio;
	
	@Column(name="NRO_CUENTA")
	private String nroCuenta;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="ope_fec_baj")
	@Temporal(TemporalType.DATE)		
	private Date fechaBaja;

	@Column(name="ope_fec_act")
	@Temporal(TemporalType.TIMESTAMP)	
	private Date fechaAct = new Date(System.currentTimeMillis());
		
	public Empresa() {
		super();
	}

	public Empresa(Integer id, String razSocial, String domicilio, String tipoDoc, String documento, String nombreRep,
			String tipoDocRep, String docRep, String tipoServicio, String nroServicio, String nroCuenta, String email) {
		super();
		this.id = id;
		this.razSocial = razSocial;
		this.domicilio = domicilio;
		this.tipoDoc = tipoDoc;
		this.documento = documento;
		this.nombreRep = nombreRep;
		this.tipoDocRep = tipoDocRep;
		this.docRep = docRep;
		this.tipoServicio = tipoServicio;
		this.nroServicio = nroServicio;
		this.nroCuenta = nroCuenta;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRazSocial() {
		return razSocial;
	}

	public void setRazSocial(String razSocial) {
		this.razSocial = razSocial;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getNombreRep() {
		return nombreRep;
	}

	public void setNombreRep(String nombreRep) {
		this.nombreRep = nombreRep;
	}

	public String getTipoDocRep() {
		return tipoDocRep;
	}

	public void setTipoDocRep(String tipoDocRep) {
		this.tipoDocRep = tipoDocRep;
	}

	public String getDocRep() {
		return docRep;
	}

	public void setDocRep(String docRep) {
		this.docRep = docRep;
	}

	public String getTipoServicio() {
		return tipoServicio;
	}

	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}

	public String getNroServicio() {
		return nroServicio;
	}

	public void setNroServicio(String nroServicio) {
		this.nroServicio = nroServicio;
	}

	public String getNroCuenta() {
		return nroCuenta;
	}

	public void setNroCuenta(String nroCuenta) {
		this.nroCuenta = nroCuenta;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	public Date getFechaAct() {
		return fechaAct;
	}

	public void setFechaAct(Date fechaAct) {
		this.fechaAct = fechaAct;
	}
}
