package transport;

public class Car extends Transport implements Competing {
    private double bestLeapTime;
    private int maxSped;
    private final BodyType bodyType;
    public Car(String brand, String model, double engineVolume, double bestLeapTime, int maxSped, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bestLeapTime = bestLeapTime;
        setMaxSped(maxSped);
        this.bodyType = bodyType;
    }

    @Override
    public void pitStop() {
        System.out.println("Автомобиль " + getBrand() + getModel() + " заехал на питстоп");
    }

    @Override
    public void BestLapTime() {
        System.out.println("Лучшый круг " + this.bestLeapTime + " минут");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость " + this.bestLeapTime + " км\\ч");
    }

    public BodyType getBodyType() {
        return bodyType;
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
        if (this.bodyType != null) {
            System.out.printf("Автомобиль %s %s %s ", getBrand(), getModel(), bodyType.toString());
            System.out.println();
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }
}
