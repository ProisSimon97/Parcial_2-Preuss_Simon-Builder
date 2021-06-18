package ar.unrn.builder2.main;

import ar.unrn.builder2.concretos.CarBuilder;
import ar.unrn.builder2.concretos.CarManualBuilder;
import ar.unrn.builder2.director.Director;
import ar.unrn.builder2.modelo.Car;
import ar.unrn.builder2.modelo.Manual;

public class MainGOF2 {

	public static void main(String[] args) {
	
		Director director = new Director();

		CarBuilder builder = new CarBuilder();
		director.constructSportsCar(builder);

		Car car = builder.getResult();
		System.out.println("Car built:\n" + car.getCarType());

		CarManualBuilder manualBuilder = new CarManualBuilder();

		director.constructSportsCar(manualBuilder);
		Manual carManual = manualBuilder.getResult();
		System.out.println("\nCar manual built:\n" + carManual.print());
	}
}
