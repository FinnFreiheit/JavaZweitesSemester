package dhbw.Termin02.Aufgabe3;

import freiheit.Eingabe;
import java.util.Scanner;

/**
 * Programm zur Erkennugn von Palindromen, unabhängig von Satz und Leerzeichen.
 */
public class PalindromErkennung
{
    /**
     * Methode zur Palindrom Erkennung
     * @param eingabe zu überprüfender String
     * @return boolean ture: Palindrom false: kein Palindrom
     */
    public static boolean Palindrom(String eingabe)
{
    int eingabeLaenge = eingabe.length();

    for (int i = 0; i < eingabeLaenge / 2; i++)
    {
        //System.out.print(eingabe.charAt(i));
        char links = Character.toUpperCase(eingabe.charAt(i));
        //System.out.print(eingabe.charAt(eingabeLaenge-(i + 1)));
        char rechts = Character.toUpperCase(eingabe.charAt(eingabeLaenge-(i + 1)));
        //System.out.print(" ");
        if(links != rechts)
        {
            return false;
        }
        //System.out.println("");
    }
    return true;
}

    /**
     * @param args keine Startparameter
     */
    public static void main(String[] args)
    {

        String eingabe = Eingabe.eingabeString("String eingabe :");

        //Entfernen von Leerzeichen Komma und Punktnotationen
        eingabe = freiheit.Eingabe.delStringSatzZeichen(eingabe);

        System.out.println(eingabe);
        System.out.println(Palindrom(eingabe));
    }
}
