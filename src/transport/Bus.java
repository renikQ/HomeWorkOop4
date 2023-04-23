package transport;

public class Bus extends Transport implements Competing {
    private double bestLeapTime;
    private int maxSped;
    public Bus(String brand, String model, double engineVolume, double bestLeapTime, int maxSped) {
        super(brand, model, engineVolume);
        this.bestLeapTime = bestLeapTime;
        setMaxSped(maxSped);
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
}