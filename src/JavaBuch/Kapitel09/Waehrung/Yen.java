package JavaBuch.Kapitel09.Waehrung;

public class Yen extends Waehrung
{
    private static double kurs;
    private double wert;

    public Yen(double wert)
    {
        this.wert = wert;
    }

    public double dollarBetrag()
    {
        return wert * kurs;
    }

    public static void setKurs(double kurs)
    {
        Yen.kurs = kurs;
    }
}
