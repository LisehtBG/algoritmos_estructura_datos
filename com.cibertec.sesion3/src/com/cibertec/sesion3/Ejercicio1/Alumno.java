package com.cibertec.sesion3.Ejercicio1;

public class Alumno {
	private int codigo, nota1, nota2;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getNota1() {
		return nota1;
	}
	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}
	public int getNota2() {
		return nota2;
	}
	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private String nombre;
	
	public double promedio(int nota1, int nota2) {
		return (nota1+nota2)/2;
		
	}
	
	public static boolean es_numero(String numero)
	{
		return numero.matches("^[1-9][0-9]*$");
		
	}
	
	

}
