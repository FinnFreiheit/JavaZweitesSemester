package dhbw.Termin01;

/**
 * Beispiel für die Ausgabe der 2er Potenz bis zu einer vorgegebenen Zahl.
 */
public class PowersOfTwo
{
    /**
     * Es wird vom Anwender die Angabe einer Zahl, bis zu welcher die 2er-Potenz ermittelt werden
     * sollen als Startparameter übergeben.
     *
     * @param args Startparameter der Anwendung
     */
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);

        int i = 0;
        int v = 1;
        while (i <= N)
        {
            System.out.println(i + " " + v);
            i = i + 1;
            v = 2 * v;
        }
    }
}
