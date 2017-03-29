package ar.edu.utn.frba.tadp.holamundo;

import ar.edu.utn.frba.tadp.entes.Nombrable;

public abstract class Recepcionista {
	
	public void saludar(Nombrable nombrable){
		System.out.println(this.armarSaludo(nombrable));
	}
	
	protected abstract String armarSaludo(Nombrable nombrable);

}
