package P2;

import java.util.ArrayList;

public class Ejecutable {

	public static void main(String[] args) {
		Casa cc = new Casa("Gryffindor",2);
		cc.addCualidad("Honesto");
		cc.addCualidad("Valiente");
		Alumno aa = new Alumno("Juan");

		aa.addCualidad("Honesto");
		aa.addCualidad("Valiente");
		
		cc.addAlumno(aa);
		
		Casa cc2 = new Casa("Slyterin",3);
		Alumno aa2 = new Alumno("Garen");
		cc2.addCualidad("Deshonesto");
		cc2.addCualidad("Temerario");
		aa2.addCualidad("Honesto");
		aa2.addCualidad("Valiente");
		cc.addAlumno(aa2);
	
	
	}

}
