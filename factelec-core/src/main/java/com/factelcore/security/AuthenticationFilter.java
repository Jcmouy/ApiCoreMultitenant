package com.factelcore.security;

import java.io.IOException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.Priority;

import javax.ws.rs.core.*;
import javax.ws.rs.ext.*;
import javax.ws.rs.container.*;
import javax.ws.rs.*;

@Secured
@Provider
@Priority(Priorities.AUTHENTICATION)
public class AuthenticationFilter implements ContainerRequestFilter {
	
  @Context
  private ResourceInfo resourceInfo;

  @Override
  public void filter(ContainerRequestContext requestContext) throws IOException {
    // Extract Authorization header details
    String authorizationHeader = requestContext.getHeaderString(HttpHeaders.AUTHORIZATION);
    if (authorizationHeader == null || !authorizationHeader.startsWith("Bearer")) {
      throw new NotAuthorizedException("Authorization header must be provided");
    }
    // Extract the token
    String token = authorizationHeader.substring("Bearer".length()).trim();

    try {
      // Validate the token
      validateToken(token);
    } catch (Exception ex) {
      Logger.getLogger(AuthenticationFilter.class.getName()).log(Level.SEVERE, null, ex);
      requestContext.abortWith(Response.status(Response.Status.UNAUTHORIZED).build());
    }
  }

  private void validateToken(String token) throws Exception {

    // 160-bit WPA Key
    String propToken = System.getProperty("uy.com.antel.impresionfactura.jaxrs.token");

    byte[] decodedBytes = Base64.getDecoder().decode(token);
    String decodedString = new String(decodedBytes);

    if (!decodedString.equalsIgnoreCase(propToken)) {
      throw new Exception("Authorization token did not match");
    }
  }
}
