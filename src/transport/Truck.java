package transport;

import java.text.DecimalFormat;

public class Truck extends Transport {
    private LoadCapacity loadCapacity;
    enum LoadCapacity{
        N1(0.0f, 3.5f),
        N2(3.51f, 12f),
        N3(12.01f, 460.0f);

        private float minWeight;
        private float maxWeight;

        LoadCapacity(float minWeight, float maxWeight) {
            this.minWeight = minWeight;
            this.maxWeight = maxWeight;
        }

        public float getMinWeight() {
            return minWeight;
        }

        public float getMaxWeight() {
            return maxWeight;
        }

        public static LoadCapacity getValue(float value){
            for(LoadCapacity e : LoadCapacity.values()){
                if(value >= e.getMinWeight() && value <= e.getMaxWeight()){
                    System.out.println(e);
                    return e;
                }
            }
            return null;
        }

        @Override
        public String toString() {
            return "Грузоподъемность: от " + minWeight + ", до " + maxWeight;
        }
    }
    public Truck(String brand, String model, double engineVolume, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void start() {
        System.out.println("Грузовик начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик закончил движение");
    }

    public void printType() {
        if (getLoadCapacity() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getLoadCapacity());
        }
    }

    @Override
    public String toString() {
        return super.toString() + loadCapacity;
    }

    @Override
    public void getPitStop() {
        System.out.println("Грузовику " + getBrand() + " " + getModel() + " необходим пит-стоп");
    }

    @Override
    public void getBestCircleTime() {
        int minTime = 115;
        int maxTime = 180;
        int bestTime = (int) (minTime + (maxTime - minTime) * Math.random());
        System.out.println("Лучшее время круга у " + getBrand() + " " + getModel() + " = " + bestTime + " сек.");
    }

    @Override
    public void getMaxSpeed() {
        DecimalFormat bgd = new DecimalFormat("###,###,###.##");
        double minBound = 110;
        double maxBound = 187;
        double maxSpeed = (double) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость " + getBrand() + " " + getModel() + " = " + bgd.format(maxSpeed));
    }
}
