package driver;

import transport.Bus;
import transport.Car;

public class DriverD extends Driver<Bus> {
    public DriverD(String fullName, String license, int drivingExperience, Bus car) {
        super(fullName, license, drivingExperience, car);
    }
}
