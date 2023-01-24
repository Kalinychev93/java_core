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

    }

}