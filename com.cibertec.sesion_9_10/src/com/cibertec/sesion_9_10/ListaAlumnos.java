package com.cibertec.sesion_9_10;

import java.util.ArrayList;

public class ListaAlumnos {
	ArrayList<Alumnos> alu = new ArrayList<>();

	public ListaAlumnos() {
		alu.add(new Alumnos(2, 12, 15, "Frank"));
		alu.add(new Alumnos(5, 17, 19, "Luis"));
		alu.add(new Alumnos(4, 15, 19, "Alex"));
		alu.add(new Alumnos(4, 15, 19, "Bastian"));
		alu.add(4, new Alumnos(5, 14, 11, "Cesar"));
		
	}
	
	public int tamanio() {
		return alu.size();
		
	}
	
	
	public Alumnos Obtener(int posicion) {
		return alu.get(posicion);
	}
	
	public double promedioGeneral() {
		
		double sum = 0.0;
		for (int i = 0; i < tamanio(); i++) {
			sum += Obtener(i).promedio();
		}
		return sum/tamanio();
	}
	
	public Alumnos promedioMayor() {
		double may = 0;
		Alumnos alu = null;
		for (int i = 0; i < tamanio(); i++) {
			if (Obtener(i).promedio() > may) {
				may = Obtener(i).promedio();
				alu = Obtener(i);
			}
		}
		return alu;
	}
	
	public void eliminar(int posicion) {
		alu.remove(posicion);
	}
	public void eliminar(Alumnos alumn) {
		alu.remove(alumn);
	}
	
	public Alumnos buscar(String nombre) {
		for (int i = 0; i < tamanio(); i++) {
			if (Obtener(i).getNombre() == nombre) {
				return Obtener(i);
				
			}
			
		}
		return null;
	}
	
	public void eliminar(String nombre) {
		Alumnos alu = buscar(nombre);
		eliminar(alu);
	}
	
	
}
