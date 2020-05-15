package JavaBuch.Kapitel09.Waehrung;

public class USDollar extends Waehrung
{
    private double wert;

    public USDollar(double wert)
    {
        this.wert = wert;
    }

    public double dollarBetrag()
    {
     return this.wert;
    }
}
