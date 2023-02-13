package transport;

import java.text.DecimalFormat;
import java.util.List;

public class Bus extends Transport {

    private Capacity capacity;

    public Bus(String brand, String model, double engineVolume, Driver driver, List<Mechanic> mechanicList, Capacity capacity) {
        super(brand, model, engineVolume, driver, mechanicList);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    enum Capacity{
        EspeciallySmall(0, 10),
        Small(11,25),
        Average(26,50),
        Big(51,80),
        EspeciallyBig(81,120);

        private int minNumber;
        private int maxNumber;

        Capacity(int minNumber, int maxNumber) {
            this.minNumber = minNumber;
            this.maxNumber = maxNumber;
        }

        Capacity(){
        }

        public int getMinNumber() {
            return minNumber;
        }

        public int getMaxNumber() {
            return maxNumber;
        }

        public static Capacity getValue(int value){
            for(Capacity e : Capacity.values()){
                if(value >= e.getMinNumber() && value <= e.getMaxNumber()){
                    System.out.println(e);
                    return e;
                }
            }
            return null;
        }
        @Override
        public String toString() {
            return "Вместимость: от " + minNumber + " до " + maxNumber;
        }
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
    public void printType() {
        if (getCapacity() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getCapacity());
        }
    }

    @Override
    public void getPitStop() {
        System.out.println("Автобусу " + getBrand() + " " + getModel() + " необходим пит-стоп");
    }

    @Override
    public String toString() {
        return super.toString() + ",\n " + getCapacity();
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

    @Override
    public Object getDiagnosed() throws TransportTypeException {
            throw new TransportTypeException("Автобусы не должны проходить диагностику");
        }
}

