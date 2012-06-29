package es.desarrolloj2ee.actividades;

import java.util.ArrayList;
import java.util.List;

public class ObigacionesSociales {

public List<String> OBLIGACIONES_SOCIALES = new ArrayList<String>(); 
	
ObigacionesSociales(){
		OBLIGACIONES_SOCIALES.add(new String("DeclaracionDeHaciendaDeLaMujer"));
		OBLIGACIONES_SOCIALES.add(new String("DeclaracionDeHaciendaDelHombre"));
		OBLIGACIONES_SOCIALES.add(new String("Reciclado"));
		OBLIGACIONES_SOCIALES.add(new String("Donativos"));		
	}
}
