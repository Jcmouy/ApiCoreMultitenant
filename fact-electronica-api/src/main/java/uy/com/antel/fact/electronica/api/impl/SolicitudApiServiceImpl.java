package uy.com.antel.fact.electronica.api.impl;

import uy.com.antel.fact.converter.SolicitudGeneradaConverter;
import uy.com.antel.fact.converter.SolicitudInformacionConverter;
import uy.com.antel.fact.converter.SolicitudServicioConverter;
import uy.com.antel.fact.converter.UsuarioConverter;
import uy.com.antel.fact.electronica.api.*;
import uy.com.antel.fact.electronica.model.SolicitudGeneradaVO;
import uy.com.antel.fact.electronica.model.SolicitudInformacionVO;
import uy.com.antel.fact.electronica.model.SolicitudServicioVO;
import uy.com.antel.fact.electronica.model.UsuarioVO;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

import com.factelcore.Application;
import com.factelcore.entity.SolicitudInformacion;
import com.factelcore.entity.SolicitudServicio;
import com.factelcore.service.SolicitudGeneradaService;
import com.factelcore.service.SolicitudInformacionService;
import com.factelcore.service.SolicitudServicioService;
import com.factelcore.service.UsuarioService;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

import java.io.InputStream;
import java.io.Serializable;
import java.sql.SQLException;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.inject.Inject;

@RequestScope
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2020-09-15T15:57:29.783Z")
public class SolicitudApiServiceImpl implements SolicitudApiService {
	  
	  
	  @Autowired
	  SolicitudInformacionService solInfServ;
	  
	
	  private SolicitudServicioService solSerServ = new SolicitudServicioService();
	  private SolicitudGeneradaService solGenServ = new SolicitudGeneradaService();
	  private UsuarioService usuServ = new UsuarioService();
	  private SolicitudInformacionConverter solInfConv = new SolicitudInformacionConverter();
	  private SolicitudServicioConverter solServConv = new SolicitudServicioConverter();
	  private SolicitudGeneradaConverter solGenConv = new SolicitudGeneradaConverter();
	  private UsuarioConverter usuConv = new UsuarioConverter();

      @Override
      public void addSolicitudGenerada(SolicitudGeneradaVO body, SecurityContext securityContext) {
    	  solGenServ.save(solGenConv.mapDtoToEntity(body));
    	  //return Response.ok().entity("magic!").build();
  }
      @Override
      public void addSolicitudInformacion(SolicitudInformacionVO body, SecurityContext securityContext) {
          solInfServ.save(solInfConv.mapDtoToEntity(body));
  }
      @Override
      public void addSolicitudServicio(SolicitudServicioVO body, SecurityContext securityContext) {
    	  solSerServ.save(solServConv.mapDtoToEntity(body));
  }
      @Override
      public void addUsuario(UsuarioVO body, SecurityContext securityContext) {
    	  usuServ.save(usuConv.mapDtoToEntity(body));
  }
      @Override
      public void deleteSolicitudGenerada(Long solicitudGeneradaId, String bearer, SecurityContext securityContext) {
    	  Integer solGenId = solicitudGeneradaId != null ? solicitudGeneradaId.intValue() : null;
    	  solGenServ.remove(solGenId);
  }
      @Override
      public void deleteSolicitudGeneradaBySolicitudInformacion(Long solicitudInformacionId, String bearer, SecurityContext securityContext) {
    	  Integer solInfId = solicitudInformacionId != null ? solicitudInformacionId.intValue() : null;
    	  try {
    		solGenServ.removeBySolicitudInformacion(solInfId);
    	  } catch (SQLException e) {
			e.printStackTrace();
    	  }
  }
      @Override
      public void deleteSolicitudInformacion(Long solicitudInformacionId, String bearer, SecurityContext securityContext) {
    	  Integer solInfId = solicitudInformacionId != null ? solicitudInformacionId.intValue() : null;
    	  solInfServ.remove(solInfId);
  }
      @Override
      public void deleteSolicitudInformacionBySolicitudServicio(Long solicitudServicioId, String bearer, SecurityContext securityContext) {
    	  Integer solServId = solicitudServicioId != null ? solicitudServicioId.intValue() : null;
    	  try {
    		solInfServ.removeBySolicitudServicio(solServId);
    	  } catch (SQLException e) {
			e.printStackTrace();
    	  }
  }
      @Override
      public void deleteSolicitudServicio(Long solicitudServicioId, String bearer, SecurityContext securityContext) {
    	  Integer solServId = solicitudServicioId != null ? solicitudServicioId.intValue() : null;
    	  solSerServ.remove(solServId);
  }
      @Override
      public void deleteSolicitudServicioByUsuario(Long usuarioId, String bearer, SecurityContext securityContext) {
    	  Integer usServId = usuarioId != null ? usuarioId.intValue() : null;
    	  try {
			solSerServ.removeByUsuario(usServId);
    	  } catch (SQLException e) {
			e.printStackTrace();
    	  }
  }
      @Override
      public void deleteUsuario(Long usuarioId, String bearer, SecurityContext securityContext) {
    	  Integer usuId = usuarioId != null ? usuarioId.intValue() : null;
    	  usuServ.remove(usuId);
  }
      @Override
      public List<UsuarioVO> findAllSolicitudGenerada(SecurityContext securityContext) {
    	  List<UsuarioVO> listUsuVo = new ArrayList<>();  
          try {
        	  listUsuVo =  usuConv.mapListEntityToListDto(usuServ.getAll());
  		} catch (SQLException e) {
  			e.printStackTrace();
  		}
  		return listUsuVo;
  }
      @Override
      public List<SolicitudInformacionVO> findAllSolicitudInformacion(SecurityContext securityContext) {
    	List<SolicitudInformacionVO> listSolVo = new ArrayList<>();
    	List<SolicitudInformacion> listSolInfEntity = new ArrayList<>();
        try {
        	listSolInfEntity = solInfServ.getAll();
        	listSolVo =  solInfConv.mapListEntityToListDto(solInfServ.getAll());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listSolVo;
  }
      @Override
      public List<SolicitudServicioVO> findAllSolicitudServicio(SecurityContext securityContext) {
    	List<SolicitudServicioVO> listSolVo = new ArrayList<>();
        try {
      		listSolVo =  solServConv.mapListEntityToListDto(solSerServ.getAll());
  		} catch (SQLException e) {
  			e.printStackTrace();
  		}
  		return listSolVo;
  }
      @Override
      public List<UsuarioVO> findAllUsuario(SecurityContext securityContext) {
    	  List<UsuarioVO> listUsuVo = new ArrayList<>();  
          try {
    	    listUsuVo =  usuConv.mapListEntityToListDto(usuServ.getAll());
          } catch (SQLException e) {
			e.printStackTrace();
          }
          return listUsuVo;
  }
      @Override
      public SolicitudGeneradaVO getSolicitudGeneradaById(Long solicitudGeneradaId, SecurityContext securityContext) {
    	  Integer solGenId = solicitudGeneradaId != null ? solicitudGeneradaId.intValue() : null;
          return solGenConv.mapEntityToDto(solGenServ.getById(solGenId));
  }
      @Override
      public List<SolicitudGeneradaVO> getSolicitudGeneradaBySolicitudInformacion(Long solicitudInformacionId, SecurityContext securityContext) {
    	  Integer solInfId = solicitudInformacionId != null ? solicitudInformacionId.intValue() : null;
    	  List<SolicitudGeneradaVO> listGenVo = new ArrayList<>();  
          try {
        	  listGenVo =  solGenConv.mapListEntityToListDto(solGenServ.getBySolicitudInformacion((solInfId)));
		  } catch (SQLException e) {
  			e.printStackTrace();
		  }
  		  return listGenVo;
  }
      @Override
      public SolicitudInformacionVO getSolicitudInformacionById(Long solicitudInformacionId, SecurityContext securityContext) {
    	  Integer solInfId = solicitudInformacionId != null ? solicitudInformacionId.intValue() : null;
          return solInfConv.mapEntityToDto(solInfServ.getById(solInfId));    	  
  }
      @Override
      public List<SolicitudInformacionVO> getSolicitudInformacionByUsuario(Long usuarioId, SecurityContext securityContext) {
    	  Integer usuId = usuarioId != null ? usuarioId.intValue() : null;
    	  List<SolicitudInformacionVO> listSolVo = new ArrayList<>();  
          try {
          	listSolVo =  solInfConv.mapListEntityToListDto(solInfServ.getByUsuario(usuId));
		  } catch (SQLException e) {
  			e.printStackTrace();
		  }
  		  return listSolVo;
  }
      @Override
      public List<SolicitudInformacionVO> getSolicitudInformacionBysolicitudServicio(Long solicitudServicioId, SecurityContext securityContext) {
    	  Integer solServId = solicitudServicioId != null ? solicitudServicioId.intValue() : null;
    	  List<SolicitudInformacionVO> listSolVo = new ArrayList<>();  
          try {
          	listSolVo =  solInfConv.mapListEntityToListDto(solInfServ.getBySolicitudServicio(solServId));
		  } catch (SQLException e) {
  			e.printStackTrace();
		  }
  		  return listSolVo;
  }
      @Override
      public SolicitudServicioVO getSolicitudServicioById(Long solicitudServicioId, SecurityContext securityContext) {
    	  Integer solServId = solicitudServicioId != null ? solicitudServicioId.intValue() : null;
          return solServConv.mapEntityToDto(solSerServ.getById(solServId));
  }
      @Override
      public UsuarioVO getUsuarioById(Long usuarioId, SecurityContext securityContext) {
    	  Integer usuId = usuarioId != null ? usuarioId.intValue() : null;
          return usuConv.mapEntityToDto(usuServ.getById(usuId));
  }
      @Override
      public void updateSolicitudGenerada(Long solicitudGeneradaId, SolicitudGeneradaVO body, SecurityContext securityContext) {
    	  SolicitudGeneradaVO solGenDto;
    	  Integer solGenId = solicitudGeneradaId != null ? solicitudGeneradaId.intValue() : null;
    	  solGenDto = solGenConv.mapEntityToDto(solGenServ.getById(solGenId)); 
    	  if (solGenDto.getId() == body.getId()) {
    		  solGenServ.save(solGenConv.mapDtoToEntity(body));  
    	  }
  }
      @Override
      public void updateSolicitudInformacion(Long solicitudInformacionId, SolicitudInformacionVO body, SecurityContext securityContext) {
    	  SolicitudInformacionVO solInfDto;
    	  Integer solInfId = solicitudInformacionId != null ? solicitudInformacionId.intValue() : null;
    	  solInfDto = solInfConv.mapEntityToDto(solInfServ.getById(solInfId)); 
    	  if (solInfDto.getId() == body.getId()) {
    		  solInfServ.save(solInfConv.mapDtoToEntity(body));  
    	  }
  }
      
      @Override
      public void updateSolicitudServicio(Long solicitudServicioId, SolicitudServicioVO body, SecurityContext securityContext) {
    	  SolicitudServicioVO solServDto;
    	  Integer solServId = solicitudServicioId != null ? solicitudServicioId.intValue() : null;
    	  solServDto = solServConv.mapEntityToDto(solSerServ.getById(solServId)); 
    	  if (solServDto.getId() == body.getId()) {
    		  solSerServ.save(solServConv.mapDtoToEntity(body));  
    	  }
  }
      @Override
      public void updateSolicitudServicioByUsuario(Long usuarioId, SolicitudServicioVO body, SecurityContext securityContext) {
    	  SolicitudServicioVO solServDto = null;
    	  Integer usuId = usuarioId != null ? usuarioId.intValue() : null;
    	  try {
			solServDto = solServConv.mapEntityToDto(solSerServ.getByUsuario(usuId));
    	  } catch (SQLException e) {
			e.printStackTrace();
    	  } 
    	  if (solServDto.getId() == body.getId()) {
    		  solSerServ.save(solServConv.mapDtoToEntity(body));  
    	  }
  }
      @Override
      public void updateUsuario(Long usuarioId, UsuarioVO body, SecurityContext securityContext) {
    	  UsuarioVO usuDto;
    	  Integer usuId = usuarioId != null ? usuarioId.intValue() : null;
    	  usuDto = usuConv.mapEntityToDto(usuServ.getById(usuId)); 
    	  if (usuDto.getUsuario() == body.getUsuario()) {
    		  usuServ.save(usuConv.mapDtoToEntity(body));  
    	  }
  }
}
