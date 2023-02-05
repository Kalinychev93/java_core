package transport;

public class Main {
    public static void main(String[] args) {

        System.out.println("Java_core");
        System.out.println("Polymorphism");

        Car auto1 = new Car("Mercedes", "Benz", 3.7, Car.TypeOfBody.Minivan);
        System.out.println(auto1);
        auto1.printType();

        Car auto2 = new Car("BMW", "X5", 3.2, Car.TypeOfBody.Crossover);
        System.out.println(auto2);
        auto2.printType();

        Car auto3 = new Car("Audi", "Q7", 3.4, Car.TypeOfBody.SUV);
        System.out.println(auto3);
        auto3.printType();

        Car auto4 = new Car("Toyota", "Camry", 2.7, Car.TypeOfBody.Sedan);
        System.out.println(auto4);
        auto4.printType();


        Bus bus1 = new Bus("Mercedes", "xc39", 4.6, Bus.Capacity.getValue(80));
        System.out.println(bus1);
        bus1.printType();
        Bus bus2 = new Bus("MAN", "X1", 3.9, Bus.Capacity.getValue(50));
        Bus bus3 = new Bus("KAMAZ", "Next", 5.6, Bus.Capacity.getValue(13));

        Truck truck1 = new Truck("Volvo", "FH16", 7.8, Truck.LoadCapacity.getValue(2.3f));
        Truck truck2 = new Truck("Volvo", "FL7", 6.7, Truck.LoadCapacity.getValue(5.3f));
        Truck truck3 = new Truck("Scania", "G400", 8.3, Truck.LoadCapacity.getValue(22.3f));

        truck3.printType();

//        auto1.start();
//        System.out.println(auto1);
//        auto3.stop();
//        auto4.getPitStop();
//        auto2.getMaxSpeed();
//        auto3.getBestCircleTime();
//        bus3.getBestCircleTime();
//        bus1.getMaxSpeed();
//
//        DriverD<Bus> busDriver = new DriverD<>("Inokentyy", true, 4);
//        System.out.println(busDriver.participateInTheRace(bus2));
//
//        DriverB<Car> fernandoAlonso = new DriverB<>("Fernando Alonso", true, 9);
//        fernandoAlonso.participateInTheRace(auto1);
//
//        System.out.println(busDriver.refuelTheCar());
//        System.out.println(fernandoAlonso.refuelTheCar());
//
//        DriverC<Truck> truckDriver = new DriverC<>("voditel gruzovika", true, 12);
//        System.out.println(truckDriver.participateInTheRace(truck1));//не понимаю, почему не выводит в консоль без "sout"?

    }

}