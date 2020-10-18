package uy.com.antel.fact.electronica.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import uy.com.antel.fact.electronica.model.SolicitudInformacionVO;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class UsuarioSolicitudInfoVO   {
  
  private Long id = null;
  private Long idSolInf = null;
  private String fechaBaja = null;
  private String usuarioAct = null;
  private String fechaAct = null;
  private SolicitudInformacionVO solicitudInformacion = null;

  /**
   **/
  public UsuarioSolicitudInfoVO id(Long id) {
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
  public UsuarioSolicitudInfoVO idSolInf(Long idSolInf) {
    this.idSolInf = idSolInf;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("idSolInf")
  public Long getIdSolInf() {
    return idSolInf;
  }
  public void setIdSolInf(Long idSolInf) {
    this.idSolInf = idSolInf;
  }

  /**
   **/
  public UsuarioSolicitudInfoVO fechaBaja(String fechaBaja) {
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
  public UsuarioSolicitudInfoVO usuarioAct(String usuarioAct) {
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
  public UsuarioSolicitudInfoVO fechaAct(String fechaAct) {
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
  public UsuarioSolicitudInfoVO solicitudInformacion(SolicitudInformacionVO solicitudInformacion) {
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
    UsuarioSolicitudInfoVO usuarioSolicitudInfo = (UsuarioSolicitudInfoVO) o;
    return Objects.equals(id, usuarioSolicitudInfo.id) &&
        Objects.equals(idSolInf, usuarioSolicitudInfo.idSolInf) &&
        Objects.equals(fechaBaja, usuarioSolicitudInfo.fechaBaja) &&
        Objects.equals(usuarioAct, usuarioSolicitudInfo.usuarioAct) &&
        Objects.equals(fechaAct, usuarioSolicitudInfo.fechaAct) &&
        Objects.equals(solicitudInformacion, usuarioSolicitudInfo.solicitudInformacion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idSolInf, fechaBaja, usuarioAct, fechaAct, solicitudInformacion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsuarioSolicitudInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idSolInf: ").append(toIndentedString(idSolInf)).append("\n");
    sb.append("    fechaBaja: ").append(toIndentedString(fechaBaja)).append("\n");
    sb.append("    usuarioAct: ").append(toIndentedString(usuarioAct)).append("\n");
    sb.append("    fechaAct: ").append(toIndentedString(fechaAct)).append("\n");
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

