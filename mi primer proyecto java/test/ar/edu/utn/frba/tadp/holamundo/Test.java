package ar.edu.utn.frba.tadp.holamundo;

import ar.edu.utn.frba.tadp.entes.Nombrable;
import ar.edu.utn.frba.tadp.entes.Persona;
import ar.edu.utn.frba.tadp.entes.Direccion;

import java.util.ArrayList;
import java.util.Collection;

public class Test {

	public static void main(String[] args){
		main1();
		System.out.print("\n");
		main2();
		System.out.print("\n");
		main3();
		System.out.print("\n");
		main4();
	}
	
	private static void main4(){
		Direccion direccion = new Direccion("Andonaegui" , 2383);
		Persona persona = new Persona("Leo", direccion);
		//persona.setDireccion(new Direccion("Lavalle", 2312));
		if(persona.viveEn(direccion)){
			System.out.println(persona + " vive en " + direccion);
		}else{
			System.out.println(persona + " no vive en " + direccion + ", sino que vive en " + persona.getDireccion());
		}
	}
	
	private static void main3(){
		Persona persona = new Persona("Lucas", new Direccion("Olazabal",5219));
		System.out.println("La persona " + persona + " vive en " + persona.getDireccion());
	}
	
	private static void main2(){
			Collection<Nombrable> nombrables = getNombrables();
			Recepcionista recepcionista = makeRecepcionista();
			for(Nombrable nombrable : nombrables){
				recepcionista.saludar(nombrable);
			}
	}
	
	private static Collection<Nombrable> getNombrables(){
		Collection<Nombrable> nombrables = new ArrayList<Nombrable>(); // ARRAYLIST ES SUBINTERFACE DE COLLECTION, POR ESO EL TIPO ES COLLECTION, LA INTERFACE MAYOR
		nombrables.add(new Mundo());
		nombrables.add(new Persona("Juan", new Direccion()));
		nombrables.add(new Persona("Jose", new Direccion()));
		return nombrables;
	}
	
	private static void main1(){
		Recepcionista recepcionista = makeRecepcionista(); // POR ALGUNA RAZON NO SE LE PONE EL THIS 
		Nombrable nombrable = new Mundo(); // PASA A SER DE TIPO NOMBRABLE PORQUE IMPLEMENTA LA INTERFAZ... 
		recepcionista.saludar(nombrable);
		nombrable = new Persona("Jose", new Direccion());
		recepcionista.saludar(nombrable);
	}
	
	private static Recepcionista makeRecepcionista(){ // LOS OBJETOS CREADOS DE SUBCLASES SON DEL TIPO DE LA CLASE ABSTRACT, MUY BUENO... 
		return new RecepcionistaClasico();
	}
	
}
