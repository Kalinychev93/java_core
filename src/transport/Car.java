package transport;

import java.text.DecimalFormat;
import java.util.List;

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

    public Car(String brand, String model, double engineVolume, Driver driver, List<Mechanic> mechanicList, TypeOfBody typeOfBody) {
        super(brand, model, engineVolume, driver, mechanicList);
        this.typeOfBody = typeOfBody;
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + typeOfBody;
    }

    @Override
    public void start() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " начал движение");
    }

    @Override
    public Driver getDriver() {
        return super.getDriver();
    }

    @Override
    public List<Mechanic> getMechanicList() {
        return super.getMechanicList();
    }

    @Override
    public void setMechanicList(List<Mechanic> mechanicList) {
        super.setMechanicList(mechanicList);
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public void setBrand(String brand) {
        super.setBrand(brand);
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public void setDriver(Driver driver) {
        super.setDriver(driver);
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

    @Override
    public void getDiagnosed() throws TransportTypeException {
        System.out.println("Автомобилю " + getBrand() + " " + getModel() + " необходимо пройти диагностику");
    }

}

