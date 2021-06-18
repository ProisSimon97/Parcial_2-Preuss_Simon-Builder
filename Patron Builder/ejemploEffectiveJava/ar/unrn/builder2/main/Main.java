package ar.unrn.builder2.main;

import ar.unrn.builder2.builder.EmpleadoBuilder;
import ar.unrn.builder2.modelo.Empleado;

public class Main {

	public static void main(String[] args) {

		Empleado employee = new EmpleadoBuilder().setId_user(1).setName("Jorge").setSurname("jorgito").build();

		System.out.println(employee.toString());

		Empleado employee2 = new EmpleadoBuilder().setId_user(2).setName("Pedro").build();

		System.out.println(employee2.toString());
	}
}
