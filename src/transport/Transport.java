package transport;

import validation.ValidationUtils;
public abstract class Transport {

    protected String brand;
    protected String model;
    protected double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = ValidationUtils.validOrDefault(brand, "default");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = ValidationUtils.validOrDefault(model, "default");
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = Math.max(engineVolume, 1.3);
    }



    public void start() {
        System.out.println(brand + model + " начинает движение");
    }

    public void stop() {
        System.out.println(brand + model + " останавливается");
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
