package com.factelcore.config.datasource.repository.fant;

import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EnableJpaRepositories(
        entityManagerFactoryRef = "fantEntityManagerFactory",
        transactionManagerRef = "fantTransactionManager",
        basePackages = {"com.factelcore.config.datasource.repository.fant"}
        )
public class FantDBConfig {
	
	@Bean
    public PlatformTransactionManager fantTransactionManager() {
	return new JpaTransactionManager(fantEntityManagerFactory().getObject());
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean fantEntityManagerFactory() {
	LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
	
	HashMap<String, Object> properties = new HashMap<>();
	properties.put("hibernate.dialect", "org.hibernate.dialect.Oracle9iDialect");
	
	factoryBean.setDataSource(fantDataSource());
	factoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
	factoryBean.setPackagesToScan(FantDBConfig.class.getPackage().getName());
	factoryBean.setJpaPropertyMap(properties);

	return factoryBean;
    }

    @Bean(name = "fantDataSource")
    @ConfigurationProperties(prefix = "datasource.fant")
    public DataSource fantDataSource(){
        return DataSourceBuilder.create().build();
    }
	

}
