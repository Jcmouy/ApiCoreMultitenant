package uy.com.antel.fact.electronica.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import uy.com.antel.fact.electronica.model.SolicitudGeneradaVO;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class DetalleSolicitudGeneradaVO   {
  
  private Long codSolGen = null;
  private String nroCuenta = null;
  private String fechaSol = null;
  private String fechaGen = null;
  private Long nroCor = null;
  private String observaciones = null;
  private String usuarioAct = null;
  private String fechaAct = null;
  private List<SolicitudGeneradaVO> solicitudGenerada = new ArrayList<SolicitudGeneradaVO>();

  /**
   **/
  public DetalleSolicitudGeneradaVO codSolGen(Long codSolGen) {
    this.codSolGen = codSolGen;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("codSolGen")
  public Long getCodSolGen() {
    return codSolGen;
  }
  public void setCodSolGen(Long codSolGen) {
    this.codSolGen = codSolGen;
  }

  /**
   **/
  public DetalleSolicitudGeneradaVO nroCuenta(String nroCuenta) {
    this.nroCuenta = nroCuenta;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("nroCuenta")
  public String getNroCuenta() {
    return nroCuenta;
  }
  public void setNroCuenta(String nroCuenta) {
    this.nroCuenta = nroCuenta;
  }

  /**
   **/
  public DetalleSolicitudGeneradaVO fechaSol(String fechaSol) {
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
  public DetalleSolicitudGeneradaVO fechaGen(String fechaGen) {
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
  public DetalleSolicitudGeneradaVO nroCor(Long nroCor) {
    this.nroCor = nroCor;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("nroCor")
  public Long getNroCor() {
    return nroCor;
  }
  public void setNroCor(Long nroCor) {
    this.nroCor = nroCor;
  }

  /**
   **/
  public DetalleSolicitudGeneradaVO observaciones(String observaciones) {
    this.observaciones = observaciones;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("observaciones")
  public String getObservaciones() {
    return observaciones;
  }
  public void setObservaciones(String observaciones) {
    this.observaciones = observaciones;
  }

  /**
   **/
  public DetalleSolicitudGeneradaVO usuarioAct(String usuarioAct) {
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
  public DetalleSolicitudGeneradaVO fechaAct(String fechaAct) {
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
  public DetalleSolicitudGeneradaVO solicitudGenerada(List<SolicitudGeneradaVO> solicitudGenerada) {
    this.solicitudGenerada = solicitudGenerada;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("solicitudGenerada")
  public List<SolicitudGeneradaVO> getSolicitudGenerada() {
    return solicitudGenerada;
  }
  public void setSolicitudGenerada(List<SolicitudGeneradaVO> solicitudGenerada) {
    this.solicitudGenerada = solicitudGenerada;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetalleSolicitudGeneradaVO detalleSolicitudGenerada = (DetalleSolicitudGeneradaVO) o;
    return Objects.equals(codSolGen, detalleSolicitudGenerada.codSolGen) &&
        Objects.equals(nroCuenta, detalleSolicitudGenerada.nroCuenta) &&
        Objects.equals(fechaSol, detalleSolicitudGenerada.fechaSol) &&
        Objects.equals(fechaGen, detalleSolicitudGenerada.fechaGen) &&
        Objects.equals(nroCor, detalleSolicitudGenerada.nroCor) &&
        Objects.equals(observaciones, detalleSolicitudGenerada.observaciones) &&
        Objects.equals(usuarioAct, detalleSolicitudGenerada.usuarioAct) &&
        Objects.equals(fechaAct, detalleSolicitudGenerada.fechaAct) &&
        Objects.equals(solicitudGenerada, detalleSolicitudGenerada.solicitudGenerada);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codSolGen, nroCuenta, fechaSol, fechaGen, nroCor, observaciones, usuarioAct, fechaAct, solicitudGenerada);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetalleSolicitudGenerada {\n");
    
    sb.append("    codSolGen: ").append(toIndentedString(codSolGen)).append("\n");
    sb.append("    nroCuenta: ").append(toIndentedString(nroCuenta)).append("\n");
    sb.append("    fechaSol: ").append(toIndentedString(fechaSol)).append("\n");
    sb.append("    fechaGen: ").append(toIndentedString(fechaGen)).append("\n");
    sb.append("    nroCor: ").append(toIndentedString(nroCor)).append("\n");
    sb.append("    observaciones: ").append(toIndentedString(observaciones)).append("\n");
    sb.append("    usuarioAct: ").append(toIndentedString(usuarioAct)).append("\n");
    sb.append("    fechaAct: ").append(toIndentedString(fechaAct)).append("\n");
    sb.append("    solicitudGenerada: ").append(toIndentedString(solicitudGenerada)).append("\n");
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

