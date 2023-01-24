package transport;

import java.text.DecimalFormat;

public class Bus extends Transport {

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Автобус начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Автобус закончил движение");
    }

    @Override
    public void getPitStop() {
        System.out.println("Автобусу " + getBrand() + " " + getModel() + " необходим пит-стоп");
    }

    @Override
    public void getBestCircleTime() {
        int minTime = 145;
        int maxTime = 250;
        int bestTime = (int) (minTime + (maxTime - minTime) * Math.random());
        System.out.println("Лучшее время круга у " + getBrand() + " " + getModel() + " = " + bestTime + " сек.");
    }

    @Override
    public void getMaxSpeed() {
        DecimalFormat bgd = new DecimalFormat("###,###,###.##");
        double minBound = 80;
        double maxBound = 137;
        double maxSpeed = (double) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость " + getBrand() + " " + getModel() + " = " + bgd.format(maxSpeed));
    }
}
