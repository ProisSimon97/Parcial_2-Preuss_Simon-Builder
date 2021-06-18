package ar.unrn.builder2.concretos;

import ar.unrn.builder2.builder.Builder;
import ar.unrn.builder2.modelo.Car;
import ar.unrn.builder2.modelo.CarType;
import ar.unrn.builder2.modelo.Engine;
import ar.unrn.builder2.modelo.GPSNavigator;
import ar.unrn.builder2.modelo.Transmission;
import ar.unrn.builder2.modelo.TripComputer;

//CONCRETE BUILDER
public class CarBuilder implements Builder {

	private CarType type;
	private int seats;
	private Engine engine;
	private Transmission transmission;
	private TripComputer tripComputer;
	private GPSNavigator gpsNavigator;

	public void setCarType(CarType type) {
		this.type = type;
	}

	@Override
	public void setSeats(int seats) {
		this.seats = seats;
	}

	@Override
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}

	@Override
	public void setTripComputer(TripComputer tripComputer) {
		this.tripComputer = tripComputer;
	}

	@Override
	public void setGPSNavigator(GPSNavigator gpsNavigator) {
		this.gpsNavigator = gpsNavigator;
	}

	public Car getResult() {
		return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
	}
}
