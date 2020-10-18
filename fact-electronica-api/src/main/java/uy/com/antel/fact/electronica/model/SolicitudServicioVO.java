package uy.com.antel.fact.electronica.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import uy.com.antel.fact.electronica.model.ClienteVO;
import uy.com.antel.fact.electronica.model.SeguridadVO;
import uy.com.antel.fact.electronica.model.SolicitudInformacionVO;
import uy.com.antel.fact.electronica.model.UsuarioVO;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class SolicitudServicioVO   {
  
  private Long id = null;
  private UsuarioVO usuario = null;
  private String cuenta = null;
  private String tipoSolicitud = null;
  private String horaInicial = null;
  private String horaFinal = null;
  private String nroResolucion = null;
  private String estado = null;
  private String observacionEstado = null;
  private String causal = null;
  private String fechaBloqueo = null;
  private String usuarioBloqueado = null;
  private String fechaBaja = null;
  private String fechaInicialSol = null;
  private Integer vis = null;
  private String usuarioAct = null;
  private String fechaAct = null;
  private SeguridadVO seguridad = null;
  private ClienteVO cliente = null;
  private SolicitudInformacionVO solicitudInformacion = null;

  /**
   **/
  public SolicitudServicioVO id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  public SolicitudServicioVO usuario(UsuarioVO usuario) {
    this.usuario = usuario;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("usuario")
  public UsuarioVO getUsuario() {
    return usuario;
  }
  public void setUsuario(UsuarioVO usuario) {
    this.usuario = usuario;
  }

  /**
   **/
  public SolicitudServicioVO cuenta(String cuenta) {
    this.cuenta = cuenta;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cuenta")
  public String getCuenta() {
    return cuenta;
  }
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

  /**
   **/
  public SolicitudServicioVO tipoSolicitud(String tipoSolicitud) {
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
  public SolicitudServicioVO horaInicial(String horaInicial) {
    this.horaInicial = horaInicial;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("horaInicial")
  public String getHoraInicial() {
    return horaInicial;
  }
  public void setHoraInicial(String horaInicial) {
    this.horaInicial = horaInicial;
  }

  /**
   **/
  public SolicitudServicioVO horaFinal(String horaFinal) {
    this.horaFinal = horaFinal;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("horaFinal")
  public String getHoraFinal() {
    return horaFinal;
  }
  public void setHoraFinal(String horaFinal) {
    this.horaFinal = horaFinal;
  }

  /**
   **/
  public SolicitudServicioVO nroResolucion(String nroResolucion) {
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
  public SolicitudServicioVO estado(String estado) {
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
  public SolicitudServicioVO observacionEstado(String observacionEstado) {
    this.observacionEstado = observacionEstado;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("observacionEstado")
  public String getObservacionEstado() {
    return observacionEstado;
  }
  public void setObservacionEstado(String observacionEstado) {
    this.observacionEstado = observacionEstado;
  }

  /**
   **/
  public SolicitudServicioVO causal(String causal) {
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
  public SolicitudServicioVO fechaBloqueo(String fechaBloqueo) {
    this.fechaBloqueo = fechaBloqueo;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("fechaBloqueo")
  public String getFechaBloqueo() {
    return fechaBloqueo;
  }
  public void setFechaBloqueo(String fechaBloqueo) {
    this.fechaBloqueo = fechaBloqueo;
  }

  /**
   **/
  public SolicitudServicioVO usuarioBloqueado(String usuarioBloqueado) {
    this.usuarioBloqueado = usuarioBloqueado;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("usuarioBloqueado")
  public String getUsuarioBloqueado() {
    return usuarioBloqueado;
  }
  public void setUsuarioBloqueado(String usuarioBloqueado) {
    this.usuarioBloqueado = usuarioBloqueado;
  }

  /**
   **/
  public SolicitudServicioVO fechaBaja(String fechaBaja) {
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
  public SolicitudServicioVO fechaInicialSol(String fechaInicialSol) {
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
  public SolicitudServicioVO vis(Integer vis) {
    this.vis = vis;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("vis")
  public Integer getVis() {
    return vis;
  }
  public void setVis(Integer vis) {
    this.vis = vis;
  }

  /**
   **/
  public SolicitudServicioVO usuarioAct(String usuarioAct) {
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
  public SolicitudServicioVO fechaAct(String fechaAct) {
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

  /**
   **/
  public SolicitudServicioVO seguridad(SeguridadVO seguridad) {
    this.seguridad = seguridad;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("seguridad")
  public SeguridadVO getSeguridad() {
    return seguridad;
  }
  public void setSeguridad(SeguridadVO seguridad) {
    this.seguridad = seguridad;
  }

  /**
   **/
  public SolicitudServicioVO cliente(ClienteVO cliente) {
    this.cliente = cliente;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cliente")
  public ClienteVO getCliente() {
    return cliente;
  }
  public void setCliente(ClienteVO cliente) {
    this.cliente = cliente;
  }

  /**
   **/
  public SolicitudServicioVO solicitudInformacion(SolicitudInformacionVO solicitudInformacion) {
    this.solicitudInformacion = solicitudInformacion;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("solicitudInformacion")
  public SolicitudInformacionVO getSolicitudInformacion() {
    return solicitudInformacion;
  }
  public void setSolicitudInformacion(SolicitudInformacionVO solicitudInformacion) {
    this.solicitudInformacion = solicitudInformacion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SolicitudServicioVO solicitudServicio = (SolicitudServicioVO) o;
    return Objects.equals(id, solicitudServicio.id) &&
        Objects.equals(usuario, solicitudServicio.usuario) &&
        Objects.equals(cuenta, solicitudServicio.cuenta) &&
        Objects.equals(tipoSolicitud, solicitudServicio.tipoSolicitud) &&
        Objects.equals(horaInicial, solicitudServicio.horaInicial) &&
        Objects.equals(horaFinal, solicitudServicio.horaFinal) &&
        Objects.equals(nroResolucion, solicitudServicio.nroResolucion) &&
        Objects.equals(estado, solicitudServicio.estado) &&
        Objects.equals(observacionEstado, solicitudServicio.observacionEstado) &&
        Objects.equals(causal, solicitudServicio.causal) &&
        Objects.equals(fechaBloqueo, solicitudServicio.fechaBloqueo) &&
        Objects.equals(usuarioBloqueado, solicitudServicio.usuarioBloqueado) &&
        Objects.equals(fechaBaja, solicitudServicio.fechaBaja) &&
        Objects.equals(fechaInicialSol, solicitudServicio.fechaInicialSol) &&
        Objects.equals(vis, solicitudServicio.vis) &&
        Objects.equals(usuarioAct, solicitudServicio.usuarioAct) &&
        Objects.equals(fechaAct, solicitudServicio.fechaAct) &&
        Objects.equals(seguridad, solicitudServicio.seguridad) &&
        Objects.equals(cliente, solicitudServicio.cliente) &&
        Objects.equals(solicitudInformacion, solicitudServicio.solicitudInformacion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, usuario, cuenta, tipoSolicitud, horaInicial, horaFinal, nroResolucion, estado, observacionEstado, causal, fechaBloqueo, usuarioBloqueado, fechaBaja, fechaInicialSol, vis, usuarioAct, fechaAct, seguridad, cliente, solicitudInformacion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolicitudServicio {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    usuario: ").append(toIndentedString(usuario)).append("\n");
    sb.append("    cuenta: ").append(toIndentedString(cuenta)).append("\n");
    sb.append("    tipoSolicitud: ").append(toIndentedString(tipoSolicitud)).append("\n");
    sb.append("    horaInicial: ").append(toIndentedString(horaInicial)).append("\n");
    sb.append("    horaFinal: ").append(toIndentedString(horaFinal)).append("\n");
    sb.append("    nroResolucion: ").append(toIndentedString(nroResolucion)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
    sb.append("    observacionEstado: ").append(toIndentedString(observacionEstado)).append("\n");
    sb.append("    causal: ").append(toIndentedString(causal)).append("\n");
    sb.append("    fechaBloqueo: ").append(toIndentedString(fechaBloqueo)).append("\n");
    sb.append("    usuarioBloqueado: ").append(toIndentedString(usuarioBloqueado)).append("\n");
    sb.append("    fechaBaja: ").append(toIndentedString(fechaBaja)).append("\n");
    sb.append("    fechaInicialSol: ").append(toIndentedString(fechaInicialSol)).append("\n");
    sb.append("    vis: ").append(toIndentedString(vis)).append("\n");
    sb.append("    usuarioAct: ").append(toIndentedString(usuarioAct)).append("\n");
    sb.append("    fechaAct: ").append(toIndentedString(fechaAct)).append("\n");
    sb.append("    seguridad: ").append(toIndentedString(seguridad)).append("\n");
    sb.append("    cliente: ").append(toIndentedString(cliente)).append("\n");
    sb.append("    solicitudInformacion: ").append(toIndentedString(solicitudInformacion)).append("\n");
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

