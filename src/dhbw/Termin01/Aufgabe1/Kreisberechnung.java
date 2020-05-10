package dhbw.Termin01.Aufgabe1;


public class Kreisberechnung
{
    /**
     * Berechnung Durchmesser Kreis
     * @param r Der Radius wird übergeben
     * @return double Durchmesser Kreis
     */
    public static double durchmesser(double r)
    {
        return 2 * r;
    }

    /**
     * Berechnung Umfang Kreis
     * @param r Der Radius wird übergeben
     * @return doubel Umfang Kreis
     */
    public static double umfang(double r)
    {
        return 2 * r * Math.PI;
    }

    /**
     * Berechung Flächeninhalt
     * @param r der Radius wird übergeben
     * @return double Flächeninhalt Kreis
     */
    public static double flaecheninhalt(double r)
    {
        return r * r * Math.PI;
    }


}
