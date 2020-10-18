package uy.com.antel.fact.electronica.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import uy.com.antel.fact.electronica.model.PerfilUsuarioVO;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class PerfilVO   {
  
  private Long id = null;
  private String descripcion = null;
  private String fechaBaja = null;
  private String usuarioAct = null;
  private String fechaAct = null;
  private List<PerfilUsuarioVO> usuarios = new ArrayList<PerfilUsuarioVO>();

  /**
   **/
  public PerfilVO id(Long id) {
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
  public PerfilVO descripcion(String descripcion) {
    this.descripcion = descripcion;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("descripcion")
  public String getDescripcion() {
    return descripcion;
  }
  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  /**
   **/
  public PerfilVO fechaBaja(String fechaBaja) {
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
  public PerfilVO usuarioAct(String usuarioAct) {
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
  public PerfilVO fechaAct(String fechaAct) {
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
  public PerfilVO usuarios(List<PerfilUsuarioVO> usuarios) {
    this.usuarios = usuarios;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("usuarios")
  public List<PerfilUsuarioVO> getUsuarios() {
    return usuarios;
  }
  public void setUsuarios(List<PerfilUsuarioVO> usuarios) {
    this.usuarios = usuarios;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerfilVO perfil = (PerfilVO) o;
    return Objects.equals(id, perfil.id) &&
        Objects.equals(descripcion, perfil.descripcion) &&
        Objects.equals(fechaBaja, perfil.fechaBaja) &&
        Objects.equals(usuarioAct, perfil.usuarioAct) &&
        Objects.equals(fechaAct, perfil.fechaAct) &&
        Objects.equals(usuarios, perfil.usuarios);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descripcion, fechaBaja, usuarioAct, fechaAct, usuarios);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Perfil {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    descripcion: ").append(toIndentedString(descripcion)).append("\n");
    sb.append("    fechaBaja: ").append(toIndentedString(fechaBaja)).append("\n");
    sb.append("    usuarioAct: ").append(toIndentedString(usuarioAct)).append("\n");
    sb.append("    fechaAct: ").append(toIndentedString(fechaAct)).append("\n");
    sb.append("    usuarios: ").append(toIndentedString(usuarios)).append("\n");
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

