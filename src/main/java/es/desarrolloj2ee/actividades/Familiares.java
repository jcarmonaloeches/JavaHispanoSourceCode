package es.desarrolloj2ee.actividades;

import java.util.ArrayList;
import java.util.List;

public class Familiares {

	public List<String> FAMILIARES_DE_LA_MUJER = new ArrayList<String>(); 
	public List<String> FAMILIARES_DEL_HOMBRE = new ArrayList<String>();
	public List<String> DESCENDIENTES = new ArrayList<String>();
	
	Familiares(){
		FAMILIARES_DE_LA_MUJER.add(new String("FamiliaDePrimerGrado"));
		FAMILIARES_DE_LA_MUJER.add(new String("FamiliaDeSegundoGrado"));
		FAMILIARES_DEL_HOMBRE.add(new String("FamiliaDePrimerGrado"));
		FAMILIARES_DEL_HOMBRE.add(new String("FamiliaDeSegundoGrado"));
		DESCENDIENTES.add(new String("Hijos"));
	}
	
}
