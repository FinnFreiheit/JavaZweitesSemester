package dhbw.Termin05.Aufgabe2.Formen;

import dhbw.Termin05.Aufgabe2.NegativerWertAusnahme;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadratTest
{

    Quadrat q;

    @BeforeEach
    void setUp() throws NegativerWertAusnahme
    {
         q = new Quadrat(1);
    }

    @Test
    void getKantenLaenge()
    {
        assertEquals(1,q.getKantenLaenge());
    }

    @Test
    void berechneFlaeche()
    {
        assertEquals(1,q.berechneFlaeche());
    }

    @Test
    void berechneUmfang()
    {
        assertEquals(1,q.berechneFlaeche());
    }

    @Test
    void testToString()
    {
        assertEquals("Quadrat mit der Kantenlänge = 1.0", q.toString());
    }

    @Test
    void testEquals()
    {
        assertTrue(q.equals(q));
    }

    @Test
    void testHashCode()
    {
        assertEquals(2128609280,q.hashCode());
    }
}