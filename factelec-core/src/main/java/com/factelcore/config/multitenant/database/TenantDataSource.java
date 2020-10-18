package com.factelcore.config.multitenant.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import static com.factelcore.constant.MultiTenantConstants.DEFAULT_TENANT_ID;
import static com.factelcore.constant.MultiTenantConstants.FANT_TENANT_ID;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Component
public class TenantDataSource implements Serializable {

	private static final long serialVersionUID = 1L;

	@Qualifier("fancDataSource")
    @Autowired
    private DataSource fancDataSource;
    
    @Qualifier("fantDataSource")
    @Autowired
    private DataSource fantDataSource;

    public DataSource getDataSource(String name) {
    	if (name.equals(DEFAULT_TENANT_ID)) {
    		return fancDataSource;
    	} else {
    		return fantDataSource;
    	}
    }

    @PostConstruct
    public Map<String, DataSource> getAll() {
        Map<String, DataSource> result = new HashMap<>();
        result.put(DEFAULT_TENANT_ID, fancDataSource);
        result.put(FANT_TENANT_ID, fantDataSource);
        return result;
    }

    private void initialize(DataSource dataSource) {
        //ClassPathResource schemaResource = new ClassPathResource("schema.sql");
        //ClassPathResource dataResource = new ClassPathResource("data.sql");
        //ResourceDatabasePopulator populator = new ResourceDatabasePopulator(schemaResource, dataResource);
        //populator.execute(dataSource);
    }


}
