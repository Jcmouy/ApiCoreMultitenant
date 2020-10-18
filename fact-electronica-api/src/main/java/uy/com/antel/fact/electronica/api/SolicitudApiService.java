package uy.com.antel.fact.electronica.api;

import uy.com.antel.fact.electronica.api.*;
import uy.com.antel.fact.electronica.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import uy.com.antel.fact.electronica.model.SolicitudGeneradaVO;
import uy.com.antel.fact.electronica.model.SolicitudInformacionVO;
import uy.com.antel.fact.electronica.model.SolicitudServicioVO;
import uy.com.antel.fact.electronica.model.UsuarioVO;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2020-09-15T15:57:29.783Z")
public interface SolicitudApiService {
      public void addSolicitudGenerada(SolicitudGeneradaVO body, SecurityContext securityContext);
      public void addSolicitudInformacion(SolicitudInformacionVO body, SecurityContext securityContext);
      public void addSolicitudServicio(SolicitudServicioVO body, SecurityContext securityContext);
      public void addUsuario(UsuarioVO body, SecurityContext securityContext);
      public void deleteSolicitudGenerada(Long solicitudGeneradaId, String bearer, SecurityContext securityContext);
      public void deleteSolicitudGeneradaBySolicitudInformacion(Long solicitudInformacionId, String bearer, SecurityContext securityContext);
      public void deleteSolicitudInformacion(Long solicitudInformacionId, String bearer, SecurityContext securityContext);
      public void deleteSolicitudInformacionBySolicitudServicio(Long solicitudServicioId, String bearer, SecurityContext securityContext);
      public void deleteSolicitudServicio(Long solicitudServicioId, String bearer, SecurityContext securityContext);
      public void deleteSolicitudServicioByUsuario(Long usuarioId, String bearer, SecurityContext securityContext);
      public void deleteUsuario(Long usuarioId, String bearer, SecurityContext securityContext);
      public List<UsuarioVO> findAllSolicitudGenerada(SecurityContext securityContext);
      public List<SolicitudInformacionVO> findAllSolicitudInformacion(SecurityContext securityContext);
      public List<SolicitudServicioVO> findAllSolicitudServicio(SecurityContext securityContext);
      public List<UsuarioVO> findAllUsuario(SecurityContext securityContext);
      public SolicitudGeneradaVO getSolicitudGeneradaById(Long solicitudGeneradaId, SecurityContext securityContext);
      public List<SolicitudGeneradaVO> getSolicitudGeneradaBySolicitudInformacion(Long solicitudInformacionId, SecurityContext securityContext);
      public SolicitudInformacionVO getSolicitudInformacionById(Long solicitudInformacionId, SecurityContext securityContext);
      public List<SolicitudInformacionVO> getSolicitudInformacionByUsuario(Long usuarioId, SecurityContext securityContext);
      public List<SolicitudInformacionVO> getSolicitudInformacionBysolicitudServicio(Long solicitudServicioId, SecurityContext securityContext);
      public SolicitudServicioVO getSolicitudServicioById(Long solicitudServicioId, SecurityContext securityContext);
      public UsuarioVO getUsuarioById(Long usuarioId, SecurityContext securityContext);
      public void updateSolicitudGenerada(Long solicitudGeneradaId, SolicitudGeneradaVO body, SecurityContext securityContext);
      public void updateSolicitudInformacion(Long solicitudInformacionId, SolicitudInformacionVO body, SecurityContext securityContext);
      public void updateSolicitudServicio(Long solicitudServicioId, SolicitudServicioVO body, SecurityContext securityContext);
      public void updateSolicitudServicioByUsuario(Long usuarioId, SolicitudServicioVO body, SecurityContext securityContext);
      public void updateUsuario(Long usuarioId, UsuarioVO body, SecurityContext securityContext);
}
