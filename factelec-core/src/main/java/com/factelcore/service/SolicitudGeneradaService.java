package com.factelcore.service;

import com.factelcore.config.TenantContext;
import com.factelcore.config.multitenant.database.TenantDataSource;
import com.factelcore.entity.SolicitudGenerada;
import com.factelcore.entity.SolicitudInformacion;
import com.factelcore.repository.SolicitudGeneradaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class SolicitudGeneradaService {

    @Autowired
    private SolicitudGeneradaRepository solInfRepository;

    @Autowired
    private TenantDataSource tenantDataSource;

    public void save(SolicitudGenerada solgen){
    	solInfRepository.save(solgen);
    }

    public List<SolicitudGenerada> getAll() throws SQLException {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(tenantDataSource.getDataSource(TenantContext.getCurrentTenant()));
        String sql = "SELECT * FROM Solicitud_Generada";
        List<SolicitudGenerada> solGens = jdbcTemplate.query(sql,
                new BeanPropertyRowMapper(SolicitudGenerada.class));
        return solGens;
    }

    public SolicitudGenerada getById(Integer id){
        return solInfRepository.getOne(id);
    }
    
    public List<SolicitudGenerada> getBySolicitudInformacion(Integer id) throws SQLException {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(tenantDataSource.getDataSource(TenantContext.getCurrentTenant()));
        String sql = "SELECT * FROM Solicitud_Generada WHERE FK_SGE_COD_SOL_INF = ?";
        return (List<SolicitudGenerada>) jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper(SolicitudGenerada.class));
    }

    public void remove(Integer id){
    	solInfRepository.deleteById(id);
    }
    
    public boolean removeBySolicitudInformacion(Integer idSolInf) throws SQLException {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(tenantDataSource.getDataSource(TenantContext.getCurrentTenant()));
        String sql = "DELETE FROM SOLICITUD_GENERADA\r\n" +  
        		"where SOLICITUD_GENERADA.FK_SGE_COD_SOL_INF = ?";
        return jdbcTemplate.update(sql, new Object[]{idSolInf}) == 1;
    }
}
