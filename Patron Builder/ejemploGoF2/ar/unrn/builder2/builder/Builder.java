package ar.unrn.builder2.builder;

import ar.unrn.builder2.modelo.CarType;
import ar.unrn.builder2.modelo.Engine;
import ar.unrn.builder2.modelo.GPSNavigator;
import ar.unrn.builder2.modelo.Transmission;
import ar.unrn.builder2.modelo.TripComputer;

//BUILDER
public interface Builder {

	void setCarType(CarType type);

	void setSeats(int seats);

	void setEngine(Engine engine);

	void setTransmission(Transmission transmission);

	void setTripComputer(TripComputer tripComputer);

	void setGPSNavigator(GPSNavigator gpsNavigator);
}
