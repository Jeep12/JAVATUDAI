package P2;

import java.util.ArrayList;

public class Casa {
	private String nombre;
	private int MaxAlumnos;
	private ArrayList<String> cualidadesNecesarias;
	private ArrayList<Alumno> alumnos;
	private ArrayList<Casa> enemistades;

	public Casa(String nombre, int maxAlumnos) {
		this.nombre = nombre;
		MaxAlumnos = maxAlumnos;
		this.cualidadesNecesarias = new ArrayList<>();
		this.alumnos = new ArrayList<>();
		this.enemistades = new ArrayList<>();
	}

	public void addAlumno(Alumno aa) {
		if (!yaExiste(aa) && cumpleTamanio() && existenCualidades()) {
			if (!aa.PerteneceAUnaCasa()) {
				if (cumpleCualidades(aa)) {
					if(aa.cumpleConFamiliar(alumnos) || alumnos.size()==0) {
						alumnos.add(aa);
						aa.setCasa(this);
						System.out.println("Se agrego alumno correctamente");
						
					}else {
						System.out.println("Este alumno no tiene ningun familiar en la casa");
					}
				} else {
					System.out.println("El alumno "+aa.getNombre()+ " no cumple las cualidades");
				}
			} else {
				System.out.println("Este alumno "+aa.getNombre()+" ya pertenece a una casa ");
			}
		} else {
			System.out.println(
					"Este alumno ya fue agregado o la casa esta llena o no se setearon las cualidades de la casa");
		}
	}
//	public void addAlumno(Alumno aa) {
//		if (condicionAgregarAlumnos(aa) && esApto(aa)) {
//			if (aa.PerteneceAUnaCasa()) {
//				System.out.println("EL ALUMNO YA PERTENECE A UNA CASA");
//			} else {
//				alumnos.add(aa);
//				System.out.println("Se agrego el alumno " + aa.getNombre());
//				aa.setCasa(this);
//			}
//		}else {
//			System.out.println("La casa esta llena o el alumno no cumple los requisitos o no se setearon las cualidades de la casa o el alumno ya esta agregado");
//		}

//		if (condicionAgregarAlumnos(aa)) {
//			if (esApto(aa)) {
//				if(aa.PerteneceAUnaCasa()) {
//					alumnos.add(aa);					
//				}else {
//					System.out.println("El alumno ya pertenece a una casa" + aa.getNombre());
//				}
//			} else {
//				System.out.println("El alumno no cumple con todas las cualidades necesaria para este casa" + aa.getNombre());
//			}
//		} else {
//			System.out.println("Este alumno ya existe o la casa esta llena o no hay ninguna cualidad seteada" + aa.getNombre());
//		}
//	}
	public void addCualidad(String cualidad) {
		if (!cualidadesNecesarias.contains(cualidad)) {
			cualidadesNecesarias.add(cualidad);
		}
	}

	public void addEnesmitad(Casa casa) {
		if (!enemistades.contains(casa)) {
			enemistades.contains(casa);
		}
	}

	public boolean yaExiste(Alumno aa) {
		return alumnos.contains(aa);
	}

	public boolean cumpleTamanio() {
		return alumnos.size() < MaxAlumnos;
	}

	public boolean cumpleCualidades(Alumno aa) {
		ArrayList<String> cualidadesAlumno = aa.getCualidades();
		return cualidadesAlumno.containsAll(cualidadesNecesarias);
	}

	public boolean existenCualidades() {
		return cualidadesNecesarias.size() != 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Casa> getEnemistades(){
		ArrayList<Casa> aux = enemistades;
		return aux;
	}

	public ArrayList<Alumno> getAlumnos() {
		ArrayList<Alumno> aux = alumnos;
		return aux;
	}

	public int getMaxAlumnos() {
		return MaxAlumnos;
	}

	public boolean equals(Object obj) {
		Casa casa = (Casa) obj;
		return casa.getNombre().equals(this.getNombre());
	}

	public void setMaxAlumnos(int maxAlumnos) {
		MaxAlumnos = maxAlumnos;
	}

}
