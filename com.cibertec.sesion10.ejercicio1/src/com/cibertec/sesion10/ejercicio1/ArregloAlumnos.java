package com.cibertec.sesion10.ejercicio1;

import java.util.ArrayList;



public class ArregloAlumnos {
	
	private ArrayList<Alumnos> alumno;
	
	public ArregloAlumnos() {
		alumno = new ArrayList<>();
		alumno.add(new Alumnos(5, "Martin", 10, 8, 9));
		alumno.add(new Alumnos(2, "Frank", 10, 18, 9));
		alumno.add(new Alumnos(8, "Bastian", 15, 18, 9));
	

	}
	
	public int tamanio() {
		return alumno.size();
	}
	
	public Alumnos obtener(int posicion) {
		return alumno.get(posicion);
	}
	
	public int cantAprobados() {
		int cant=0;
		for (int i = 0; i < tamanio(); i++) {
			if (obtener(i).promedio() >=13 ) {
				cant ++;
			} 
		}
		return cant;
	}
	
	public double mayPromedio() {
		double may= 0;
		for (int i = 0; i < tamanio(); i++) {
			if (obtener(i).promedio()>may) {
				may = obtener(i).promedio();
			}
		}
		return may;
	}
	
	public double menPromedio() {
		double men = 20;
		for (int i = 0; i < tamanio(); i++) {
			if (obtener(i).promedio() < men) {
				men = obtener(i).promedio();
				
			}
		}
		return men;
	}
	
	public String primealumDesaprobado() {
		double men = 20;
		for (int i = 0; i < tamanio(); i++) {
			if (obtener(i).promedio()<13) {
				return obtener(i).getNombre();
				
			}
			
		}
		return null;
	}
	
	public String ultiAlumAprobado() {
		for (int i = tamanio(); i>0; i--) {
			if (obtener(i).promedio()>=13) {
				return obtener(i).getNombre();
			}	
		}
		return null;
	}

}
