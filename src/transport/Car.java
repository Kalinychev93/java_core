package transport;

import java.text.DecimalFormat;

public class Car extends Transport{
    private TypeOfBody typeOfBody;
    enum TypeOfBody {
        Sedan("Седан"),
        Hatchback("Хэтчбек"),
        Coupe("Купе"),
        Universal("Универсал"),
        SUV("Внедорожник"),
        Crossover("Кроссовер"),
        Pickup("Пикап"),
        Van("Фургон"),
        Minivan("Минивэн");

        private String name;

        TypeOfBody(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "тип кузова: " + name;
        }
    }


    public Car(String brand, String model, double engineVolume, TypeOfBody typeOfBody) {
        super(brand, model, engineVolume);
        this.setTypeOfBody(typeOfBody);
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + typeOfBody;
    }

    @Override
    public void start() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " закончил движение");
    }

    @Override
    public void printType() {
        if (getTypeOfBody() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getTypeOfBody());
        }
    }

    @Override
    public void getPitStop() {
        System.out.println("Автомобилю " + getBrand() + " " + getModel() + " необходим пит-стоп");
    }

    @Override
    public void getBestCircleTime() {
        int minTime = 45;
        int maxTime = 210;
        int bestTime = (int) (minTime + (maxTime - minTime) * Math.random());
        System.out.println("Лучшее время круга у " + getBrand() + " " + getModel() + " = " + bestTime + " сек.");
    }

    @Override
    public void getMaxSpeed() {
        DecimalFormat bgd = new DecimalFormat("###,###,###.##");
        double minBound = 210;
        double maxBound = 287;
        double maxSpeed = (double) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость " + getBrand() + " " + getModel() + " = " + bgd.format(maxSpeed));

    }
}

