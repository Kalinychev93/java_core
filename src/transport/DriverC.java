package transport;

public class DriverC<T extends Truck> extends Driver {
    public DriverC(String nameOfDriver, Boolean driverLicense, Integer experience) {
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
        return "Водитель " + getNameOfDriver() + " заправляет грузовик";
    }

    public String participateInTheRace (T truck) {
        return "Водитель " + getNameOfDriver() + " управляет грузовиком "
                + truck.getBrand() + " " + truck.getModel() + " и будет участвовать в заезде";
    }
}
