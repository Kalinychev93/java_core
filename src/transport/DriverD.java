package transport;

public class DriverD<T extends Bus> extends Driver {

    public DriverD(String nameOfDriver, Boolean driverLicense, Integer experience) {
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
        return "Водитель " + getNameOfDriver() + " заправляет Автобус";
    }

    public String participateInTheRace (T bus) {
        return "Водитель " + getNameOfDriver() + " управляет автобусом "
                + bus.getBrand() + " " + bus.getModel() + " и будет участвовать в заезде";
    }
}
