package com.factelcore.service;

import com.factelcore.config.TenantContext;
import com.factelcore.config.multitenant.database.TenantDataSource;
import com.factelcore.entity.City;
import com.factelcore.entity.SolicitudInformacion;
import com.factelcore.entity.Usuario;
import com.factelcore.repository.CityRepository;
import com.factelcore.repository.SolicitudInformacionRepository;
import com.factelcore.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

@Service
public class SolicitudInformacionService {

	@Autowired
    private SolicitudInformacionRepository solInfRepository;

    @Autowired
    private TenantDataSource tenantDataSource;

    public void save(SolicitudInformacion solinf){
    	solInfRepository.save(solinf);
    }

    public List<SolicitudInformacion> getAll() throws SQLException {
    	Map<String, DataSource> t = tenantDataSource.getAll();
    	String u = TenantContext.getCurrentTenant();
    	
        JdbcTemplate jdbcTemplate = new JdbcTemplate(tenantDataSource.getDataSource(TenantContext.getCurrentTenant()));
        String sql = "SELECT * FROM Solicitud_Informacion";
        List<SolicitudInformacion> solInfs = jdbcTemplate.query(sql,
                new BeanPropertyRowMapper(SolicitudInformacion.class));
        return solInfs;
    }

    public SolicitudInformacion getById(Integer id){
        return solInfRepository.getOne(id);
    }
    
    public List<SolicitudInformacion> getBySolicitudServicio(Integer id) throws SQLException {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(tenantDataSource.getDataSource(TenantContext.getCurrentTenant()));
        String sql = "SELECT * FROM Solicitud_Informacion WHERE FK_SIN_COD_SOL_SER = ?";
        return (List<SolicitudInformacion>) jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper(SolicitudInformacion.class));
    }
    
    public List<SolicitudInformacion> getByUsuario(Integer id) throws SQLException {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(tenantDataSource.getDataSource(TenantContext.getCurrentTenant()));
        String sql = "SELECT * FROM FANTDBA.SOLICITUD_INFORMACION\r\n" + 
        		"left join SOLICITUD_SERVICIO on SOLICITUD_INFORMACION.FK_SIN_COD_SOL_SER = SOLICITUD_SERVICIO.PK_SSE_COD_SOL_SER\r\n" + 
        		"where SOLICITUD_SERVICIO.FK_SSE_USU = ?";
        return (List<SolicitudInformacion>) jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper(SolicitudInformacion.class));
    }

    public void remove(Integer id){
    	solInfRepository.deleteById(id);
    }
    
    public boolean removeBySolicitudServicio(Integer idSolServicio) throws SQLException {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(tenantDataSource.getDataSource(TenantContext.getCurrentTenant()));
        String sql = "DELETE FROM FANTDBA.SOLICITUD_INFORMACION\r\n" +  
        		"where SOLICITUD_INFORMACION.FK_SIN_COD_SOL_SER = ?";
        return jdbcTemplate.update(sql, new Object[]{idSolServicio}) == 1;
    }
}
