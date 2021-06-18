package ar.unrn.builder.director;

import ar.unrn.builder.builder.Builder;
import ar.unrn.builder.modelo.Pizza;

//Director
public class Cocina {
	private Builder pizzaBuilder;

	public void setPizzaBuilder(Builder pb) {
		pizzaBuilder = pb;
	}

	public Pizza buildPizza() {
		
		pizzaBuilder.buildMasa();
		pizzaBuilder.buildSalsa();
		pizzaBuilder.buildRelleno();
		
		return pizzaBuilder.getPizza();
	}
}