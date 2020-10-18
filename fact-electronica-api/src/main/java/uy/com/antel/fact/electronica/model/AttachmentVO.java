package uy.com.antel.fact.electronica.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class AttachmentVO   {
  
  private Long id = null;
  private String nombre = null;
  private Long tamano = null;
  private String contentType = null;
  private String modificado = null;

  /**
   **/
  public AttachmentVO id(Long id) {
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
  public AttachmentVO nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("nombre")
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   **/
  public AttachmentVO tamano(Long tamano) {
    this.tamano = tamano;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tamano")
  public Long getTamano() {
    return tamano;
  }
  public void setTamano(Long tamano) {
    this.tamano = tamano;
  }

  /**
   **/
  public AttachmentVO contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("contentType")
  public String getContentType() {
    return contentType;
  }
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  /**
   **/
  public AttachmentVO modificado(String modificado) {
    this.modificado = modificado;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("modificado")
  public String getModificado() {
    return modificado;
  }
  public void setModificado(String modificado) {
    this.modificado = modificado;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentVO attachment = (AttachmentVO) o;
    return Objects.equals(id, attachment.id) &&
        Objects.equals(nombre, attachment.nombre) &&
        Objects.equals(tamano, attachment.tamano) &&
        Objects.equals(contentType, attachment.contentType) &&
        Objects.equals(modificado, attachment.modificado);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nombre, tamano, contentType, modificado);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    tamano: ").append(toIndentedString(tamano)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    modificado: ").append(toIndentedString(modificado)).append("\n");
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

