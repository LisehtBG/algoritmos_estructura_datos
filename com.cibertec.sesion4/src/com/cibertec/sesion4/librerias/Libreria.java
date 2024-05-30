package com.cibertec.sesion4.librerias;

public class Libreria {
	public static final double pi= 3.1415;
	
	public Libreria() {
	}

	public static final int aletario(int min, int max) {
		return (int)((max - min +1) * Math.random())+ min;
	}
}
