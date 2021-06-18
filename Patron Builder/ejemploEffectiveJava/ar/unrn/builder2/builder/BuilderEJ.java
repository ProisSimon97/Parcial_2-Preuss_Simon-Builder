package ar.unrn.builder2.builder;

import ar.unrn.builder2.modelo.Empleado;

public interface BuilderEJ {

	public EmpleadoBuilder setId_user(int id);

	public EmpleadoBuilder setName(String nombre);

	public EmpleadoBuilder setSurname(String surname);

	public Empleado build();
}
