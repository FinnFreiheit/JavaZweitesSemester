package dhbw.Termin05.Aufgabe2.StudentenJ;

import dhbw.Termin05.Aufgabe2.ImmatrikulationAusnahme;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentenTestJUnit
{

    Student student1, student2, student3;

    @BeforeEach
    void setUp() throws ImmatrikulationAusnahme
    {
       student1 = new Student("Muster", "Max", "123456789", "Stuttgart", "70125");
       student2 = new Student("MusterFrau", "Maja", "987654321", "Berlin", "12345");
       student2.exmatrikulieren();
    }

    @Test
    void exmatrikulieren() throws ImmatrikulationAusnahme
    {
        assertNull(student1.getExmatrikulationsDatum());
        student1.exmatrikulieren();
        assertNotNull(student1.getExmatrikulationsDatum());
    }

    @Test
    void getNachname()
    {
        assertEquals("Muster",student1.getNachname());
    }

    @Test
    void getVorname()
    {
        assertEquals("Max",student1.getVorname());
    }

    @Test
    void getMatrikelNummer()
    {
        assertEquals("123456789",student1.getMatrikelNummer());
    }

    @Test
    void getOrt()
    {
        assertEquals("Stuttgart",student1.getOrt());
    }

    @Test
    void getPlz()
    {
        assertEquals("70125",student1.getPlz());
    }

    @Test
    void getImmatrikulationsDatum()
    {
        assertNotNull(student1.getImmatrikulationsDatum());
    }

    @Test
    void getExmatrikulationsDatum() throws ImmatrikulationAusnahme
    {
        assertNull(student1.getExmatrikulationsDatum());
        student1.exmatrikulieren();
        assertNotNull(student1.getExmatrikulationsDatum());
    }

    @Test
    void testToString()
    {
        assertEquals("Student [nachname=Muster, vorname=Max, matrikelNummer=123456789," +
                " ort=Stuttgart, plz=70125, immatrikulationsDatum=14.Juni 2020, exmatrikulationsDatum=]",student1.toString());
    }

    @Test
    void testEquals()
    {
        assertFalse(student1.equals(null));
        assertTrue(student1.equals(student1));

    }

    @Test
    void testHashCode()
    {
        assertEquals(-1867378635, student1.hashCode());
    }

    @Test
    void compareTo()
    {
        assertEquals(0, student1.compareTo(student1));
    }
}