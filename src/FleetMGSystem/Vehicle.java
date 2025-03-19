package FleetMGSystem;

public class Vehicle
{
    protected String brand;
    protected String model;
    protected int year;
    protected int maxSpeed;
    // Składowa klasy - modyfikacja konstruktora i metody displayInfo()
    protected Engine engine;
    protected FuelTank fuelTank;

    public Vehicle(String brand, FuelTank fuelTank, Engine engine, int maxSpeed, int year, String model) {
        this.brand = brand;
        this.fuelTank = fuelTank;
        this.engine = engine;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.model = model;
    }

    // Konstruktor - inicjacja wartości

    public void displayInfo()
    {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Max Speed: " + maxSpeed);
        engine.displayInfo(); // Kompozycja
        fuelTank.displaiInfo();
    }

}

//    Klasa bazowa Vehicle
//    Powinna zawierać pola takie jak:
//        • brand (marka pojazdu)
//• model
//• year (rok produkcji)
//• maxSpeed (maksymalna prędkość)
//• Powinna posiadać metodę displayInfo(), która wyświetla informacje o pojeździe.