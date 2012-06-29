package es.desarrolloj2ee.actividades;

import java.util.ArrayList;
import java.util.List;

public class Profesionales {

	public List<String> PROFESIONALES = new ArrayList<String>(); 
	
	Profesionales(){
		PROFESIONALES.add(new String("TrabajoDeLaMujer"));
		PROFESIONALES.add(new String("TrabajoDelHombre"));
		PROFESIONALES.add(new String("EstudiosDeLaMujer"));
		PROFESIONALES.add(new String("EstudiosDelHombre"));
		}
}
