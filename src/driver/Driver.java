package driver;

import transport.Transport;
import validation.ValidationUtils;

public abstract class Driver <T extends Transport> {
    private String fullName;
    private String license;
    private int drivingExperience;
    private final T car;

    public Driver(String fullName, String license, int drivingExperience, T car) {
        this.fullName = fullName;
        this.license = license;
        this.drivingExperience = drivingExperience;
        this.car = car;
    }

    public void startMove() {
        System.out.println("Водитель " + this.fullName + " начитеает движение");
        this.car.start();
    }
    public void stopMove() {
        System.out.println("Водитель " + this.fullName + " останавливается");
        this.car.stop();
    }

    public void refill() {
        System.out.println("Водитель " + this.fullName + " заправляет " + this.car.getBrand() + " " + this.car.getModel());
        }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = ValidationUtils.validOrDefault(fullName, "default");
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = ValidationUtils.validOrDefault(fullName, "B");
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = Math.max(drivingExperience, 1);
    }

    @Override
    public String toString() {
        return "Водитель " + this.fullName +
                " управляет автомобилем " + this.car.getBrand() + this.car.getModel() +
                " и будет участвовать в заезде";
    }
}
