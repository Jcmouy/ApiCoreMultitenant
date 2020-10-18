package com.factelcore.service;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.Remove;
import javax.ejb.Stateless;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.factelcore.config.TenantContext;
import com.factelcore.config.multitenant.database.TenantDataSource;
import com.factelcore.entity.Attachment;
import com.factelcore.entity.Organismo;
import com.factelcore.entity.SolicitudInformacion;
import com.factelcore.repository.AttachmentRepository;
import com.factelcore.repository.OrganismoRepository;

@Service
public class OrganismoService {

    @Autowired
    private OrganismoRepository organismoRepository;

    @Autowired
    private TenantDataSource tenantDataSource;

    public List<Organismo> getAll() throws SQLException {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(tenantDataSource.getDataSource(TenantContext.getCurrentTenant()));
        String sql = "SELECT * FROM Organismo where ORG_FEC_BAJ IS NOT NULL;";
        List<Organismo> organismos = jdbcTemplate.query(sql,
                new BeanPropertyRowMapper(Organismo.class));
        return organismos;
    }
    
    public void remove(Organismo organismo){
    	organismoRepository.delete(organismo);
    }

}
