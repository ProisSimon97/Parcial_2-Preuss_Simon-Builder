package ar.unrn.builder2.builder;

import ar.unrn.builder2.modelo.Empleado;

public class EmpleadoBuilder implements BuilderEJ{

	private int id;
	private String nombre;
	private String usuario;
	
	public EmpleadoBuilder setId_user(int id) {
		this.id = id;
		return this;
	}

	public EmpleadoBuilder setName(String nombre) {
		this.nombre = nombre;
		return this;
	}

	public EmpleadoBuilder setSurname(String surname) {
		
		this.usuario = surname;
		return this;
	}
	
	public Empleado build() {
		return new Empleado(id, nombre, usuario);
	}
}