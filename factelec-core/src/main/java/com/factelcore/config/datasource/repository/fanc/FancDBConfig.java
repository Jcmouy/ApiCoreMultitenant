package com.factelcore.config.datasource.repository.fanc;

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
        entityManagerFactoryRef = "fancEntityManagerFactory",
        transactionManagerRef = "fancTransactionManager",
        basePackages = {"com.factelcore.config.datasource.repository.fanc"}
        )
public class FancDBConfig {
	
	@Bean
    public PlatformTransactionManager fancTransactionManager() {
	return new JpaTransactionManager(fancEntityManagerFactory().getObject());
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean fancEntityManagerFactory() {
	LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
	
	HashMap<String, Object> properties = new HashMap<>();
	properties.put("hibernate.dialect", "org.hibernate.dialect.Oracle9iDialect");
	
	factoryBean.setDataSource(fancDataSource());
	factoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
	factoryBean.setPackagesToScan(FancDBConfig.class.getPackage().getName());
	factoryBean.setJpaPropertyMap(properties);
	
	return factoryBean;
    }

    @Bean(name = "fancDataSource")
    @ConfigurationProperties(prefix = "datasource.fanc")
    @Primary
    public DataSource fancDataSource(){
        return DataSourceBuilder.create().build();
    }	

}
