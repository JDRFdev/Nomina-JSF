package controller;

import java.io.Serializable;
import java.util.List;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import model.NominaDTO;
import service.NominaService;


@Named("nominaBean")
@ViewScoped
public class NominaBean implements Serializable {

	private static final long serialVersionUID = -1718711583506201684L;
	private NominaDTO nomina=new NominaDTO();
	private static NominaService service=new NominaService(); 
	public void agregarNomina(){
	    service.agregarNomina(nomina);
	    this.nomina=new NominaDTO();
	}
	public List<NominaDTO> obtenerNominas(){
		return service.obtenerNominas();
	}
	public NominaDTO getNomina() {
		return nomina;
	}
	public void setNomina(NominaDTO nomina) {
		this.nomina = nomina;
	}
	
}
