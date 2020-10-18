package uy.com.antel.fact.electronica.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import uy.com.antel.fact.electronica.model.DetalleSolicitudGeneradaVO;
import uy.com.antel.fact.electronica.model.SolicitudInformacionVO;
import uy.com.antel.fact.electronica.model.UsuarioVO;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class SolicitudGeneradaVO   {
  
  private Long id = null;
  private Integer numeroCor = null;
  private SolicitudInformacionVO solicitudInformacion = null;
  private UsuarioVO usuario = null;
  private String tipoSolicitud = null;
  private String fechaSol = null;
  private String fechaGen = null;
  private String observacion = null;
  private String usuarioAct = null;
  private String fechaAct = null;
  private DetalleSolicitudGeneradaVO detalleSolicitudGenerada = null;

  /**
   **/
  public SolicitudGeneradaVO id(Long id) {
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
  public SolicitudGeneradaVO numeroCor(Integer numeroCor) {
    this.numeroCor = numeroCor;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("numeroCor")
  public Integer getNumeroCor() {
    return numeroCor;
  }
  public void setNumeroCor(Integer numeroCor) {
    this.numeroCor = numeroCor;
  }

  /**
   **/
  public SolicitudGeneradaVO solicitudInformacion(SolicitudInformacionVO solicitudInformacion) {
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

  /**
   **/
  public SolicitudGeneradaVO usuario(UsuarioVO usuario) {
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
  public SolicitudGeneradaVO tipoSolicitud(String tipoSolicitud) {
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
  public SolicitudGeneradaVO fechaSol(String fechaSol) {
    this.fechaSol = fechaSol;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("fechaSol")
  public String getFechaSol() {
    return fechaSol;
  }
  public void setFechaSol(String fechaSol) {
    this.fechaSol = fechaSol;
  }

  /**
   **/
  public SolicitudGeneradaVO fechaGen(String fechaGen) {
    this.fechaGen = fechaGen;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("fechaGen")
  public String getFechaGen() {
    return fechaGen;
  }
  public void setFechaGen(String fechaGen) {
    this.fechaGen = fechaGen;
  }

  /**
   **/
  public SolicitudGeneradaVO observacion(String observacion) {
    this.observacion = observacion;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("observacion")
  public String getObservacion() {
    return observacion;
  }
  public void setObservacion(String observacion) {
    this.observacion = observacion;
  }

  /**
   **/
  public SolicitudGeneradaVO usuarioAct(String usuarioAct) {
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
  public SolicitudGeneradaVO fechaAct(String fechaAct) {
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
  public SolicitudGeneradaVO detalleSolicitudGenerada(DetalleSolicitudGeneradaVO detalleSolicitudGenerada) {
    this.detalleSolicitudGenerada = detalleSolicitudGenerada;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("detalleSolicitudGenerada")
  public DetalleSolicitudGeneradaVO getDetalleSolicitudGenerada() {
    return detalleSolicitudGenerada;
  }
  public void setDetalleSolicitudGenerada(DetalleSolicitudGeneradaVO detalleSolicitudGenerada) {
    this.detalleSolicitudGenerada = detalleSolicitudGenerada;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SolicitudGeneradaVO solicitudGenerada = (SolicitudGeneradaVO) o;
    return Objects.equals(id, solicitudGenerada.id) &&
        Objects.equals(numeroCor, solicitudGenerada.numeroCor) &&
        Objects.equals(solicitudInformacion, solicitudGenerada.solicitudInformacion) &&
        Objects.equals(usuario, solicitudGenerada.usuario) &&
        Objects.equals(tipoSolicitud, solicitudGenerada.tipoSolicitud) &&
        Objects.equals(fechaSol, solicitudGenerada.fechaSol) &&
        Objects.equals(fechaGen, solicitudGenerada.fechaGen) &&
        Objects.equals(observacion, solicitudGenerada.observacion) &&
        Objects.equals(usuarioAct, solicitudGenerada.usuarioAct) &&
        Objects.equals(fechaAct, solicitudGenerada.fechaAct) &&
        Objects.equals(detalleSolicitudGenerada, solicitudGenerada.detalleSolicitudGenerada);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, numeroCor, solicitudInformacion, usuario, tipoSolicitud, fechaSol, fechaGen, observacion, usuarioAct, fechaAct, detalleSolicitudGenerada);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolicitudGenerada {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    numeroCor: ").append(toIndentedString(numeroCor)).append("\n");
    sb.append("    solicitudInformacion: ").append(toIndentedString(solicitudInformacion)).append("\n");
    sb.append("    usuario: ").append(toIndentedString(usuario)).append("\n");
    sb.append("    tipoSolicitud: ").append(toIndentedString(tipoSolicitud)).append("\n");
    sb.append("    fechaSol: ").append(toIndentedString(fechaSol)).append("\n");
    sb.append("    fechaGen: ").append(toIndentedString(fechaGen)).append("\n");
    sb.append("    observacion: ").append(toIndentedString(observacion)).append("\n");
    sb.append("    usuarioAct: ").append(toIndentedString(usuarioAct)).append("\n");
    sb.append("    fechaAct: ").append(toIndentedString(fechaAct)).append("\n");
    sb.append("    detalleSolicitudGenerada: ").append(toIndentedString(detalleSolicitudGenerada)).append("\n");
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

