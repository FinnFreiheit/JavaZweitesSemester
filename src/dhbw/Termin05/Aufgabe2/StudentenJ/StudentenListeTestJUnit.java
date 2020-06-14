package dhbw.Termin05.Aufgabe2.StudentenJ;

import dhbw.Termin05.Aufgabe2.DoppelungAusnahme;
import dhbw.Termin05.Aufgabe2.MaxStudentenAusnahme;
import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentenListeTestJUnit
{
    StudentenListe liste;
    Student student1 ,student2;

    @BeforeEach
    void setUp()
    {
        liste = new StudentenListe();
        student1 = new Student("Max", "Muster", "123456789", "Stuttgart", "70123");
        student2 = new Student("Marie", "Musterfrau","987654321","Berlin","12345");
    }

    @Test
    void addStudent() throws DoppelungAusnahme, MaxStudentenAusnahme
    {
        assertEquals(0,liste.getAnzahlStudenten());
        liste.addStudent(student1);
        assertEquals(1,liste.getAnzahlStudenten());
    }

    @Test
    void removeStudent() throws DoppelungAusnahme, MaxStudentenAusnahme
    {
        liste.addStudent(student1);
        assertEquals(1,liste.getAnzahlStudenten());
        liste.removeStudent(student1.getMatrikelNummer());
        assertEquals(0,liste.getAnzahlStudenten());

    }

    @Test
    void getAnzahlStudenten()
    {
        assertEquals(0,liste.getAnzahlStudenten());
    }

    @Test
    void suche() throws DoppelungAusnahme, MaxStudentenAusnahme
    {
        liste.addStudent(student1);
        StudentFilter filterMatrikelNummer = new StudentFilter(student1.getMatrikelNummer(), null, null, null);
        Student[] liste1 ;
        liste1 = liste.suche(filterMatrikelNummer);
        assertEquals(1,liste1.length);

    }

    @Ignore
    void printListe()
    {

    }

    @Test
    void getStudent() throws DoppelungAusnahme, MaxStudentenAusnahme
    {
        liste.addStudent(student1);
        assertNull(liste.getStudent(1));
        assertNotNull(liste.getStudent(0));
    }

    @Test
    void sortStudent() throws DoppelungAusnahme, MaxStudentenAusnahme
    {
        StudentenListe liste1 = new StudentenListe();
        liste1.addStudent(student1);
        liste1.addStudent(student2);
        liste1.sortStudent();
        Student tempStudent0 = liste1.getStudent(0);
        Student tempStudent1 = liste1.getStudent(1);

        assertTrue(0>liste1.getStudent(0).compareTo(liste1.getStudent(1)));



    }

    @Test
    void sortStudentVorname() throws DoppelungAusnahme, MaxStudentenAusnahme
    {
        liste.addStudent(student1);
        liste.addStudent(student2);
        liste.sortStudentVorname();
        assertTrue(0>liste.getStudent(0).getVorname().compareTo(liste.getStudent(1).getVorname()));

    }

    @Test
    void sortStudentNachname() throws DoppelungAusnahme, MaxStudentenAusnahme
    {
        liste.addStudent(student1);
        liste.addStudent(student2);
        liste.sortStudentNachname();
        assertTrue(0 > liste.getStudent(0).getNachname().compareTo(liste.getStudent(1).getNachname()));

    }

    @Test
    void sortStudentOrt() throws DoppelungAusnahme, MaxStudentenAusnahme
    {
        liste.addStudent(student1);
        liste.addStudent(student2);
        liste.sortStudentOrt();

        assertTrue(0>liste.getStudent(0).getOrt().compareTo(liste.getStudent(1).getOrt()));


    }
}