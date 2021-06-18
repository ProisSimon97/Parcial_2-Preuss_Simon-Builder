package ar.unrn.builder.concrete;

import ar.unrn.builder.builder.Builder;
import ar.unrn.builder.modelo.Pizza;

//ConcreteBuilder
public class HawaiPizzaBuilder extends Builder {

	public HawaiPizzaBuilder() {
		super.pizza = new Pizza();
	}

	public void buildMasa() {
		pizza.setMasa("suave");
	}

	public void buildSalsa() {
		pizza.setSalsa("dulce");
	}

	public void buildRelleno() {
		pizza.setRelleno("chorizo+alcachofas");
	}
}
