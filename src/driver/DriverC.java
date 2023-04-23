package driver;

import transport.Truck;

public class DriverC extends Driver<Truck> {
    public DriverC(String fullName, String license, int drivingExperience, Truck car) {
        super(fullName, license, drivingExperience, car);
    }
}
