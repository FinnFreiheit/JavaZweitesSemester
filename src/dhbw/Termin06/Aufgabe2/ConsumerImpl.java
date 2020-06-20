package dhbw.Termin06.Aufgabe2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerImpl
{
    /**
     * Methode zum einlesen der Konsole
     * @return String Konsoleneingabe
     */
    public static String eingabeString()
    {
        String eingabe = null;
        boolean eingabeKorrekt = false;
        do
        {
           Scanner eingabeObj = new Scanner(System.in);
            try
            {
                eingabe = eingabeObj.nextLine();
                eingabeKorrekt = true;
            }
            catch (InputMismatchException e)
            {
                System.out.println("fehlerhafte Eingabe");
            }

        } while(!eingabeKorrekt);

        return eingabe;
    }

    /**
     * Methode ruft intern eigabeString Methode auf und speichert die Konsoleneingabe
     * in einer ArrayListe
     * @return Liste aus String Konsoleneingaben
     */
    public static ArrayList<String> eingabeSpeichernInListe()
    {
        ArrayList<String> liste = new ArrayList<>();
        boolean abbruchbedingung = false;
        while (!abbruchbedingung)
        {
            String temp = eingabeString();
            if(temp.equals("q") || temp.equals("Q"))
            {
               abbruchbedingung = true;
            }
            else
            {
                liste.add(temp);
            }

        }
        return liste;
    }

    /**
     * Funktion zum durchgehen aller Elemente einer Liste
     * @param liste  Liste mit Elementen
     * @param consumer Consumer
     * @param <T> Objekt typ
     */
    static <T> void durchgehenListe(Collection<T> liste,Consumer<T> consumer )
    {
        for(T t : liste)
        {
            consumer.accept(t);
        }
    }


    public static void main(String[] args)
    {
        Collection<String> temp = eingabeSpeichernInListe();
        durchgehenListe(temp, System.out::println);

    }
}
