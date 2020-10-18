package com.factelcore.service;

import com.factelcore.config.TenantContext;
import com.factelcore.config.multitenant.database.TenantDataSource;
import com.factelcore.entity.City;
import com.factelcore.entity.SolicitudInformacion;
import com.factelcore.entity.SolicitudServicio;
import com.factelcore.entity.Usuario;
import com.factelcore.repository.SolicitudServicioRepository;
import com.factelcore.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class SolicitudServicioService {

    @Autowired
    private SolicitudServicioRepository solServRepository;

    @Autowired
    private TenantDataSource tenantDataSource;

    public void save(SolicitudServicio solserv){
    	solServRepository.save(solserv);
    }

    public List<SolicitudServicio> getAll() throws SQLException {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(tenantDataSource.getDataSource(TenantContext.getCurrentTenant()));
        String sql = "SELECT * FROM Solicitud_Servicio";
        List<SolicitudServicio> solServs = jdbcTemplate.query(sql,
                new BeanPropertyRowMapper(SolicitudServicio.class));
        return solServs;
    }

    public SolicitudServicio getById(Integer id){
        return solServRepository.getOne(id);
    }
    
    public SolicitudServicio getByUsuario(Integer idUsuario) throws SQLException {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(tenantDataSource.getDataSource(TenantContext.getCurrentTenant()));
        String sql = "SELECT * FROM SOLICITUD_SERVICIO\r\n" +  
        		"where SOLICITUD_SERVICIO.FK_SSE_USU = ?";
        return (SolicitudServicio) jdbcTemplate.queryForObject(sql, new Object[]{idUsuario}, new BeanPropertyRowMapper(SolicitudServicio.class));
    }

    public void remove(Integer id){
    	solServRepository.deleteById(id);
    }
    
    public boolean removeByUsuario(Integer idUsuario) throws SQLException {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(tenantDataSource.getDataSource(TenantContext.getCurrentTenant()));
        String sql = "DELETE FROM FANTDBA.SOLICITUD_SERVICIO\r\n" +  
        		"where SOLICITUD_SERVICIO.FK_SSE_USU = ?";
        return jdbcTemplate.update(sql, new Object[]{idUsuario}) == 1;
    }
}
