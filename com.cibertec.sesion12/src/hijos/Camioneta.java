package hijos;

import padre.Vehiculo;

public class Camioneta extends Vehiculo {
	
	private double precio;

	public Camioneta(String marca, String modelo, String placa, double precio) {
		super(marca, modelo, placa);
		this.precio = precio;
		// TODO Auto-generated constructor stub
	}
	
	public String datosCompletos() {
		return super.datosCompletos() 	+ "\n"+
				"Precio	:"			+ aPagar();
	}
	
	public double aPagar() {
		return precio*0.8;
	}

	@Override
	public String identificador() {
		// TODO Auto-generated method stub
		return null;
	}

}
