package dhbw.Termin06.Aufgabe3.student;

import java.util.Random;
import java.util.function.Supplier;

/**
 * Klasse zur Generierung von Studenten.
 */
public class StudentSupplier implements Supplier<Student>
{
    /**
     * The Student.
     */
    Student student;

    /**
     * Instantiates a new Student supplier.
     */
    public StudentSupplier()
    {

    }

    /**
     * Generiere Student.
     * Der Wohnort wird zufällig zwischen Berlin, Stuttgart und München ausgewählt
     * @return the student
     */
    public Student generiereStudent()
    {
        String ort;
        String name;
        String nachname;
        String strasse;
        String plz;
        String matrikelnummer;

        Random zufall = new Random();
        int zahl = zufall.nextInt(100);

        if(zahl % 3 == 0)
        {
            ort = "Berlin";
        }
        else if (zahl % 3 == 1)
        {
            ort = "Stuttgart";
        }
        else
        {
            ort = "München";
        }

        name = "vor" + (zahl % 15) ;
        nachname = "nach" + (zahl % 15);
        strasse = (zahl % 15) + "Straße";
        plz = String.valueOf(zufall.nextInt(100000));
        matrikelnummer = String.valueOf(zufall.nextInt(100000000));

        student = new Student(name,nachname,matrikelnummer, strasse, plz, ort);
        return student;
    }

    /**
     * Übergabe des generierten Stududenten
     * @return a result
     */
    @Override
    public Student get()
    {
        this.student = generiereStudent();
        return student;
    }
}
