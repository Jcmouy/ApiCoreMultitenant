package uy.com.antel.fact.electronica;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ApplicationPath("/")
public class RestApplication extends Application {
  // Add implementation-specific details here
}