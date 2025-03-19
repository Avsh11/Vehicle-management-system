package FleetMGSystem;

public class Engine
{
    private int power;
    private String fuelType;

    public Engine(int power, String fuelType) {
        this.power = power;
        this.fuelType = fuelType;
    }

    public void startEngine()
    {
        System.out.println("Engine has started");
    }

    // Dodatkowo (składowa vehicle) ma taką moc i taki typ paliwa
    public void displayInfo()
    {
        System.out.println("Engine with power of: " + power + "HP");
        System.out.println("Fuel type: " + fuelType);
    }

}

//Powinna zawierać:
//• power (moc w KM)
//• fuelType (rodzaj paliwa)
//• startEngine() (metoda uruchamiająca silnik, np. wyświetlająca komunikat "Silnik
//uruchomiony").
//• Powinna być składową klasy Vehicle
