package dhbw.Termin05.Aufgabe2.Formen;

import dhbw.Termin05.Aufgabe2.NegativerWertAusnahme;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RechteckTest
{
    Rechteck r, r1, r2;
    Rechteck[] rArray;

    @BeforeEach
    void setUp() throws NegativerWertAusnahme
    {
        r = new Rechteck(1,2);
        r1 = new Rechteck(1,1);
        r2 = new Rechteck(2,2);

        rArray = new Rechteck[]{r, r1};
    }

    @Test
    void getA()
    {
        assertEquals(1,r.getA());
    }

    @Test
    void getB()
    {
        assertEquals(2,r.getB());
    }

    @Test
    void berechneFlaeche()
    {
        assertEquals(2,r.berechneFlaeche());
    }

    @Test
    void berechneUmfang()
    {
        assertEquals(6, r.berechneUmfang());
    }

    @Test
    void testToString()
    {
        assertEquals("Rechteck mit der Seitenl�nge a = 1.0 und b = 2.0", r.toString());
    }

    @Test
    void testEquals()
    {
        assertTrue(r.equals(r));
    }

    @Test
    void testHashCode()
    {
        assertEquals(2142240768,r.hashCode());
    }

    @Test
    void compareTo()
    {
        assertEquals(0, r.compareTo(r));
        assertEquals(1,r.compareTo(r1));
        assertEquals(-1,r1.compareTo(r));
    }

    @Test
    void printArray()
    {
     assertEquals("Rechteck mit der Seitenl�nge a = 1.0 und b = 2.0\n"
             + "Rechteck mit der Seitenl�nge a = 1.0 und b = 1.0\n", r.printArray(rArray));
    }
}