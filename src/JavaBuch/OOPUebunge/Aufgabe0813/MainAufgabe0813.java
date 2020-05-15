package JavaBuch.OOPUebunge.Aufgabe0813;

public class MainAufgabe0813
{
    public static void main(String[] args)
    {
        Reifen gute = new Reifen(8);
        Fahrzeug auto = new Fahrzeug("Benzer",4,gute);
        System.out.println(auto.toString());

        auto.fahreLos();
        System.out.println(auto.toString());

        auto.halteAn();
        System.out.println(auto.toString());
        System.out.println();
    }
}
