package dhbw.Termin03.Aufgabe02;

import dhbw.Termin03.Aufgabe01.*;

public class StudentenListeTest
{



    public static void main(String[] args)
    {
        StudentenListe liste = new StudentenListe();
        liste.maximalwert = 3;
        //erster Student
        Studenten studentA = new Studenten
                ("Finn","Freiheit","Simplonstraße","10245","Berlin");
        //zweiter Student
        Studenten.Anschrift anschriftstudent2 = new Studenten.Anschrift("Müllerstraße", "11111", "Stuttgart");
        Studenten studentB = new Studenten("Max", "Musterman", anschriftstudent2);

        //dritter Student
        Studenten studentC = new Studenten
                ("Marie", "Musterfrau", "Mariestraße", "101010", "Frankfurt");

        System.out.println("Drei Studenten hinzufügen");
        liste.add(studentA);
        liste.add(studentB);
        liste.add(studentC);
        liste.ausgabe();
        System.out.println("*************************************************************");

        System.out.println("ersten Student erneut hinzufügen (fehler)");
        liste.add(studentA);
        liste.ausgabe();
        System.out.println("*************************************************************");

        System.out.println("Suche Nachname (Freiheit) ");
        System.out.println(liste.sucheNachnamen("Freiheit"));
        System.out.println("*************************************************************");

        System.out.println("Suche Matrikelnummer");
        System.out.println(liste.sucheMatrikelnummer("123456789").toString());

        System.out.println("Ersten, Zweiten, Dritten Student Ematrikulieren");
        liste.getStdListe()[0].immatrikulieren("123456789");
        liste.getStdListe()[1].immatrikulieren("987654321");
        liste.getStdListe()[2].immatrikulieren("678912345");
        liste.ausgabe();
        System.out.println("*************************************************************");

        System.out.println("Löschen Erster Student");
        liste.loeschen(studentA);
        liste.ausgabe();
        System.out.println("*************************************************************");
    }
}
