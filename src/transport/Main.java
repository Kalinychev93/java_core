package transport;

public class Main {
    public static void main(String[] args) {

        System.out.println("Java_core");
        System.out.println("Polymorphism");

        Car auto1 = new Car("Mercedes", "Benz", 3.7);
        Car auto2 = new Car("BMW", "X5", 3.2);
        Car auto3 = new Car("Audi", "Q7", 3.4);
        Car auto4 = new Car("Toyota", "Camry", 2.7);

        Bus bus1 = new Bus("Mercedes", "xc39", 4.6);
        Bus bus2 = new Bus("MAN", "X1", 3.9);
        Bus bus3 = new Bus("KAMAZ", "Next", 5.6);

        Truck truck1 = new Truck("Volvo", "FH16", 7.8);
        Truck truck2 = new Truck("Volvo", "FL7", 6.7);
        Truck truck3 = new Truck("Scania", "G400", 8.3);

        auto1.start();
        System.out.println(auto1);
        auto3.stop();
        auto4.getPitStop();
        auto2.getMaxSpeed();
        auto3.getBestCircleTime();
        bus3.getBestCircleTime();
        bus1.getMaxSpeed();

        DriverD<Bus> busDriver = new DriverD<>("Inokentyy", true, 4);
        System.out.println(busDriver.participateInTheRace(bus2));

        DriverB<Car> fernandoAlonso = new DriverB<>("Fernando Alonso", true, 9);
        fernandoAlonso.participateInTheRace(auto1);

        System.out.println(busDriver.refuelTheCar());
        System.out.println(fernandoAlonso.refuelTheCar());

        DriverC<Truck> truckDriver = new DriverC<>("voditel gruzovika", true, 12);
        System.out.println(truckDriver.participateInTheRace(truck1));//не понимаю, почему не выводит в консоль без "sout"?

    }

}