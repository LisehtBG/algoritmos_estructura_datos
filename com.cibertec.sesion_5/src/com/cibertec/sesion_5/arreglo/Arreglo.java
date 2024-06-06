package com.cibertec.sesion_5.arreglo;

import java.util.Iterator;

public class Arreglo {
	
	private int array[] = {25,27,22,24,29,20,23};
	
	public int[] getArray() {
		return array;
	}

	public Arreglo() {
		
	}
	
	public int tamanio() {
		return array.length;
	}
	
	public int obtener(int posicion) {
		return array[posicion];
	}
	
	public int sumaNumeros() {
		int sum =0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;
	}
	
	public int posPrimerNumeroMenorA25() {
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 25) {
				return i;
			}
		} return -1;
	}
	
	public void generar() {
		for (int i = 0; i < array.length; i++) {
			array[i]=aleatorio(100, 999);
		}
	}
	
	
	public int aleatorio(int min, int max) {
		return (int)((max-min+1)*Math.random())+min;
	}
	
	

}
