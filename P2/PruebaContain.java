package P2;

import java.util.ArrayList;

public class PruebaContain {
	ArrayList<String> cualidades;
	ArrayList<Alumno> alumno;
	public PruebaContain() {
		cualidades = new ArrayList<>();
		alumno = new ArrayList<>();

	}
	
	public boolean contiene(Alumno aa) {
		ArrayList<String> cualidadesAlumno = aa.getCualidades();
		if(cualidadesAlumno.contains(cualidades)) {
			return true;
		}
		return false;

	}
	
	public void addCualidad(String cualidad) {
		if(!cualidades.contains(cualidad)) {
			cualidades.add(cualidad);
		}
	}
	
}
