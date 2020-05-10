/**
 * Aufgabe 01 Programm zur Berechnung von Umfang, Durchmesser und Flächeninhalt eine Kreises
 * mit dem Radius als parameter.
 * @see Aufgabe1.Kreisberechnung
 */
package dhbw.Termin01.Aufgabe1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Aufgabe01
{
    /**
     * Abfrage ob der Benutzter eine weitere Berechnung durchführen möchte
     * @return boolean
     */
    public static boolean abfrage()
    {
        Scanner bedingungEingabe = new Scanner(System.in);
        System.out.println("Möchten sie eine Weitere Berechnung durchführen ? [y/n]");
        String eingabe = bedingungEingabe.next();

        return (eingabe.equals("y") || eingabe.equals("Y"));
    }

    /**
     *
     * @param args Kein Übergabe wert.
     */
    public static void main(String[] args)
    {

        double radius = 1;

        do
        {
            boolean eingabeKorrekt = false;
            String message = "Bitte gib eine Zahl ein : ";
            do
            {
                System.out.println(message);
                Scanner radiusEingabe = new Scanner(System.in);
                try
                {
                    radius = radiusEingabe.nextDouble();
                    eingabeKorrekt = true;
                }
                catch (InputMismatchException e)
                {
                   message = "Das war keine Zahl. Bitte gib eine Zahl ein : ";
                }
            }while(!eingabeKorrekt);

            System.out.print("Durchmesser: ");
            System.out.println(Kreisberechnung.durchmesser(radius));
            System.out.print("Umfang: ");
            System.out.println(Kreisberechnung.umfang(radius));
            System.out.print("Flächeninhalt: ");
            System.out.println(Kreisberechnung.flaecheninhalt(radius));
            System.out.println("_______________________");
        }while (abfrage());
    }
}
