package dhbw.Termin01.Aufgabe3;

/**
 * Aufgabe 03: Programm zur Tabellarischen Ausgabe der Zahlen 1-10 ihrem Quadrat und Kubik.
 */
public class Aufgabe03
{
    /**
     * Methode zum quadrieren
     * @param zahl Typ int Parameter wir in der Methode quadriert
     * @return typ int: der quadrierte Wert des Parameters
     */
    public static int quadrat(int zahl)
    {
        zahl = zahl * zahl;
        return zahl;
    }
    /**
     * Methode zum kubizieren
     * @param zahl Typ int Parameter wir in der Methode kubiziert
     * @return typ int: der kubik Wert des Parameters
     */
    public static int kubik(int zahl)
    {
        zahl = zahl * zahl * zahl;
        return zahl;
    }

    /**
     *
     * @param args Keine Parameterübergabe
     */
    public static void main(String[] args)
    {
        System.out.printf("%5s %5s %5s %n","Zahl","Quadrat", "Kubik");
        for (int i = 1; i <= 10; i++)
        {
            System.out.printf("%5d %5d %5d %n",i ,quadrat(i),kubik(i));
        }
    }
}
