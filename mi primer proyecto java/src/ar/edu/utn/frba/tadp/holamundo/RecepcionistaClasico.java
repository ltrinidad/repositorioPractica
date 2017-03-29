package ar.edu.utn.frba.tadp.holamundo;

import ar.edu.utn.frba.tadp.entes.Nombrable;

public class RecepcionistaClasico extends Recepcionista {

	@Override
	protected String armarSaludo(Nombrable nombrable) {
		return "hola" + nombrable.getNombre();
	}

}
