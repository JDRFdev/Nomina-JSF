package model;

import java.io.Serializable;

public class PersonaDTO implements Serializable {
	
	private static final long serialVersionUID = 1260565727537025716L;
	private String nombre;
	private String correo;
	private String Telefono;
	private String direccion;
	public PersonaDTO() {}
	public PersonaDTO(String nombre, String correo, String telefono, String direccion) {
		this.nombre = nombre;
		this.correo = correo;
		this.Telefono = telefono;
		this.direccion = direccion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
		
}
