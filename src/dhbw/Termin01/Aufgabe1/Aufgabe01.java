package dhbw.Termin01.Aufgabe1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Aufgabe01
{
    public static boolean abfrage()
    {
        Scanner bedingungEingabe = new Scanner(System.in);
        System.out.println("Möchten sie eine Weitere Berechnung durchführen ? [y/n]");
        String eingabe = bedingungEingabe.next();
        if(eingabe.equals("y"))
        {
            return true;
        }
        else if(eingabe.equals("Y"))
        {
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args)
    {

        double radius = 1;

        do
        {
            System.out.println("Bitte gebe eine Zahl ein ");
            Scanner radiusEingabe = new Scanner(System.in);
            try
            {
                radius = radiusEingabe.nextDouble();
            }
            catch (InputMismatchException e)
            {
                System.out.println("Fehler !!");
                continue ;
            }

            System.out.print("Durchmesser: ");
            System.out.println(Kreisberechnung.durchmesser(radius));
            System.out.print("Umfang: ");
            System.out.println(Kreisberechnung.umfang(radius));
            System.out.print("Flächeninhalt: ");
            System.out.println(Kreisberechnung.flaecheninhalt(radius));
            System.out.println("_______________________");




        } while (abfrage());
    }
}
