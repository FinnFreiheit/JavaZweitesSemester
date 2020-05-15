package JavaBuch.OOPUebunge.Aufgabe0813;

public class Reifen
{
    private double druck;

    public Reifen(double luftdruch)
    {
        this.druck = luftdruch;
    }

    public double aktuellerDruck()
    {
        return druck;
    }
}
