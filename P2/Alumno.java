package P2;

import java.util.ArrayList;

public class Alumno {
	private String nombre;
	private ArrayList<String> cualidades;
	private ArrayList<Alumno> familiares;
	Casa casaPerteneciente;

	public Alumno(String nombre) {
		this.nombre = nombre;
		this.cualidades = new ArrayList<>();
		this.familiares = new ArrayList<>();

	}

	public Casa getCasa() {
		return casaPerteneciente;
	}
	public boolean cumpleConFamiliar(ArrayList<Alumno> alumnosCasa) {
	
		for (int i = 0;i<familiares.size();i++) {
			Alumno familiar = familiares.get(i);
			if(alumnosCasa.contains(familiar)) {
				return true;
			}

		}
		return false;
	}
	public void setCasa(Casa casa) {
		this.casaPerteneciente = casa;
	}
	public boolean PerteneceAUnaCasa() {
		return this.getCasa() != null;
	}

	public void addFamiliar(Alumno familiar) {
		if (!familiares.contains(familiar)) {
			familiares.add(familiar);

		}
	}

	public void addCualidad(String cualidad) {
		if (!cualidades.contains(cualidad)) {
			cualidades.add(cualidad);
		}
	}

	public ArrayList<Alumno> getFamiliares() {
		ArrayList<Alumno> aux = familiares;
		return aux;
	}

	public ArrayList<String> getCualidades() {
		ArrayList<String> aux = cualidades;
		return aux;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean equals(Object obj) {
		Alumno alumno = (Alumno) obj;
		return this.getNombre().equals(alumno.getNombre());

	}

	public String toString() {
		return this.getNombre();
	}

}
