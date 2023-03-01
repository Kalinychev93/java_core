package transport;

import java.io.StringBufferInputStream;
import java.util.Objects;

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
                ", опыт: " + experience + " лет;";
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return Objects.equals(nameOfDriver, driver.nameOfDriver) && Objects.equals(driverLicense, driver.driverLicense) && Objects.equals(experience, driver.experience);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfDriver, driverLicense, experience);
    }
}
