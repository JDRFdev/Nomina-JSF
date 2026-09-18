package model;

import java.io.Serializable;

public class TrabajadorDTO extends PersonaDTO implements Serializable {

	private static final long serialVersionUID = -5634158193047648567L;
	private long id;
	private double salarioBase;
	public TrabajadorDTO() {
		super();
	}

	public TrabajadorDTO(String nombre, String correo, String telefono, String direccion,long id,double salarioBase) {
		super(nombre, correo, telefono, direccion);
		this.id = id;
		this.salarioBase=salarioBase;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
}
