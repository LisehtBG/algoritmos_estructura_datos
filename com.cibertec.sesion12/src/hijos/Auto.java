package hijos;

import padre.Vehiculo;

public class Auto extends Vehiculo {
	
	private double precio;
	
	public Auto(String marca, String modelo, String placa, double precio) {
		super(marca, modelo, placa);
		this.precio = precio;
	}
	
	
	
	public String datosCompletos() {
		return super.datosCompletos() +  "\n"+
				"Precio:	"+ aPagar();
		
	}
	
	public double aPagar() {
		return precio*0.9;
	}



	@Override
	public String identificador() {
		// TODO Auto-generated method stub
		return "Auto";
	}

}
