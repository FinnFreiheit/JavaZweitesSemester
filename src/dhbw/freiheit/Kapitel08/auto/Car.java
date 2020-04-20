package dhbw.freiheit.Kapitel08.auto;

public class Car
{
    private String carDesc;
    private double fuelCap;
    private double fuel;
    private double fuelConsum;
    private double maxRange;
    private double drivenKm;


    public Car(String carDesc, double fuelCap, double fuel, double fuelConsum,double drivenKm)
    {
        this.carDesc = carDesc;
        this.fuelCap = fuelCap;
        this.fuel = fuel;
        this.fuelConsum = fuelConsum;
        this.drivenKm = drivenKm;
    }

    void drive(int distance)
    {
       this.fuel = this.fuel - ( distance * this.fuelConsum / 100);
       this.maxRange = this.fuel * fuelConsum;
       this.drivenKm = drivenKm + distance;
       if(this.fuel < 0)
       {
           this.fuel = 0;
           this.drivenKm = this.maxRange;
       }
    }

    public String toString()
    {
        return carDesc + " Tank Kapazität :" + this.fuelCap + " Tankfüllung:" + this.fuel
                + " Verbrauch: " + this.fuelConsum + " Maximale Reichweite " + this.maxRange + " Gefahrene Kilometer"
                + this.drivenKm;
    }

}
