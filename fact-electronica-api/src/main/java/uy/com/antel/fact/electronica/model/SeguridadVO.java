package uy.com.antel.fact.electronica.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import uy.com.antel.fact.electronica.model.SolicitudServicioVO;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class SeguridadVO   {
  
  private Long id = null;
  private List<SolicitudServicioVO> solicitud = new ArrayList<SolicitudServicioVO>();
  private Long tipo = null;
  private String estado = null;
  private String usuarioAct = null;
  private String fechaAct = null;

  /**
   **/
  public SeguridadVO id(Long id) {
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
  public SeguridadVO solicitud(List<SolicitudServicioVO> solicitud) {
    this.solicitud = solicitud;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("solicitud")
  public List<SolicitudServicioVO> getSolicitud() {
    return solicitud;
  }
  public void setSolicitud(List<SolicitudServicioVO> solicitud) {
    this.solicitud = solicitud;
  }

  /**
   **/
  public SeguridadVO tipo(Long tipo) {
    this.tipo = tipo;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tipo")
  public Long getTipo() {
    return tipo;
  }
  public void setTipo(Long tipo) {
    this.tipo = tipo;
  }

  /**
   **/
  public SeguridadVO estado(String estado) {
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
  public SeguridadVO usuarioAct(String usuarioAct) {
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
  public SeguridadVO fechaAct(String fechaAct) {
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
    SeguridadVO seguridad = (SeguridadVO) o;
    return Objects.equals(id, seguridad.id) &&
        Objects.equals(solicitud, seguridad.solicitud) &&
        Objects.equals(tipo, seguridad.tipo) &&
        Objects.equals(estado, seguridad.estado) &&
        Objects.equals(usuarioAct, seguridad.usuarioAct) &&
        Objects.equals(fechaAct, seguridad.fechaAct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, solicitud, tipo, estado, usuarioAct, fechaAct);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Seguridad {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    solicitud: ").append(toIndentedString(solicitud)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
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

