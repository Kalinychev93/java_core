package transport;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Java_core");
        System.out.println("Polymorphism");

        Mechanic mechanic1 = new Mechanic("Alex", "Ivanov", "Eagles");
        Mechanic mechanic2 = new Mechanic("Justin", "Trudeau", "Maple Leafs");
        Mechanic mechanic3 = new Mechanic("Mohamed", "Salah", "Liverpool");
        List<Mechanic> mechanicList = new ArrayList<>();

        mechanicList.add(mechanic1);
        mechanicList.add(mechanic2);
        mechanicList.add(mechanic3);


        Driver driver1 = new DriverB<>("Jenson", true, 10);




        Car auto1 = new Car("Mercedes", "Benz", 3.7, driver1, mechanicList , Car.TypeOfBody.Minivan);
        System.out.println(auto1);
        System.out.println(auto1.getDriver());
//        System.out.println(auto1.getMechanicList());
/*
        Car auto2 = new Car("Audi", "Q5", 2.9, Car.TypeOfBody.Crossover);
        Car auto3 = new Car("Toyota", "RAV4", 4.3, Car.TypeOfBody.SUV);
        Car auto4 = new Car("Lada", "Granta", 1.5, Car.TypeOfBody.Sedan);

        Bus bus1 = new Bus("Mercedes", "xc39", 4.6, Bus.Capacity.getValue(25));
        Bus bus2 = new Bus("Volvo", "Polo", 3.8, Bus.Capacity.getValue(11));
        Bus bus3 = new Bus("Volkswagen", "Transporter", 4.3, Bus.Capacity.getValue(8));
        Bus bus4 = new Bus("Ford", "Mondeo", 5.5, Bus.Capacity.getValue(76));

        Truck truck1 = new Truck("Volvo", "FH16", 7.8, Truck.LoadCapacity.getValue(2.3f));
        Truck truck2 = new Truck("MAN", "Super", 5.3, Truck.LoadCapacity.getValue(2.8f));
        Truck truck3 = new Truck("Kamaz", "Next", 12.8, Truck.LoadCapacity.getValue(25.9f));
        Truck truck4 = new Truck("MAZ", "AfterNext", 7.8, Truck.LoadCapacity.getValue(8.0f));
*/


//        1.1. Создаем список всех участвующих в гонке автомобилей
/*
        List<Transport> carsInRace = new ArrayList<>();
        carsInRace.add(auto1);
        carsInRace.add(auto2);
        carsInRace.add(auto3);
        carsInRace.add(auto4);
        carsInRace.add(bus1);
        carsInRace.add(bus2);
        carsInRace.add(bus3);
        carsInRace.add(bus4);
        carsInRace.add(truck1);
        carsInRace.add(truck2);
        carsInRace.add(truck3);
        carsInRace.add(truck4);

        Mechanic mechanic1 = new Mechanic("Alex", "Ivanov", "Eagles");
        Mechanic mechanic2 = new Mechanic("Justin", "Trudeau", "Maple Leafs");
        Mechanic mechanic3 = new Mechanic("Mohamed", "Salah", "Liverpool");
*/




/*        try{
            bus1.getDiagnosed();
        } catch (TransportTypeException e){
            e.printStackTrace();
        }

        try{
            auto1.getDiagnosed();
        } catch (TransportTypeException e){
            e.printStackTrace();
        }

        try{
            truck1.getDiagnosed();
        } catch (TransportTypeException e){
            e.printStackTrace();
        }*/
    }
}