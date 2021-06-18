package ar.unrn.builder.concrete;

import ar.unrn.builder.builder.Builder;
import ar.unrn.builder.modelo.Pizza;

public class PicantePizzaBuilder extends Builder {
	
	public PicantePizzaBuilder() {
		super.pizza = new Pizza();
	}

	public void buildMasa() {
		pizza.setMasa("cocido");
	}

	public void buildSalsa() {
		pizza.setSalsa("picante");
	}

	public void buildRelleno() {
		pizza.setRelleno("pimienta+salchichón");
	}
}