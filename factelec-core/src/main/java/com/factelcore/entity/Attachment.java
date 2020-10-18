package com.factelcore.entity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "ARCHIVO_PUBLICADO")
public class Attachment extends BaseObject implements java.io.Serializable {
	private static final long serialVersionUID = 8727988617276437179L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	public Long getId() { return this.id; }
	public void setId(Long id) { this.id = id; }
	
	private String nombre;
	public String getNombre() { return this.nombre;	}
	public void setNombre(String nombre) { this.nombre = nombre; }
	
	private long tamano;
	public long getTamano() { return this.tamano; }
	public void setTamano(long tamano) { this.tamano = tamano; }
	
	@Column (name="content_type")
	private String contentType;
	public String getContentType() { return this.contentType; }
	public void setContentType(String contentType) { this.contentType = contentType; }
	
	private Date modificado;
	public Date getModificado() {return this.modificado;}
	public void setModificado(Date modificado) { this.modificado = modificado;}
	
}