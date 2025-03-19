package FleetMGSystem;

public class Car extends Vehicle // Dziedziczenie extends Class
{
    private int passangerCapacity;

    public Car(String brand, FuelTank fuelTank, Engine engine, int maxSpeed, int year, String model, int passangerCapacity) {
        super(brand, fuelTank, engine, maxSpeed, year, model);
        this.passangerCapacity = passangerCapacity;
    }

    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Passanger capacity: " + year);
    }
}

// Car (samochód osobowy)
// powinien mieć dodatkowe pole passengerCapacity
// (pojemność pasażerska)
