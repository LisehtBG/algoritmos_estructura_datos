package arreglo;

import java.util.ArrayList;

import clase.Alumno;

public class ArregloAlumnos {
	private ArrayList<Alumno> alu = new ArrayList<Alumno>();
	
	public ArregloAlumnos() {
		// TODO Auto-generated constructor stub
		//alu.add(new Alumno(1, 12, 14, "Cesar"));

	}
	
	public void Adicionar( Alumno a) {
		alu.add(a);
	}
	
	public int tamanio() {
		return alu.size();
	}
	
	public Alumno obtener(int posicion) {
		return alu.get(posicion);
	}
	
	public Alumno buscar(int codigo) {
		for (int i = 0; i < tamanio(); i++) {
			if (obtener(i).getCodigo()== codigo) {
				return obtener(i);
				
			}
			
		}
		return null;
	}
	
	public void eliminar(Alumno a) {
		alu.remove(a);
	}

}
