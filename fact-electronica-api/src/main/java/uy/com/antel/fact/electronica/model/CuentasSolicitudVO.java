package uy.com.antel.fact.electronica.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class CuentasSolicitudVO   {
  
  private Long id = null;
  private Long idSolInf = null;

  /**
   **/
  public CuentasSolicitudVO id(Long id) {
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
  public CuentasSolicitudVO idSolInf(Long idSolInf) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CuentasSolicitudVO cuentasSolicitud = (CuentasSolicitudVO) o;
    return Objects.equals(id, cuentasSolicitud.id) &&
        Objects.equals(idSolInf, cuentasSolicitud.idSolInf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idSolInf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CuentasSolicitud {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idSolInf: ").append(toIndentedString(idSolInf)).append("\n");
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

