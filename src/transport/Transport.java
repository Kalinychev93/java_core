package transport;

import java.util.ArrayList;
import java.util.List;

public abstract class Transport implements Competing {
//    Mechanic mechanic1 = new Mechanic("Alex", "Ivanov", "Eagles");
//    Mechanic mechanic2 = new Mechanic("Justin", "Trudeau", "Maple Leafs");
//    Mechanic mechanic3 = new Mechanic("Mohamed", "Salah", "Liverpool");


    private String brand;
    private String model;
    private double engineVolume;
    private Driver driver;
    private List<Mechanic> mechanicList;


    public Transport(String brand, String model, double engineVolume, Driver driver, List<Mechanic> mechanicList) {
        this.brand = brand == null || brand.isBlank() ? "default" : brand;
        this.model = model == null || model.isBlank() ? "default" : model;
        this.engineVolume = engineVolume <= 0 ? 1.5 : engineVolume;
        this.driver = driver;
        this.mechanicList = mechanicList;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public List<Mechanic> getMechanicList() {
        return mechanicList;
    }

    public void setMechanicList(List<Mechanic> mechanicList) {
        this.mechanicList = mechanicList;
    }

    abstract void start();

    abstract void stop();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null || brand.isBlank() ? "default" : brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null || model.isBlank() ? "default" : model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume <= 0 ? 1.5 : engineVolume;
    }

    public abstract void printType();

    public abstract void getDiagnosed() throws TransportTypeException;

    @Override
    public String toString() {
        return "Автомобиль марки " + brand + ", модель: " + model +
                ", мощность двигателя = " + engineVolume +
                ",\n" + driver +
                "\n" + "Механики: " + mechanicList;
    }
}

