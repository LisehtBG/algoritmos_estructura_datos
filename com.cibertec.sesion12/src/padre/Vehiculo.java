package padre;

public abstract class  Vehiculo {
	protected String marca, modelo, placa;
	

	public Vehiculo(String marca, String modelo, String placa) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
	}
	
	public abstract String identificador() ;
	
	public String datosCompletos() {
		return 	"Marca: 	"+	marca + "\n" +
				"Modelo: 	"+	modelo +	"\n"+
				"Placa:		"+ 	placa +	"\n"	+
				"Código:	"+ marca+placa+modelo;
	}
}
