import FleetMGSystem.Car;
import FleetMGSystem.Engine;
import FleetMGSystem.FuelTank;
import FleetMGSystem.Truck;
public class Main
{
    public static void main(String[] args)
    {
//        Testowanie rozwiązania
//        Utwórz obiekty Car i Truck, przypisz im silniki oraz zbiorniki paliwa.
//        Wywołaj metody displayInfo(), startEngine(), refuel() i consume(), aby przetestować funkcjonalność.

        // Personal car
        Engine carEngine = new Engine(150,"Benzyna");
        FuelTank carFuelTank = new FuelTank(50,50);
        Car myCar = new Car("Toyota", carFuelTank,carEngine,180,2020,"Corolla",5);

        // Truck
        Engine truckEngine = new Engine(400,"Diesel");
        FuelTank truckFuelTank = new FuelTank(200,200);
        Truck myTruck = new Truck("Volvo",truckFuelTank,truckEngine,120,2018,"FH16",10);

        // Information about car
        System.out.println("---------- Information about car ----------");
        myCar.displayInfo();

        // Fuel - car

        carFuelTank.consume(10);
        carFuelTank.refuel(20);

        // Information about truck
        System.out.println("---------- Information about truck ----------");
        myTruck.displayInfo();

    }
}