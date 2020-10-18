package com.factelcore.service;

import com.factelcore.config.TenantContext;
import com.factelcore.config.multitenant.database.TenantDataSource;
import com.factelcore.entity.City;
import com.factelcore.entity.Usuario;
import com.factelcore.repository.CityRepository;
import com.factelcore.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private TenantDataSource tenantDataSource;

    public void save(Usuario usuario){
    	usuarioRepository.save(usuario);
    }

    public List<Usuario> getAll() throws SQLException {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(tenantDataSource.getDataSource(TenantContext.getCurrentTenant()));
        String sql = "SELECT * FROM Usuario";
        List<Usuario> usuarios = jdbcTemplate.query(sql,
                new BeanPropertyRowMapper(Usuario.class));
        return usuarios;
    }

    public Usuario getById(Integer id){
        return usuarioRepository.getOne(id);
    }

    public void remove(Integer id){
    	usuarioRepository.deleteById(id);
    }
}
