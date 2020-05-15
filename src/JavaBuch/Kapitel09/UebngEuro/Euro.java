package JavaBuch.Kapitel09.UebngEuro;

import JavaBuch.Kapitel09.Waehrung.Waehrung;

public class Euro extends Waehrung
{
    private static double kurs = 1;
    private double wert;

    public Euro(double wert)
    {
        this.wert = wert;
    }

    public double dollarBetrag()
    {
        return wert * kurs;
    }

    public double euroBetrag()
    {
        return wert;
    }

    public static void setEeuroKurs(double kurs)
    {
        Euro.kurs = kurs;
    }
}
