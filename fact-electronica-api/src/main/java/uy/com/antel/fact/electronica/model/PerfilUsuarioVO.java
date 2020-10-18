package uy.com.antel.fact.electronica.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import uy.com.antel.fact.electronica.model.PerfilVO;
import uy.com.antel.fact.electronica.model.UsuarioVO;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class PerfilUsuarioVO   {
  
  private Long uid = null;
  private Long idPerfil = null;
  private String fechaBaja = null;
  private Long usuarioAct = null;
  private UsuarioVO usuario = null;
  private PerfilVO perfil = null;

  /**
   **/
  public PerfilUsuarioVO uid(Long uid) {
    this.uid = uid;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("uid")
  public Long getUid() {
    return uid;
  }
  public void setUid(Long uid) {
    this.uid = uid;
  }

  /**
   **/
  public PerfilUsuarioVO idPerfil(Long idPerfil) {
    this.idPerfil = idPerfil;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("idPerfil")
  public Long getIdPerfil() {
    return idPerfil;
  }
  public void setIdPerfil(Long idPerfil) {
    this.idPerfil = idPerfil;
  }

  /**
   **/
  public PerfilUsuarioVO fechaBaja(String fechaBaja) {
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
  public PerfilUsuarioVO usuarioAct(Long usuarioAct) {
    this.usuarioAct = usuarioAct;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("usuarioAct")
  public Long getUsuarioAct() {
    return usuarioAct;
  }
  public void setUsuarioAct(Long usuarioAct) {
    this.usuarioAct = usuarioAct;
  }

  /**
   **/
  public PerfilUsuarioVO usuario(UsuarioVO usuario) {
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
  public PerfilUsuarioVO perfil(PerfilVO perfil) {
    this.perfil = perfil;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("perfil")
  public PerfilVO getPerfil() {
    return perfil;
  }
  public void setPerfil(PerfilVO perfil) {
    this.perfil = perfil;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerfilUsuarioVO perfilUsuario = (PerfilUsuarioVO) o;
    return Objects.equals(uid, perfilUsuario.uid) &&
        Objects.equals(idPerfil, perfilUsuario.idPerfil) &&
        Objects.equals(fechaBaja, perfilUsuario.fechaBaja) &&
        Objects.equals(usuarioAct, perfilUsuario.usuarioAct) &&
        Objects.equals(usuario, perfilUsuario.usuario) &&
        Objects.equals(perfil, perfilUsuario.perfil);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, idPerfil, fechaBaja, usuarioAct, usuario, perfil);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerfilUsuario {\n");
    
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    idPerfil: ").append(toIndentedString(idPerfil)).append("\n");
    sb.append("    fechaBaja: ").append(toIndentedString(fechaBaja)).append("\n");
    sb.append("    usuarioAct: ").append(toIndentedString(usuarioAct)).append("\n");
    sb.append("    usuario: ").append(toIndentedString(usuario)).append("\n");
    sb.append("    perfil: ").append(toIndentedString(perfil)).append("\n");
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

