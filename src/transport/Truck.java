package transport;

public class Truck extends Transport implements Competing {
    private double bestLeapTime;
    private int maxSped;
    private final CarriageCapacity carriageCapacity;
    public Truck(String brand, String model, double engineVolume, double bestLeapTime, int maxSped, CarriageCapacity carriageCapacity) {
        super(brand, model, engineVolume);
        this.bestLeapTime = bestLeapTime;
        setMaxSped(maxSped);
        this.carriageCapacity = carriageCapacity;
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус " + getBrand() + getModel() + " заехал на питстоп");
    }

    @Override
    public void BestLapTime() {
        System.out.println("Лучшый круг " + this.bestLeapTime + " минут");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость " + this.bestLeapTime + " км\\ч");
    }

    public CarriageCapacity getCarriageCapacity() {
        return carriageCapacity;
    }

    public double getBestLeapTime() {
        return bestLeapTime;
    }

    public void setBestLeapTime(double bestLeapTime) {
        this.bestLeapTime = bestLeapTime;
    }

    public int getMaxSped() {
        return maxSped;
    }

    public void setMaxSped(int maxSped) {
        this.maxSped = Math.max(maxSped, 60);
    }

    @Override
    public void printType() {
        if (this.carriageCapacity != null) {
            System.out.printf("Грузовик %s %s %s", getBrand(), getModel(), carriageCapacity.toString());
            System.out.println();
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }
}