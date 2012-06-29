package es.desarrolloj2ee.actividades;

import java.util.ArrayList;
import java.util.List;

public class Hogar {

	public List<String> MANTENIMIENTO_DEL_HOGAR = new ArrayList<String>(); 
	
	Hogar(){
		MANTENIMIENTO_DEL_HOGAR.add(new String("TareaEléctricaLuz"));
		MANTENIMIENTO_DEL_HOGAR.add(new String("Cocina"));
		MANTENIMIENTO_DEL_HOGAR.add(new String("Muebles"));
		MANTENIMIENTO_DEL_HOGAR.add(new String("Alimentación"));
		MANTENIMIENTO_DEL_HOGAR.add(new String("Limpieza"));
		MANTENIMIENTO_DEL_HOGAR.add(new String("Ropa"));
		MANTENIMIENTO_DEL_HOGAR.add(new String("Donativos"));
	}
	
}
