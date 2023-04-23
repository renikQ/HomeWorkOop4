package driver;

import transport.Car;

public class DriverB extends Driver<Car> {
    public DriverB(String fullName, String license, int drivingExperience, Car car) {
        super(fullName, license, drivingExperience, car);
    }
}
