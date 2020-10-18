package uy.com.antel.fact.electronica.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import uy.com.antel.fact.electronica.model.OrganismoVO;
import uy.com.antel.fact.electronica.model.SolicitudServicioVO;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class SolicitudClienteVO   {
  
  private Long codigoSolicitud = null;
  private String nroCliente = null;
  private SolicitudServicioVO solicitudServicio = null;
  private String tipoSolicitud = null;
  private Long tipoDocumento = null;
  private String documento = null;
  private String direccion = null;
  private String telefono = null;
  private String departamento = null;
  private String ciudad = null;
  private String razolSocial = null;
  private String nroResolucion = null;
  private OrganismoVO organismo = null;
  private String estado = null;
  private String causal = null;
  private String fechaInicialSol = null;
  private String fechaBaja = null;
  private String usuarioAct = null;
  private String fechaAct = null;

  /**
   **/
  public SolicitudClienteVO codigoSolicitud(Long codigoSolicitud) {
    this.codigoSolicitud = codigoSolicitud;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("codigoSolicitud")
  public Long getCodigoSolicitud() {
    return codigoSolicitud;
  }
  public void setCodigoSolicitud(Long codigoSolicitud) {
    this.codigoSolicitud = codigoSolicitud;
  }

  /**
   **/
  public SolicitudClienteVO nroCliente(String nroCliente) {
    this.nroCliente = nroCliente;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("nroCliente")
  public String getNroCliente() {
    return nroCliente;
  }
  public void setNroCliente(String nroCliente) {
    this.nroCliente = nroCliente;
  }

  /**
   **/
  public SolicitudClienteVO solicitudServicio(SolicitudServicioVO solicitudServicio) {
    this.solicitudServicio = solicitudServicio;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("solicitudServicio")
  public SolicitudServicioVO getSolicitudServicio() {
    return solicitudServicio;
  }
  public void setSolicitudServicio(SolicitudServicioVO solicitudServicio) {
    this.solicitudServicio = solicitudServicio;
  }

  /**
   **/
  public SolicitudClienteVO tipoSolicitud(String tipoSolicitud) {
    this.tipoSolicitud = tipoSolicitud;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tipoSolicitud")
  public String getTipoSolicitud() {
    return tipoSolicitud;
  }
  public void setTipoSolicitud(String tipoSolicitud) {
    this.tipoSolicitud = tipoSolicitud;
  }

  /**
   **/
  public SolicitudClienteVO tipoDocumento(Long tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tipoDocumento")
  public Long getTipoDocumento() {
    return tipoDocumento;
  }
  public void setTipoDocumento(Long tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
  }

  /**
   **/
  public SolicitudClienteVO documento(String documento) {
    this.documento = documento;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("documento")
  public String getDocumento() {
    return documento;
  }
  public void setDocumento(String documento) {
    this.documento = documento;
  }

  /**
   **/
  public SolicitudClienteVO direccion(String direccion) {
    this.direccion = direccion;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("direccion")
  public String getDireccion() {
    return direccion;
  }
  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  /**
   **/
  public SolicitudClienteVO telefono(String telefono) {
    this.telefono = telefono;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("telefono")
  public String getTelefono() {
    return telefono;
  }
  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  /**
   **/
  public SolicitudClienteVO departamento(String departamento) {
    this.departamento = departamento;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("departamento")
  public String getDepartamento() {
    return departamento;
  }
  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }

  /**
   **/
  public SolicitudClienteVO ciudad(String ciudad) {
    this.ciudad = ciudad;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ciudad")
  public String getCiudad() {
    return ciudad;
  }
  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }

  /**
   **/
  public SolicitudClienteVO razolSocial(String razolSocial) {
    this.razolSocial = razolSocial;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("razolSocial")
  public String getRazolSocial() {
    return razolSocial;
  }
  public void setRazolSocial(String razolSocial) {
    this.razolSocial = razolSocial;
  }

  /**
   **/
  public SolicitudClienteVO nroResolucion(String nroResolucion) {
    this.nroResolucion = nroResolucion;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("nroResolucion")
  public String getNroResolucion() {
    return nroResolucion;
  }
  public void setNroResolucion(String nroResolucion) {
    this.nroResolucion = nroResolucion;
  }

  /**
   **/
  public SolicitudClienteVO organismo(OrganismoVO organismo) {
    this.organismo = organismo;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("organismo")
  public OrganismoVO getOrganismo() {
    return organismo;
  }
  public void setOrganismo(OrganismoVO organismo) {
    this.organismo = organismo;
  }

  /**
   **/
  public SolicitudClienteVO estado(String estado) {
    this.estado = estado;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("estado")
  public String getEstado() {
    return estado;
  }
  public void setEstado(String estado) {
    this.estado = estado;
  }

  /**
   **/
  public SolicitudClienteVO causal(String causal) {
    this.causal = causal;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("causal")
  public String getCausal() {
    return causal;
  }
  public void setCausal(String causal) {
    this.causal = causal;
  }

  /**
   **/
  public SolicitudClienteVO fechaInicialSol(String fechaInicialSol) {
    this.fechaInicialSol = fechaInicialSol;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("fechaInicialSol")
  public String getFechaInicialSol() {
    return fechaInicialSol;
  }
  public void setFechaInicialSol(String fechaInicialSol) {
    this.fechaInicialSol = fechaInicialSol;
  }

  /**
   **/
  public SolicitudClienteVO fechaBaja(String fechaBaja) {
    this.fechaBaja = fechaBaja;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("fechaBaja")
  public String getFechaBaja() {
    return fechaBaja;
  }
  public void setFechaBaja(String fechaBaja) {
    this.fechaBaja = fechaBaja;
  }

  /**
   **/
  public SolicitudClienteVO usuarioAct(String usuarioAct) {
    this.usuarioAct = usuarioAct;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("usuarioAct")
  public String getUsuarioAct() {
    return usuarioAct;
  }
  public void setUsuarioAct(String usuarioAct) {
    this.usuarioAct = usuarioAct;
  }

  /**
   **/
  public SolicitudClienteVO fechaAct(String fechaAct) {
    this.fechaAct = fechaAct;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("fechaAct")
  public String getFechaAct() {
    return fechaAct;
  }
  public void setFechaAct(String fechaAct) {
    this.fechaAct = fechaAct;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SolicitudClienteVO solicitudCliente = (SolicitudClienteVO) o;
    return Objects.equals(codigoSolicitud, solicitudCliente.codigoSolicitud) &&
        Objects.equals(nroCliente, solicitudCliente.nroCliente) &&
        Objects.equals(solicitudServicio, solicitudCliente.solicitudServicio) &&
        Objects.equals(tipoSolicitud, solicitudCliente.tipoSolicitud) &&
        Objects.equals(tipoDocumento, solicitudCliente.tipoDocumento) &&
        Objects.equals(documento, solicitudCliente.documento) &&
        Objects.equals(direccion, solicitudCliente.direccion) &&
        Objects.equals(telefono, solicitudCliente.telefono) &&
        Objects.equals(departamento, solicitudCliente.departamento) &&
        Objects.equals(ciudad, solicitudCliente.ciudad) &&
        Objects.equals(razolSocial, solicitudCliente.razolSocial) &&
        Objects.equals(nroResolucion, solicitudCliente.nroResolucion) &&
        Objects.equals(organismo, solicitudCliente.organismo) &&
        Objects.equals(estado, solicitudCliente.estado) &&
        Objects.equals(causal, solicitudCliente.causal) &&
        Objects.equals(fechaInicialSol, solicitudCliente.fechaInicialSol) &&
        Objects.equals(fechaBaja, solicitudCliente.fechaBaja) &&
        Objects.equals(usuarioAct, solicitudCliente.usuarioAct) &&
        Objects.equals(fechaAct, solicitudCliente.fechaAct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigoSolicitud, nroCliente, solicitudServicio, tipoSolicitud, tipoDocumento, documento, direccion, telefono, departamento, ciudad, razolSocial, nroResolucion, organismo, estado, causal, fechaInicialSol, fechaBaja, usuarioAct, fechaAct);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolicitudCliente {\n");
    
    sb.append("    codigoSolicitud: ").append(toIndentedString(codigoSolicitud)).append("\n");
    sb.append("    nroCliente: ").append(toIndentedString(nroCliente)).append("\n");
    sb.append("    solicitudServicio: ").append(toIndentedString(solicitudServicio)).append("\n");
    sb.append("    tipoSolicitud: ").append(toIndentedString(tipoSolicitud)).append("\n");
    sb.append("    tipoDocumento: ").append(toIndentedString(tipoDocumento)).append("\n");
    sb.append("    documento: ").append(toIndentedString(documento)).append("\n");
    sb.append("    direccion: ").append(toIndentedString(direccion)).append("\n");
    sb.append("    telefono: ").append(toIndentedString(telefono)).append("\n");
    sb.append("    departamento: ").append(toIndentedString(departamento)).append("\n");
    sb.append("    ciudad: ").append(toIndentedString(ciudad)).append("\n");
    sb.append("    razolSocial: ").append(toIndentedString(razolSocial)).append("\n");
    sb.append("    nroResolucion: ").append(toIndentedString(nroResolucion)).append("\n");
    sb.append("    organismo: ").append(toIndentedString(organismo)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
    sb.append("    causal: ").append(toIndentedString(causal)).append("\n");
    sb.append("    fechaInicialSol: ").append(toIndentedString(fechaInicialSol)).append("\n");
    sb.append("    fechaBaja: ").append(toIndentedString(fechaBaja)).append("\n");
    sb.append("    usuarioAct: ").append(toIndentedString(usuarioAct)).append("\n");
    sb.append("    fechaAct: ").append(toIndentedString(fechaAct)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

