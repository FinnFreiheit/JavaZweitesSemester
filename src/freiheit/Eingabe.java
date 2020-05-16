package freiheit;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Eingabe
{
    public static String eingabeString(String eingabeAbfrage)
    {
        String eingabe = null;
        boolean eingabeKorrekt = false;
        do
        {
           System.out.println(eingabeAbfrage);
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

    public static int eingabeInteger(String eingabeAbfrage)
    {
        int eingabe = 0;
        boolean eingabeKorrekt = false;
        do
        {
            System.out.println(eingabeAbfrage);
            Scanner eingabeObj = new Scanner(System.in);
            try
            {
                eingabe = eingabeObj.nextInt();
                eingabeKorrekt = true;
            }
            catch (InputMismatchException e)
            {
                System.out.println("fehlerhafte Eingabe");
            }
        }while(!eingabeKorrekt);
        return eingabe;
    }

    public static double eingabeDouble(String eingabeAbfrage)
    {
        double eingabe = 0;
        boolean eingabeKorrekt = false;
        do
        {
            System.out.println(eingabeAbfrage);
            Scanner eingabeObj = new Scanner(System.in);
            try
            {
                eingabe = eingabeObj.nextDouble();
                eingabeKorrekt = true;
            }
            catch (InputMismatchException e)
            {
                System.out.println("fehlerhafte Eingabe");
            }
        }while(!eingabeKorrekt);
        return eingabe;
    }

    public static String delStringSatzZeichen(String eingabe)
    {
        eingabe = eingabe.replace(" ","");
        eingabe = eingabe.replace(",","");
        eingabe = eingabe.replace(".","");
        return eingabe;
    }
}
