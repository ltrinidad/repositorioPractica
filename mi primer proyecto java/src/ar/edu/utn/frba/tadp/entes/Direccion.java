package ar.edu.utn.frba.tadp.entes;

public class Direccion {
	
	private String calle;
	private int numero;
	
	public Direccion(){}
	
	public Direccion(String calle, int numero){
		this.calle = calle;
		this.numero = numero;
	}
	
	
	
	@Override
	public boolean equals(Object obj){ // EL EQUALS ES POLENTA PORQUE HACE LO MISMO QUE == PERO ADEMAS LE PODES DEFINIR MAS COMPORTAMIENTO OVERRAIDEANDOLO...
		if(!(obj instanceof Direccion)){ // NO SIEMPRE ESTA BUENO USAR INSTANCEOF PORQUE ATENTA CONTRA EL POLIMORFISMO Y LA DISTRIBUCION DE RESPONSABILIDAD
			return false;
		}
		Direccion otraDireccion = (Direccion) obj;
		return this.calle.equals(otraDireccion.calle) && this.numero==otraDireccion.numero;
	}
	
	@Override 
	public int hashCode(){
		return this.calle.hashCode() + this.numero;
	}
	
	@Override 
	public String toString(){
		return this.calle + " " + this.numero;
	}

}
