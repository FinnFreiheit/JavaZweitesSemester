package dhbw.Termin06.Aufgabe3.student;

import dhbw.Termin03.Aufgabe02.StudentenListe;

import java.util.ArrayList;

/**
 *
 */
public class SucheNameZuOrt
{
    /**
     * Suche Studenten die im übergebenen Ort Wohnen
     *
     * @param liste Die Liste an Studenten
     * @param ort   Der gesuchte Ort
     */
    public static void sucheNamezuOrt(ArrayList<Student> liste,String ort)
    {

        liste.forEach(System.out::println);
        System.out.println("__________________________");
        System.out.println();
        System.out.println("Wohnort: " + ort);
        liste.stream()
                .filter(x -> x.getOrt().equals(ort))
                .forEach(x-> System.out.println("name :" + x.getVorname()) );
        System.out.println();
        System.out.println("_____________________________");
    }

    /**
     * The entry point of application.
     * Erstelle eine Liste an Studenten, generiert vom Studenten Supplier
     * @param args the input arguments
     */
    public static void main(String[] args)
    {
        ArrayList<Student> liste = new ArrayList<>();
        StudentSupplier neuerStudent = new StudentSupplier();

        for(int i = 0; i < 10 ; i++)
        {

            liste.add(neuerStudent.get());
        }

        sucheNamezuOrt(liste,"Berlin");
        sucheNamezuOrt(liste,"Stuttgart");
        sucheNamezuOrt(liste,"München");

    }
}
