package com.cibertec.semena_6.ejercicio1;

public class ArregloEdades {
	private int edad[] = new int[10];
	public int[] getEdad() {
		return edad;
	}

	private int indice = 0;

	public ArregloEdades() {
		edad[0] =12;
		indice ++;
		edad[1] =15;
		indice ++;
		edad[2] =17;
		indice ++;
		edad[3] =48;
		indice ++;
	}
	
	public int tamanio() {
		return indice;
	}
	
	public int obtener(int pos) {
		return edad[pos];
		
	}
	
	private void ampliar() {
		int aux[] = edad;
		edad = new int [indice +10];
		for (int i = 0; i < aux.length; i++) {
			edad[i] = aux[i];
		}
	}
	
	public void adiciona(int edad2) {
		if (indice == edad.length) {
			ampliar();
		}
		edad[indice]= edad2;
		
	}
	
	public void adiciona(int edad2, int pos) {
		if (indice == edad.length) {
			ampliar();
		}
		edad[pos]= edad2;
		
	}
	
	public void eliminarFinal() {
		indice --;
		
	}
	
	public void eliminar() {
		indice = 0;
		
	}
	
	public int edadMayor() {
		int may = 0;
		
		for (int i = 0; i < edad.length; i++) {
			if (edad[i] > may) {
				may = edad[i];	
			}
		}
		return may;
	}
	
	public int primeraEdadAdulta() {
		int adulto = 0;
		
		for (int i = 0; i < edad.length; i++) {
			if (59 > edad[i] && edad[i] > 20) {
				adulto = edad[i];	
				return adulto;
			}
		}
		return -1;
	}
	
	public void incrementar() {
		for (int i = 0; i < edad.length; i++) {
			if (59 > edad[i] && edad[i] > 20) {
				 edad[i] = edad[i]+5;
			}
		}
	}
	
	public void reemplazar(int nuevaEdad) {
		for (int i = 0; i < edad.length; i++) {
			if (59 > edad[i] && edad[i] > 20) {
				 edad[i] = nuevaEdad;
			}
		}
	}
	
	public int buscar(int numero) {
		for (int i = 0; i < edad.length; i++) {
			if (edad[i]==numero) {
				return i;
				
			}
		}return -1;
	}
	
	public void intercambiar(int pos1, int pos2) {
		int aux = edad[pos1];
		edad[pos1] = edad[pos2];
		edad[pos2]= aux;
	}
	 
	public void buscarAdicionar( int numero) {
		
		int num = buscar(numero);
		if (num == -1) {
			int posivacia =buscarPocicionVacia();
			adiciona(numero,posivacia);
		}
	}
	
	public int buscarPocicionVacia(){
		for (int i = 0; i < edad.length; i++) {
			if (edad[i]==0) {
				return i;
			}
			
		}return -1;
	}
	
	public void trasladar() {
		int posf = buscarPocicionVacia();
		intercambiar(0, posf);
	}
}

