package dhbw.Termin03.Aufgabe02;

import dhbw.Termin03.Aufgabe01.*;

public class StudentenListeTest
{



    public static void main(String[] args)
    {
        StudentenListe liste = new StudentenListe();

        //erster Student
        Studenten studentA = new Studenten
                ("Finn","Freiheit","Simplonstraße","10245","Berlin");

        Studenten.Anschrift anschriftstudent2 = new Studenten.Anschrift("Müllerstraße", "11111", "Stuttgart");
        Studenten studentB = new Studenten("Max", "Musterman", anschriftstudent2);

        Studenten studentC = new Studenten
                ("Marie", "Musterfrau", "Mariestraße", "101010", "Frankfurt");


        liste.add(studentA);
        liste.add(studentA);
        liste.add(studentB);
        liste.add(studentC);

        liste.ausgabe();

        System.out.println("Löschen");
        liste.loeschen(studentA);

        liste.ausgabe();
    }
}
