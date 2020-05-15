package dhbw.Termin02.Aufgabe3;

import java.util.Scanner;


public class PalindromErkennung
{
    public static String stringBearbeiten(String eingabe)
    {
        eingabe = eingabe.replace(" ","");
        eingabe = eingabe.replace(",","");
        eingabe = eingabe.replace(".","");
        return eingabe;
    }

    public static void main(String[] args)
    {

        String eingabe = freiheit.Eingabe.eingabeString("String eingabe :");

        //Entfernen von Leerzeichen Komma und Punktnotationen
        eingabe = stringBearbeiten(eingabe);

        System.out.println(eingabe);

        int eingabeLaenge = eingabe.length();

        for (int i = 0; i < eingabeLaenge / 2; i++)
        {
            System.out.print(eingabe.charAt(i));
            char links = Character.toUpperCase(eingabe.charAt(i));
            System.out.print(eingabe.charAt(eingabeLaenge-(i + 1)));
            char rechts = Character.toUpperCase(eingabe.charAt(eingabeLaenge-(i + 1)));
            System.out.print(" ");
            System.out.println(links == rechts);
            System.out.println("");

        }



    }
}
