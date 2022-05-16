package b.microservicios.spring.mysql.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
public Usuario(String nombre, Long telefono) {
	
		this.nombre = nombre;
		this.telefono = telefono;
	}
private String nombre;
private Long telefono;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Usuario() {
	super();
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Long getTelefono() {
	return telefono;
}
public void setTelefono(Long telefono) {
	this.telefono = telefono;
}

}
