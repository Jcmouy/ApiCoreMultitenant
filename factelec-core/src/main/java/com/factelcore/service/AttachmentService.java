package com.factelcore.service;

import com.factelcore.config.TenantContext;
import com.factelcore.config.multitenant.database.TenantDataSource;
import com.factelcore.entity.Attachment;
import com.factelcore.entity.City;
import com.factelcore.repository.AttachmentRepository;
import com.factelcore.repository.CityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
public class AttachmentService {

    @Autowired
    private AttachmentRepository attachmentRepository;

    @Autowired
    private TenantDataSource tenantDataSource;

    public List<Attachment> getAll() throws SQLException {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(tenantDataSource.getDataSource(TenantContext.getCurrentTenant()));
        String sql = "SELECT * FROM attachment";
        List<Attachment> attachments = jdbcTemplate.query(sql,
                new BeanPropertyRowMapper(Attachment.class));
        return attachments;
    }

    public Optional<Attachment> get(Long id){
        return attachmentRepository.findById(id);
    }
}
