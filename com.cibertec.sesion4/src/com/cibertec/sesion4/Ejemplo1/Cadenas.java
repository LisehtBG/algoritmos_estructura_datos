package com.cibertec.sesion4.Ejemplo1;

import java.util.Iterator;

import com.cibertec.sesion4.librerias.Libreria;

public class Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena = "Todos los alumnos aprobar";
		String cad2 = "Todos los alumnos aprobarán con ";
		int nota = 20;
		
		char tamano = cadena.charAt(0);
		boolean sino1 = cadena.equals(cad2);
		
		String texto = cad2+nota;
		
		/*
		 * for (int i = 0; i < cadena.length(); i++) { char letra= cadena.charAt(i);
		 * System.out.print(letra); }
		 */
		
		Libreria numero = new Libreria();
		int num = numero.aletario(2, 5);
		
		System.out.println(num);
		

		

	}

}
