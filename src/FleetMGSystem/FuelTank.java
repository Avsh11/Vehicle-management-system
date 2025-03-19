package FleetMGSystem;

public class FuelTank
{
    protected double capacity;
    protected int currentLevel;

    public FuelTank(double capacity, int currentLevel) {
        this.capacity = capacity;
        this.currentLevel = currentLevel;
    }

    public void refuel(double amount)
    {
        // Mogę dolać benzyny jak mam jeszcze pojemność więc logicznie - if
        if(currentLevel + amount > capacity)
        {
            System.out.println("Fuel exceeds capacity. Maximum allowed " + capacity);
        }
        else
        {
            currentLevel += amount;
            System.out.println("Fuel now has " + amount + " fuel (L). It's been tanked");
        }
    }

    public void consume(double amount)
    {
        if(amount > currentLevel)
        {
            System.out.println("Not efficent amount of fuel. Current level is " + currentLevel);
        }
        else
        {
            currentLevel -= amount;
            System.out.println("We've consumed " + amount + " fuel (L). Remaining: " + currentLevel);
        }
    }

    public void displaiInfo()
    {
        System.out.println("Fuel tank: " + currentLevel + "/" + capacity + "[L]");
    }
}


//Kompozycja: Klasa FuelTank (Zbiornik paliwa)
//Powinna zawierać:
//• capacity (pojemność zbiornika)
//• currentLevel (aktualny poziom paliwa)
//• Metody refuel(double amount) (zatankowanie) i consume(double amount) (zużycie paliwa).
