package ar.edu.utn.frba.tadp.holamundo;

import ar.edu.utn.frba.tadp.entes.Nombrable;

public class RecepcionistaFormal extends Recepcionista {

	@Override
	protected String armarSaludo(Nombrable nombrable) {
		return "Buen dia estimado" + nombrable.getNombre();	
	}

}
