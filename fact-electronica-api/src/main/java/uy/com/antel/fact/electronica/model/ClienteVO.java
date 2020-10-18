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



public class ClienteVO   {
  
  private Long id = null;
  private List<SolicitudServicioVO> solicitudesServicio = new ArrayList<SolicitudServicioVO>();
  private String fechaBaja = null;
  private String usuarioAct = null;
  private String fechaAct = null;

  /**
   **/
  public ClienteVO id(Long id) {
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
  public ClienteVO solicitudesServicio(List<SolicitudServicioVO> solicitudesServicio) {
    this.solicitudesServicio = solicitudesServicio;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("solicitudesServicio")
  public List<SolicitudServicioVO> getSolicitudesServicio() {
    return solicitudesServicio;
  }
  public void setSolicitudesServicio(List<SolicitudServicioVO> solicitudesServicio) {
    this.solicitudesServicio = solicitudesServicio;
  }

  /**
   **/
  public ClienteVO fechaBaja(String fechaBaja) {
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
  public ClienteVO usuarioAct(String usuarioAct) {
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
  public ClienteVO fechaAct(String fechaAct) {
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
    ClienteVO cliente = (ClienteVO) o;
    return Objects.equals(id, cliente.id) &&
        Objects.equals(solicitudesServicio, cliente.solicitudesServicio) &&
        Objects.equals(fechaBaja, cliente.fechaBaja) &&
        Objects.equals(usuarioAct, cliente.usuarioAct) &&
        Objects.equals(fechaAct, cliente.fechaAct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, solicitudesServicio, fechaBaja, usuarioAct, fechaAct);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cliente {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    solicitudesServicio: ").append(toIndentedString(solicitudesServicio)).append("\n");
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

