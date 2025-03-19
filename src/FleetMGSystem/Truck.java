package FleetMGSystem;

public class Truck extends Vehicle
{
    private int loadCapacity;

    public Truck(String brand, FuelTank fuelTank, Engine engine, int maxSpeed, int year, String model, int loadCapacity) {
        super(brand, fuelTank, engine, maxSpeed, year, model);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity);
    }
}
