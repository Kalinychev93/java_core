package transport;

public class Main {
    public static void main(String[] args) {

        System.out.println("Java_core");
        System.out.println("Polymorphism");

        Car auto1 = new Car("Mercedes", "Benz", 3.7, Car.TypeOfBody.Minivan);

        Bus bus1 = new Bus("Mercedes", "xc39", 4.6, Bus.Capacity.getValue(80));

        Truck truck1 = new Truck("Volvo", "FH16", 7.8, Truck.LoadCapacity.getValue(2.3f));

        try{
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
        }
    }
}