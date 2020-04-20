package dhbw.freiheit.Kapitel08.OOPUebunge.Aufgabe0810;

public class MainAufgabe0810
{
    public static void main(String[] args)
    {
        Punkt ursprung = new Punkt(0.0,0.0);
        Punkt endpunkt = new Punkt(4.0,3.0);
        Strecke s = new Strecke(ursprung,endpunkt);
        System.out.println("Die Laenge der Strecke " + s + " betraegt " + s.getLaenge() + ".");

    }
}
