package ar.edu.utn.frba.tadp.entes;

public class Persona implements Nombrable{
	
	private String nombre;
	private Direccion direccion;
	
	public Persona(){
		super();
	}
	
	@Override
	public String toString(){
		return this.getNombre();
	}
	
	public Persona(String nombre, Direccion direccion){
		this();
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public boolean viveEn(Direccion direccion){
		//return this.direccion == direccion; // EL OPERADOR IGUAL SE FIJA SI LAS DOS REFERENCIAS APUNTAN AL MISMO OBJETO
		return this.direccion.equals(direccion); // DA LA POSIBILIDAD DE OVERRAIDEARLO PARA QUE COMPARE DE OTRA MANERA, VER EN LA CLASE DIRECCION...
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	
	

}
