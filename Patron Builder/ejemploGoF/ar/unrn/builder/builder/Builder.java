package ar.unrn.builder.builder;

import ar.unrn.builder.modelo.Pizza;

//Builder
public abstract class Builder {

	protected Pizza pizza;

	public Pizza getPizza() {
		return pizza;
	}

	public abstract void buildMasa();

	public abstract void buildSalsa();

	public abstract void buildRelleno();
}
