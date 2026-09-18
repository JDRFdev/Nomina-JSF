package service;


import java.io.File;
import java.util.List;

import model.NominaDTO;
import util.JSONMapper;

public class NominaService {
	public NominaService() {}
	public void agregarNomina(NominaDTO nomina) {
		System.out.println(new File(".").getAbsolutePath());
		JSONMapper.agregarNomina(nomina,"C:\\Users\\Juan Rodriguez\\Documents\\Nomina_Rodriguez_Salamanca\\src\\main\\resources\\Nomina.json");;
	}
	public List<NominaDTO> obtenerNominas(){
		return JSONMapper.obtenerNominas(NominaDTO.class, "C:\\Users\\Juan Rodriguez\\Documents\\Nomina_Rodriguez_Salamanca\\src\\main\\resources\\Nomina.json");
	}
	
}
