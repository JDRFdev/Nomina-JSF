package util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.json.JsonMapper;


public class JSONMapper {
	private static final JsonMapper mapper= JsonMapper.builder().build();
	public static <T> void agregarNomina(T object, String path) {
		
		try {
			String json=mapper.writeValueAsString(object)+System.lineSeparator();
			Files.write(
	                new File(path).toPath(), 
	                json.getBytes(), 
	                StandardOpenOption.CREATE, 
	                StandardOpenOption.APPEND
	            );
		} catch (IOException e) {
			System.out.println("Error al guardar la nomina: "+e.getMessage());
		}
		
	}
	
	public static <T> List<T> obtenerNominas(Class<T> classs, String path) {
		File archivo= new File(path);
        List<T> nominas = new ArrayList<>();
        if(archivo.exists()) {
        	try {
				List<String> lineas=Files.readAllLines(archivo.toPath());
				for (String linea : lineas) {
					T nomina =mapper.readValue(linea, classs);
					nominas.add(nomina);
				}
			} catch (IOException e) {
				System.out.println("Error al leer: "+e.getMessage());
			}
        }
        return nominas;
	}
	
}
