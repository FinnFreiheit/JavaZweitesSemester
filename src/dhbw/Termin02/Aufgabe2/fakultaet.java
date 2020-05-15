package dhbw.Termin02.Aufgabe2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Termin2/Aufgabe2
 * Fakultät rekursiv und interativ
 */
public class fakultaet
{
    /**
     * Berechnung rekursiv
     * @param zahl int
     * @return int Fakutät von zahl
     * @pre Zahl größer 0 und keiner null sonnst overflow
     */
    public static int rekursivFakultaet(int zahl)
    {
        if(zahl <= 12 && zahl > 0)
        {
            if (zahl == 1) return zahl;
            return (zahl * rekursivFakultaet(zahl - 1));
        }else
        {
            System.out.println("stackoverflow");
            return 0;
        }
    }

    /**
     * Berechnung Fakultät iterativ
     * @param zahl int
     * @return int Fakultät zahl
     * @pre zahl größer 0 kleiner 12 sonnst overflow
     */
    public static int iterativFakultaet(int zahl)
    {
        if(zahl <= 12 && zahl > 0)
        {
            int temp = zahl;
            for (int i = zahl - 1; i > 1; i--)
            {
                temp = i * temp;
            }
            return temp;
        }
        else
        {
            System.out.println("stackoverflow");
            return 0;
        }
    }

    /**
     * ausgabe Ergebnis und Berechnung Fakultät
     * @param args keine start param.
     */
    public static void main(String[] args)
    {



        int zahl = freiheit.Eingabe.eingabeInteger("Bitte gebe eine Zahl zwischen 1 und 12 ein");


        System.out.println("rekursiv: Fakultät von " + zahl + " = " + rekursivFakultaet(zahl));
        System.out.println("iterativ: Fakultät von " + zahl + " = " + iterativFakultaet(zahl));


    }
}
