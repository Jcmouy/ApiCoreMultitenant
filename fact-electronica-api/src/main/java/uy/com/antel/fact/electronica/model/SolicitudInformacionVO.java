package uy.com.antel.fact.electronica.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import uy.com.antel.fact.electronica.model.CuentasSolicitudVO;
import uy.com.antel.fact.electronica.model.SolicitudGeneradaVO;
import uy.com.antel.fact.electronica.model.SolicitudServicioVO;
import uy.com.antel.fact.electronica.model.UsuarioSolicitudInfoVO;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class SolicitudInformacionVO   {
  
  private Long id = null;
  private List<SolicitudServicioVO> solicitudServicio = new ArrayList<SolicitudServicioVO>();
  private String tipoSolicitud = null;
  private String detalleSolInformacion = null;
  private String notaDis = null;
  private String notDes = null;
  private String fechaBaja = null;
  private String usuarioAct = null;
  private String fechaAct = null;
  private List<SolicitudGeneradaVO> solicitudesGeneradas = new ArrayList<SolicitudGeneradaVO>();
  private CuentasSolicitudVO cuentasSolicitud = null;
  private List<UsuarioSolicitudInfoVO> usuarioSolicitudInfo = new ArrayList<UsuarioSolicitudInfoVO>();

  /**
   **/
  public SolicitudInformacionVO id(Long id) {
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
  public SolicitudInformacionVO solicitudServicio(List<SolicitudServicioVO> solicitudServicio) {
    this.solicitudServicio = solicitudServicio;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("solicitudServicio")
  public List<SolicitudServicioVO> getSolicitudServicio() {
    return solicitudServicio;
  }
  public void setSolicitudServicio(List<SolicitudServicioVO> solicitudServicio) {
    this.solicitudServicio = solicitudServicio;
  }

  /**
   **/
  public SolicitudInformacionVO tipoSolicitud(String tipoSolicitud) {
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
  public SolicitudInformacionVO detalleSolInformacion(String detalleSolInformacion) {
    this.detalleSolInformacion = detalleSolInformacion;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("detalleSolInformacion")
  public String getDetalleSolInformacion() {
    return detalleSolInformacion;
  }
  public void setDetalleSolInformacion(String detalleSolInformacion) {
    this.detalleSolInformacion = detalleSolInformacion;
  }

  /**
   **/
  public SolicitudInformacionVO notaDis(String notaDis) {
    this.notaDis = notaDis;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("notaDis")
  public String getNotaDis() {
    return notaDis;
  }
  public void setNotaDis(String notaDis) {
    this.notaDis = notaDis;
  }

  /**
   **/
  public SolicitudInformacionVO notDes(String notDes) {
    this.notDes = notDes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("notDes")
  public String getNotDes() {
    return notDes;
  }
  public void setNotDes(String notDes) {
    this.notDes = notDes;
  }

  /**
   **/
  public SolicitudInformacionVO fechaBaja(String fechaBaja) {
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
  public SolicitudInformacionVO usuarioAct(String usuarioAct) {
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
  public SolicitudInformacionVO fechaAct(String fechaAct) {
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
  public SolicitudInformacionVO solicitudesGeneradas(List<SolicitudGeneradaVO> solicitudesGeneradas) {
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

  /**
   **/
  public SolicitudInformacionVO cuentasSolicitud(CuentasSolicitudVO cuentasSolicitud) {
    this.cuentasSolicitud = cuentasSolicitud;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cuentasSolicitud")
  public CuentasSolicitudVO getCuentasSolicitud() {
    return cuentasSolicitud;
  }
  public void setCuentasSolicitud(CuentasSolicitudVO cuentasSolicitud) {
    this.cuentasSolicitud = cuentasSolicitud;
  }

  /**
   **/
  public SolicitudInformacionVO usuarioSolicitudInfo(List<UsuarioSolicitudInfoVO> usuarioSolicitudInfo) {
    this.usuarioSolicitudInfo = usuarioSolicitudInfo;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("usuarioSolicitudInfo")
  public List<UsuarioSolicitudInfoVO> getUsuarioSolicitudInfo() {
    return usuarioSolicitudInfo;
  }
  public void setUsuarioSolicitudInfo(List<UsuarioSolicitudInfoVO> usuarioSolicitudInfo) {
    this.usuarioSolicitudInfo = usuarioSolicitudInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SolicitudInformacionVO solicitudInformacion = (SolicitudInformacionVO) o;
    return Objects.equals(id, solicitudInformacion.id) &&
        Objects.equals(solicitudServicio, solicitudInformacion.solicitudServicio) &&
        Objects.equals(tipoSolicitud, solicitudInformacion.tipoSolicitud) &&
        Objects.equals(detalleSolInformacion, solicitudInformacion.detalleSolInformacion) &&
        Objects.equals(notaDis, solicitudInformacion.notaDis) &&
        Objects.equals(notDes, solicitudInformacion.notDes) &&
        Objects.equals(fechaBaja, solicitudInformacion.fechaBaja) &&
        Objects.equals(usuarioAct, solicitudInformacion.usuarioAct) &&
        Objects.equals(fechaAct, solicitudInformacion.fechaAct) &&
        Objects.equals(solicitudesGeneradas, solicitudInformacion.solicitudesGeneradas) &&
        Objects.equals(cuentasSolicitud, solicitudInformacion.cuentasSolicitud) &&
        Objects.equals(usuarioSolicitudInfo, solicitudInformacion.usuarioSolicitudInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, solicitudServicio, tipoSolicitud, detalleSolInformacion, notaDis, notDes, fechaBaja, usuarioAct, fechaAct, solicitudesGeneradas, cuentasSolicitud, usuarioSolicitudInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolicitudInformacion {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    solicitudServicio: ").append(toIndentedString(solicitudServicio)).append("\n");
    sb.append("    tipoSolicitud: ").append(toIndentedString(tipoSolicitud)).append("\n");
    sb.append("    detalleSolInformacion: ").append(toIndentedString(detalleSolInformacion)).append("\n");
    sb.append("    notaDis: ").append(toIndentedString(notaDis)).append("\n");
    sb.append("    notDes: ").append(toIndentedString(notDes)).append("\n");
    sb.append("    fechaBaja: ").append(toIndentedString(fechaBaja)).append("\n");
    sb.append("    usuarioAct: ").append(toIndentedString(usuarioAct)).append("\n");
    sb.append("    fechaAct: ").append(toIndentedString(fechaAct)).append("\n");
    sb.append("    solicitudesGeneradas: ").append(toIndentedString(solicitudesGeneradas)).append("\n");
    sb.append("    cuentasSolicitud: ").append(toIndentedString(cuentasSolicitud)).append("\n");
    sb.append("    usuarioSolicitudInfo: ").append(toIndentedString(usuarioSolicitudInfo)).append("\n");
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

