package transport;

public class DriverB<T extends Car> extends Driver {
    public DriverB(String nameOfDriver, Boolean driverLicense, Integer experience) {
        super(nameOfDriver, driverLicense, experience);
    }

    @Override
    String startToMovie() {
        return "Водитель " + getNameOfDriver() + " начал движение";
    }

    @Override
    String stopToMovie() {
        return "Водитель " + getNameOfDriver() + " остановился";
    }

    @Override
    String refuelTheCar() {
        return "Водитель " + getNameOfDriver() + " заправляет автомобиль";
    }

    public String participateInTheRace (T car) {
        return "Водитель " + getNameOfDriver() + " управляет автомобилем "
                + car.getBrand() + " " + car.getModel() + " и будет участвовать в заезде";
    }
}
