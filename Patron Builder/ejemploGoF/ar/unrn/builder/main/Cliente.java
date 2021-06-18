package ar.unrn.builder.main;

import ar.unrn.builder.builder.Builder;
import ar.unrn.builder.concrete.HawaiPizzaBuilder;
import ar.unrn.builder.director.Cocina;
import ar.unrn.builder.modelo.Pizza;

public class Cliente {

	public static void main(String[] args) {
		
		Cocina cocina = new Cocina();
		Builder hawai_pizzabuilder = new HawaiPizzaBuilder();

		cocina.setPizzaBuilder(hawai_pizzabuilder);

		Pizza pizza = cocina.buildPizza();
		
		System.out.println(pizza.toString());
	}
}
