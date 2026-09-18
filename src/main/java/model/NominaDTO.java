package model;

import java.io.Serializable;

public class NominaDTO implements Serializable {
	
	private static final long serialVersionUID = 8519773880081812743L;
	private int diasTrabajados;
	private String mesNomina;
	private TrabajadorDTO empleado;
	public NominaDTO() {
		this.empleado=new TrabajadorDTO();
	}
	public NominaDTO(int diasTrabajados, String mesNomina, TrabajadorDTO empleado) {
		this.diasTrabajados = diasTrabajados;
		this.mesNomina=mesNomina;
		this.empleado = empleado;
	}
	public int getDiasTrabajados() {
		return diasTrabajados;
	}
	public void setDiasTrabajados(int diasTrabajados) {
		this.diasTrabajados = diasTrabajados;
	}
	
	public String getMesNomina() {
		return mesNomina;
	}
	public void setMesNomina(String mesNomina) {
		this.mesNomina = mesNomina;
	}
	public TrabajadorDTO getEmpleado() {
		return empleado;
	}
	public void setEmpleado(TrabajadorDTO empleado) {
		this.empleado = empleado;
	}
	public  double calcularSalarioDevengado() {
		return (this.empleado.getSalarioBase()/30)*this.diasTrabajados;
	}
	public double calcularAuxilioTransporte() {
		if(this.empleado.getSalarioBase()<=3500000) {
			return 250000;
		}
		return 0;
	}
	public double calcularPension() {
		return calcularSalarioDevengado()*0.04;
	}
	public double calcularSalud() {
		return calcularSalarioDevengado()*0.04;
	}
	public double calcularNomina() {
		return calcularSalarioDevengado()-calcularSalud()-calcularPension()+calcularAuxilioTransporte();
	}
}
