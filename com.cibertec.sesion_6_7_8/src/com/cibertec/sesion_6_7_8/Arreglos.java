package com.cibertec.sesion_6_7_8;

public class Arreglos {
	public int[] getN() {
		return n;
	}

	public void setN(int[] n) {
		this.n = n;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	private int n[];
	private int indice;
	
	public Arreglos() {
		
		n = new int[10]; 
		indice =0;
	}
	
	private void ampliarArreglo() {
		int aux[]=n;
		n = new int[indice+10];
		for (int i = 0; i < aux.length; i++) {
			n[i]=aux[i];
		}
	}
	
	public int obtener(int i) {
		return n[i];
	}
	
	public void adicionar(int numero) {
		if (indice==n.length) {
			ampliarArreglo();
		}
		n[indice]= numero;
		indice ++;
	}
	
	public void eliminarAlFinal() {
		indice --;
	}
	
	public void eliminarTodo() {
		indice = 0;
	}
	
	public int tamanio() { // cantidad de elemen
		return indice;
	}
	
	public int buscar (int numero) {
		for (int i = 0; i <indice; i++) {
			if (n[i]==numero) {
				return i;
			}
			
		} return -1;
	}
	
	public void intercambiar( int pos, int pos1) {
		int aux = n[pos];
		n[pos]=n[pos1];
		n[pos1] = aux;
	}
	
	public void eliminar(int pocision) {
		for (int i = pocision; i < indice; i++) {
			n[i] = n[i+1];
		}
		indice --;
	}
	
	public void buscarAdicionar(int numero) {
		int pos = buscar(numero);
		if (pos == -1) {
			adicionar(numero);
			indice ++;
		}
	}
	
	public void buscarEliminar(int numero) {
		int pos = buscar(numero);
		if (pos != 1) {
			eliminar(pos);
			
		}
	}
	
	public void primeroAlFinal() {
		for (int i = 0; i < indice -1; i++) {
			intercambiar(i, i+1);
		}
	}
	public void ultimoAlInicio() {
		for (int i = indice -1; i > 0; i++) {
			intercambiar(i, i-1);
		}
	}
	
	

}
