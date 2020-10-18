package uy.com.antel.fact.electronica.api;

import uy.com.antel.fact.electronica.model.SolicitudGeneradaVO;
import uy.com.antel.fact.electronica.model.SolicitudInformacionVO;
import uy.com.antel.fact.electronica.model.SolicitudServicioVO;
import uy.com.antel.fact.electronica.model.UsuarioVO;
import uy.com.antel.fact.electronica.api.SolicitudApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;
import org.json.JSONObject;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
@Path("/solicitud")
@RequestScoped

@Api(description = "the solicitud API")


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2020-09-15T15:57:29.783Z")

public class SolicitudApi  {

  @Context SecurityContext securityContext;

  @Inject SolicitudApiService delegate;
  
	@GET
	@Path("/hello")
	public String hello() {
	  return "Hello Rest!";
	}


    @POST
    @Path("/solicitudGenerada")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "ApiKeyAuth")
    }, tags={ "solicitudGenerada",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 405, message = "Invalid input", response = Void.class) })
    public void addSolicitudGenerada(@ApiParam(value = "SolicitudGenerada by user" ,required=true) SolicitudGeneradaVO body) {
        delegate.addSolicitudGenerada(body, securityContext);
    }

    @POST
    @Path("/solicitudInformacion")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "ApiKeyAuth")
    }, tags={ "solicitudInformacion",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 405, message = "Invalid input", response = Void.class) })
    public void addSolicitudInformacion(@ApiParam(value = "SolicitudInformacion by user" ,required=true) SolicitudInformacionVO body) {
        delegate.addSolicitudInformacion(body, securityContext);
    }

    @POST
    @Path("/solicitudServicio")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "ApiKeyAuth")
    }, tags={ "solicitudServicio",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 405, message = "Invalid input", response = Void.class) })
    public void addSolicitudServicio(@ApiParam(value = "SolicitudServicio by user" ,required=true) SolicitudServicioVO body) {
        delegate.addSolicitudServicio(body, securityContext);
    }

    @POST
    @Path("/usuario")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "ApiKeyAuth")
    }, tags={ "usuario",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 405, message = "Invalid input", response = Void.class) })
    public void addUsuario(@ApiParam(value = "Usuario by user" ,required=true) UsuarioVO body) {
        delegate.addUsuario(body, securityContext);
    }

    @DELETE
    @Path("/solicitudGenerada/{solicitudGeneradaId}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "ApiKeyAuth")
    }, tags={ "solicitudGenerada",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        @ApiResponse(code = 404, message = "SolicitudGenerada not found", response = Void.class) })
    public void deleteSolicitudGenerada(@ApiParam(value = "SolicitudGenerada id to delete",required=true) @PathParam("solicitudGeneradaId") Long solicitudGeneradaId, @ApiParam(value = "" )@HeaderParam("Bearer") String bearer) {
        delegate.deleteSolicitudGenerada(solicitudGeneradaId, bearer, securityContext);
    }

    @DELETE
    @Path("/solicitudGenerada/solicitudInformacion/{solicitudInformacionId}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "ApiKeyAuth")
    }, tags={ "solicitudGenerada",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        @ApiResponse(code = 404, message = "SolicitudInformacion not found", response = Void.class) })
    public void deleteSolicitudGeneradaBySolicitudInformacion(@ApiParam(value = "solicitudInformacion id to delete",required=true) @PathParam("solicitudInformacionId") Long solicitudInformacionId, @ApiParam(value = "" )@HeaderParam("Bearer") String bearer) {
        delegate.deleteSolicitudGeneradaBySolicitudInformacion(solicitudInformacionId, bearer, securityContext);
    }

    @DELETE
    @Path("/solicitudInformacion/{solicitudInformacionId}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "ApiKeyAuth")
    }, tags={ "solicitudInformacion",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        @ApiResponse(code = 404, message = "SolicitudInformacion not found", response = Void.class) })
    public void deleteSolicitudInformacion(@ApiParam(value = "SolicitudInformacion id to delete",required=true) @PathParam("solicitudInformacionId") Long solicitudInformacionId, @ApiParam(value = "" )@HeaderParam("Bearer") String bearer) {
        delegate.deleteSolicitudInformacion(solicitudInformacionId, bearer, securityContext);
    }

    @DELETE
    @Path("/solicitudInformacion/solicitudServicio/{solicitudServicioId}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "ApiKeyAuth")
    }, tags={ "solicitudInformacion",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        @ApiResponse(code = 404, message = "SolicitudServicio not found", response = Void.class) })
    public void deleteSolicitudInformacionBySolicitudServicio(@ApiParam(value = "SolicitudInformacion id to delete",required=true) @PathParam("solicitudServicioId") Long solicitudServicioId, @ApiParam(value = "" )@HeaderParam("Bearer") String bearer) {
        delegate.deleteSolicitudInformacionBySolicitudServicio(solicitudServicioId, bearer, securityContext);
    }

    @DELETE
    @Path("/solicitudServicio/{solicitudServicioId}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "ApiKeyAuth")
    }, tags={ "solicitudServicio",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        @ApiResponse(code = 404, message = "SolicitudServicio not found", response = Void.class) })
    public void deleteSolicitudServicio(@ApiParam(value = "SolicitudServicio id to delete",required=true) @PathParam("solicitudServicioId") Long solicitudServicioId, @ApiParam(value = "" )@HeaderParam("Bearer") String bearer) {
        delegate.deleteSolicitudServicio(solicitudServicioId, bearer, securityContext);
    }

    @DELETE
    @Path("/solicitudServicio/usuario/{usuarioId}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "ApiKeyAuth")
    }, tags={ "solicitudServicio",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        @ApiResponse(code = 404, message = "Usuario not found", response = Void.class) })
    public void deleteSolicitudServicioByUsuario(@ApiParam(value = "Usuario id to delete",required=true) @PathParam("usuarioId") Long usuarioId, @ApiParam(value = "" )@HeaderParam("Bearer") String bearer) {
        delegate.deleteSolicitudServicioByUsuario(usuarioId, bearer, securityContext);
    }

    @DELETE
    @Path("/usuario/{usuarioId}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "ApiKeyAuth")
    }, tags={ "usuario",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        @ApiResponse(code = 404, message = "Usuario not found", response = Void.class) })
    public void deleteUsuario(@ApiParam(value = "Usuario id to delete",required=true) @PathParam("usuarioId") Long usuarioId, @ApiParam(value = "" )@HeaderParam("Bearer") String bearer) {
        delegate.deleteUsuario(usuarioId, bearer, securityContext);
    }

    @GET
    @Path("/solicitudGenerada/")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = SolicitudGeneradaVO.class, responseContainer = "List", authorizations = {
        @Authorization(value = "ApiKeyAuth")
    }, tags={ "solicitudGenerada",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SolicitudGeneradaVO.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid status value", response = Void.class) })
    public List<UsuarioVO> findAllSolicitudGenerada() {
        return delegate.findAllSolicitudGenerada(securityContext);
    }

    @GET
    @Path("/solicitudInformacion/")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = SolicitudInformacionVO.class, responseContainer = "List", authorizations = {
        @Authorization(value = "ApiKeyAuth")
    }, tags={ "solicitudInformacion",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SolicitudInformacionVO.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid status value", response = Void.class) })
    public List<SolicitudInformacionVO> findAllSolicitudInformacion() {
    	System.out.println("Entra aqui");
        return delegate.findAllSolicitudInformacion(securityContext);
    }

    @GET
    @Path("/solicitudServicio/")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = SolicitudServicioVO.class, responseContainer = "List", authorizations = {
        @Authorization(value = "ApiKeyAuth")
    }, tags={ "solicitudServicio",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SolicitudServicioVO.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid status value", response = Void.class) })
    public List<SolicitudServicioVO> findAllSolicitudServicio() {
        return delegate.findAllSolicitudServicio(securityContext);
    }

    @GET
    @Path("/usuario/")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = UsuarioVO.class, responseContainer = "List", authorizations = {
        @Authorization(value = "ApiKeyAuth")
    }, tags={ "usuario",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = UsuarioVO.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid status value", response = Void.class) })
    public List<UsuarioVO> findAllUsuario() {
        return delegate.findAllUsuario(securityContext);
    }

    @GET
    @Path("/solicitudGenerada/{solicitudGeneradaId}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = SolicitudGeneradaVO.class, authorizations = {
        @Authorization(value = "ApiKeyAuth")
    }, tags={ "solicitudGenerada",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SolicitudGeneradaVO.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        @ApiResponse(code = 404, message = "SolicitudGenerada not found", response = Void.class) })
    public SolicitudGeneradaVO getSolicitudGeneradaById(@ApiParam(value = "ID of solicitudGenerada to return",required=true) @PathParam("solicitudGeneradaId") Long solicitudGeneradaId) {
        return delegate.getSolicitudGeneradaById(solicitudGeneradaId, securityContext);
    }

    @GET
    @Path("/solicitudGenerada/solicitudInformacion/{solicitudInformacionId}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = SolicitudGeneradaVO.class, responseContainer = "List", authorizations = {
        @Authorization(value = "ApiKeyAuth")
    }, tags={ "solicitudGenerada",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SolicitudGeneradaVO.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        @ApiResponse(code = 404, message = "Usuario not found", response = Void.class) })
    public List<SolicitudGeneradaVO> getSolicitudGeneradaBySolicitudInformacion(@ApiParam(value = "ID of solicitudGenerada to return",required=true) @PathParam("solicitudInformacionId") Long solicitudInformacionId) {
        return delegate.getSolicitudGeneradaBySolicitudInformacion(solicitudInformacionId, securityContext);
    }

    @GET
    @Path("/solicitudInformacion/{solicitudInformacionId}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = SolicitudInformacionVO.class, authorizations = {
        @Authorization(value = "ApiKeyAuth")
    }, tags={ "solicitudInformacion",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SolicitudInformacionVO.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        @ApiResponse(code = 404, message = "SolicitudInformacion not found", response = Void.class) })
    public SolicitudInformacionVO getSolicitudInformacionById(@ApiParam(value = "ID of solicitudInformacion to return",required=true) @PathParam("solicitudInformacionId") Long solicitudInformacionId) {
        return delegate.getSolicitudInformacionById(solicitudInformacionId, securityContext);
    }

    @GET
    @Path("/solicitudServicio/usuario/{usuarioId}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = SolicitudServicioVO.class, authorizations = {
        @Authorization(value = "ApiKeyAuth")
    }, tags={ "solicitudServicio",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SolicitudServicioVO.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        @ApiResponse(code = 404, message = "Usuario not found", response = Void.class) })
    public List<SolicitudInformacionVO> getSolicitudInformacionByUsuario(@ApiParam(value = "ID of usuario to return",required=true) @PathParam("usuarioId") Long usuarioId) {
        return delegate.getSolicitudInformacionByUsuario(usuarioId, securityContext);
    }

    @GET
    @Path("/solicitudInformacion/solicitudServicio/{solicitudServicioId}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = SolicitudInformacionVO.class, responseContainer = "List", authorizations = {
        @Authorization(value = "ApiKeyAuth")
    }, tags={ "solicitudInformacion",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SolicitudInformacionVO.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        @ApiResponse(code = 404, message = "SolicitudServicio not found", response = Void.class) })
    public List<SolicitudInformacionVO> getSolicitudInformacionBysolicitudServicio(@ApiParam(value = "ID of solicitudServicio to return",required=true) @PathParam("solicitudServicioId") Long solicitudServicioId) {
        return delegate.getSolicitudInformacionBysolicitudServicio(solicitudServicioId, securityContext);
    }

    @GET
    @Path("/solicitudServicio/{solicitudServicioId}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = SolicitudServicioVO.class, authorizations = {
        @Authorization(value = "ApiKeyAuth")
    }, tags={ "solicitudServicio",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SolicitudServicioVO.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        @ApiResponse(code = 404, message = "SolicitudServicio not found", response = Void.class) })
    public SolicitudServicioVO getSolicitudServicioById(@ApiParam(value = "ID of solicitudServicio to return",required=true) @PathParam("solicitudServicioId") Long solicitudServicioId) {
        return delegate.getSolicitudServicioById(solicitudServicioId, securityContext);
    }

    @GET
    @Path("/usuario/{usuarioId}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = UsuarioVO.class, authorizations = {
        @Authorization(value = "ApiKeyAuth")
    }, tags={ "usuario",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = UsuarioVO.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        @ApiResponse(code = 404, message = "Usuario not found", response = Void.class) })
    public UsuarioVO getUsuarioById(@ApiParam(value = "ID of usuario to return",required=true) @PathParam("usuarioId") Long usuarioId) {
        return delegate.getUsuarioById(usuarioId, securityContext);
    }

    @PUT
    @Path("/solicitudGenerada/{solicitudGeneradaId}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Void.class, tags={ "solicitudGenerada",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid solicitudGenerada supplied", response = Void.class),
        @ApiResponse(code = 404, message = "SolicitudGenerada not found", response = Void.class) })
    public void updateSolicitudGenerada(@ApiParam(value = "SolicitudGenerada id to update",required=true) @PathParam("solicitudGeneradaId") Long solicitudGeneradaId, @ApiParam(value = "Updated solicitudGenerada object" ,required=true) SolicitudGeneradaVO body) {
        delegate.updateSolicitudGenerada(solicitudGeneradaId, body, securityContext);
    }

    @PUT
    @Path("/solicitudInformacion/{solicitudInformacionId}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Void.class, tags={ "solicitudInformacion",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid solicitudInformacion supplied", response = Void.class),
        @ApiResponse(code = 404, message = "SolicitudInformacion not found", response = Void.class) })
    public void updateSolicitudInformacion(@ApiParam(value = "SolicitudInformacion id to update",required=true) @PathParam("solicitudInformacionId") Long solicitudInformacionId, @ApiParam(value = "Updated solicitudInformacion object" ,required=true) SolicitudInformacionVO body) {
        delegate.updateSolicitudInformacion(solicitudInformacionId, body, securityContext);
    }

    @PUT
    @Path("/solicitudServicio/{solicitudServicioId}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Void.class, tags={ "solicitudServicio",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid solicitudServicio supplied", response = Void.class),
        @ApiResponse(code = 404, message = "SolicitudServicio not found", response = Void.class) })
    public void updateSolicitudServicio(@ApiParam(value = "SolicitudServicio id to update",required=true) @PathParam("solicitudServicioId") Long solicitudServicioId, @ApiParam(value = "Updated solicitudServicio object" ,required=true) SolicitudServicioVO body) {
        delegate.updateSolicitudServicio(solicitudServicioId, body, securityContext);
    }

    @PUT
    @Path("/solicitudServicio/usuario/{usuarioId}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Void.class, tags={ "solicitudServicio",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid solicitudServicio supplied", response = Void.class),
        @ApiResponse(code = 404, message = "SolicitudServicio not found", response = Void.class) })
    public void updateSolicitudServicioByUsuario(@ApiParam(value = "usuario id to update",required=true) @PathParam("usuarioId") Long usuarioId, @ApiParam(value = "Updated usuario object" ,required=true) SolicitudServicioVO body) {
        delegate.updateSolicitudServicioByUsuario(usuarioId, body, securityContext);
    }

    @PUT
    @Path("/usuario/{usuarioId}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Void.class, tags={ "usuario",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid usuario supplied", response = Void.class),
        @ApiResponse(code = 404, message = "Usuario not found", response = Void.class) })
    public void updateUsuario(@ApiParam(value = "Usuario id to update",required=true) @PathParam("usuarioId") Long usuarioId, @ApiParam(value = "Updated usuario object" ,required=true) UsuarioVO body) {
        delegate.updateUsuario(usuarioId, body, securityContext);
    }
}
