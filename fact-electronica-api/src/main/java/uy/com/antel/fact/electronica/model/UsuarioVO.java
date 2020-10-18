package uy.com.antel.fact.electronica.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import uy.com.antel.fact.electronica.model.PerfilUsuarioVO;
import uy.com.antel.fact.electronica.model.SolicitudGeneradaVO;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class UsuarioVO   {
  
  private Long usuario = null;
  private String observacion = null;
  private String fechaBaja = null;
  private String usuarioAct = null;
  private String fechaAct = null;
  private List<PerfilUsuarioVO> perfiles = new ArrayList<PerfilUsuarioVO>();
  private String padre = null;
  private List<SolicitudGeneradaVO> solicitudesGeneradas = new ArrayList<SolicitudGeneradaVO>();

  /**
   **/
  public UsuarioVO usuario(Long usuario) {
    this.usuario = usuario;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("usuario")
  public Long getUsuario() {
    return usuario;
  }
  public void setUsuario(Long usuario) {
    this.usuario = usuario;
  }

  /**
   **/
  public UsuarioVO observacion(String observacion) {
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
  public UsuarioVO fechaBaja(String fechaBaja) {
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
  public UsuarioVO usuarioAct(String usuarioAct) {
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
  public UsuarioVO fechaAct(String fechaAct) {
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
  public UsuarioVO perfiles(List<PerfilUsuarioVO> perfiles) {
    this.perfiles = perfiles;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("perfiles")
  public List<PerfilUsuarioVO> getPerfiles() {
    return perfiles;
  }
  public void setPerfiles(List<PerfilUsuarioVO> perfiles) {
    this.perfiles = perfiles;
  }

  /**
   **/
  public UsuarioVO padre(String padre) {
    this.padre = padre;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("padre")
  public String getPadre() {
    return padre;
  }
  public void setPadre(String padre) {
    this.padre = padre;
  }

  /**
   **/
  public UsuarioVO solicitudesGeneradas(List<SolicitudGeneradaVO> solicitudesGeneradas) {
    this.solicitudesGeneradas = solicitudesGeneradas;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("solicitudesGeneradas")
  public List<SolicitudGeneradaVO> getSolicitudesGeneradas() {
    return solicitudesGeneradas;
  }
  public void setSolicitudesGeneradas(List<SolicitudGeneradaVO> solicitudesGeneradas) {
    this.solicitudesGeneradas = solicitudesGeneradas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsuarioVO usuario = (UsuarioVO) o;
    return Objects.equals(usuario, usuario.usuario) &&
        Objects.equals(observacion, usuario.observacion) &&
        Objects.equals(fechaBaja, usuario.fechaBaja) &&
        Objects.equals(usuarioAct, usuario.usuarioAct) &&
        Objects.equals(fechaAct, usuario.fechaAct) &&
        Objects.equals(perfiles, usuario.perfiles) &&
        Objects.equals(padre, usuario.padre) &&
        Objects.equals(solicitudesGeneradas, usuario.solicitudesGeneradas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usuario, observacion, fechaBaja, usuarioAct, fechaAct, perfiles, padre, solicitudesGeneradas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Usuario {\n");
    
    sb.append("    usuario: ").append(toIndentedString(usuario)).append("\n");
    sb.append("    observacion: ").append(toIndentedString(observacion)).append("\n");
    sb.append("    fechaBaja: ").append(toIndentedString(fechaBaja)).append("\n");
    sb.append("    usuarioAct: ").append(toIndentedString(usuarioAct)).append("\n");
    sb.append("    fechaAct: ").append(toIndentedString(fechaAct)).append("\n");
    sb.append("    perfiles: ").append(toIndentedString(perfiles)).append("\n");
    sb.append("    padre: ").append(toIndentedString(padre)).append("\n");
    sb.append("    solicitudesGeneradas: ").append(toIndentedString(solicitudesGeneradas)).append("\n");
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

