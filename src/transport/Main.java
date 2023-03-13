package transport;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Collection");
        System.out.println("Task 1");

//        Список механиков
        Mechanic mechanic1 = new Mechanic("Alex", "Ivanov", "Eagles");
        Mechanic mechanic2 = new Mechanic("Justin", "Trudeau", "Maple Leafs");
        Mechanic mechanic3 = new Mechanic("Mohamed", "Salah", "Liverpool");

        List<Mechanic> mechanicList = new ArrayList<>();

        mechanicList.add(mechanic1);
        mechanicList.add(mechanic2);
        mechanicList.add(mechanic3);

//        Список водителей
        Driver driver1 = new DriverB<>("Jenson", true, 10);
        Driver driver2 = new DriverB<>("Jimmy", true, 6);
        Driver driver3 = new DriverC<>("Adam", true, 13);
        Driver driver4 = new DriverC<>("Andy", true, 12);
        Driver driver5 = new DriverD<>("Martin", true, 10);
        Driver driver6 = new DriverD<>("Alex", true, 8);

//        Список автомобилей
        Car auto1 = new Car("Mercedes", "Benz", 3.7, driver1,List.of(mechanic1) , Car.TypeOfBody.Minivan);
        Car auto2 = new Car("Audi", "Q5", 2.9,driver2,List.of(mechanic2), Car.TypeOfBody.Crossover);
        Car auto3 = new Car("Toyota", "RAV4", 4.3, driver2, List.of(mechanic3), Car.TypeOfBody.SUV);
        Car auto4 = new Car("Lada", "Granta", 1.5,driver1, List.of(mechanic1), Car.TypeOfBody.Sedan);
        Bus bus1 = new Bus("Mercedes", "xc39", 4.6, driver5, mechanicList, Bus.Capacity.getValue(25));
        Bus bus2 = new Bus("Volvo", "Polo", 3.8,driver6, List.of(mechanic2), Bus.Capacity.getValue(11));
        Bus bus3 = new Bus("Volkswagen", "Transporter", 4.3, driver6, List.of(mechanic3), Bus.Capacity.getValue(8));
        Bus bus4 = new Bus("Ford", "Mondeo", 5.5, driver5, List.of(mechanic1), Bus.Capacity.getValue(76));
        Truck truck1 = new Truck("Volvo", "FH16", 7.8, driver4, List.of(mechanic1), Truck.LoadCapacity.getValue(2.3f));
        Truck truck2 = new Truck("MAN", "Super", 5.3, driver3,List.of(mechanic3) , Truck.LoadCapacity.getValue(2.8f));
        Truck truck3 = new Truck("KAMAZ", "Next", 12.8, driver4, List.of(mechanic2), Truck.LoadCapacity.getValue(25.9f));
        Truck truck4 = new Truck("MAZ", "AfterNext", 7.8, driver3, mechanicList, Truck.LoadCapacity.getValue(8.0f));

//        Список участвующих в гонке автомобилей
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

//        Проверка методов
        System.out.println("");
        System.out.println(auto1.getDriver());        // получаем водителя авто
        System.out.println(auto1.getMechanicList());  // получаем список механиков
        mechanic1.carryOutMaintenance(auto1);         //Вызываем метод "Провести техобслуживание"
        mechanic2.repairTheCar(auto1);                //Вызываем метод "Починить авто"

//        Аналогичные методы проверяем на объекте Автобус
        System.out.println("");
        System.out.println(bus1.getDriver());
        System.out.println(bus1.getMechanicList());
        mechanic1.carryOutMaintenance(bus1);
        mechanic3.repairTheCar(bus1);

//        Аналогичные методы проверяем на объекте Грузовик
        System.out.println("");
        System.out.println(truck1.getDriver());
        System.out.println(truck1.getMechanicList());
        mechanic1.carryOutMaintenance(truck1);
        mechanic3.repairTheCar(truck1);

//        Задание 2
        System.out.println("");
        System.out.println("Task 2");

        Queue<Transport> transportToTheServiceStation = new LinkedList<>();

        ServiceStation sto = new ServiceStation(transportToTheServiceStation);

//        Проверка метода добавить авто в очередь на СТО
        for (Transport transport: carsInRace) {
            sto.addTransport(transport);
        }

//        Проверка - все автомобили и грузовики добавлены в очередь на СТО, а автобусы - нет
//        System.out.println(transportToTheServiceStation);

//        Проверка метода - провести тех.осмотр перед заездом
        for (int i = 0; i < transportToTheServiceStation.size(); i++) {
            sto.carryOutInspection(transportToTheServiceStation);
        }

//        Домашнее задание по теме Map
        System.out.println("");
        System.out.println("Homework. Theme Map");
        System.out.println("");
        Map<Transport, List<Mechanic>> autoMechanic = new HashMap<>();

        autoMechanic.put(auto1, auto1.getMechanicList());
        autoMechanic.put(auto2, auto2.getMechanicList());
        autoMechanic.put(auto3, auto3.getMechanicList());
        autoMechanic.put(auto4, auto4.getMechanicList());
        autoMechanic.put(bus1, bus1.getMechanicList());
        autoMechanic.put(bus2, bus2.getMechanicList());
        autoMechanic.put(bus3, bus3.getMechanicList());
        autoMechanic.put(bus4, bus4.getMechanicList());
        autoMechanic.put(truck1, truck1.getMechanicList());
        autoMechanic.put(truck2, truck2.getMechanicList());
        autoMechanic.put(truck3, truck3.getMechanicList());
        autoMechanic.put(truck4, truck4.getMechanicList());

        for (Map.Entry<Transport, List<Mechanic>> mechanicsForAuto : autoMechanic.entrySet()) {
            System.out.println("Автомобиль " + mechanicsForAuto.getKey().getBrand() + " " + mechanicsForAuto.getKey().getModel() + " обслуживается " + mechanicsForAuto.getValue());
        }

//        Домашнее задание по теме Set.Iterator.
        System.out.println("");
        System.out.println("Homework. Theme: Set.Iterator.");
        System.out.println("");

        Set<Driver> driverSet = new HashSet<>();

        driverSet.add(driver1);
        driverSet.add(driver2);
        driverSet.add(driver3);
        driverSet.add(driver4);
        driverSet.add(driver5);
        driverSet.add(driver6);
        driverSet.add(driver6);

        Iterator<Driver> driverIterator = driverSet.iterator();

        while (driverIterator.hasNext()) {
            System.out.println(driverIterator.next());
        }

    }
}