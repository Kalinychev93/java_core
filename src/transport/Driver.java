package transport;

import java.io.StringBufferInputStream;

public abstract class Driver {
    private final String nameOfDriver;
    private final Boolean driverLicense;
    private final Integer experience;

    public Driver(String nameOfDriver, Boolean driverLicense, Integer experience) {
        this.nameOfDriver = nameOfDriver == null || nameOfDriver.isBlank() ? " Вася Пупкин" : nameOfDriver;
        this.driverLicense = driverLicense;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Водитель: " + nameOfDriver +
                ", лицензия - " + driverLicense +
                ", опыт:" + experience + " лет;\n";
    }

    public String getNameOfDriver() {
        return nameOfDriver;
    }

    public Boolean getDriverLicense() {
        return driverLicense;
    }

    public Integer getExperience() {
        return experience;
    }

    abstract String startToMovie();
    abstract String stopToMovie();
    abstract String refuelTheCar();


}
