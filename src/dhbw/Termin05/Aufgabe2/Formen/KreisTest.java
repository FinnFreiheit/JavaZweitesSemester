package dhbw.Termin05.Aufgabe2.Formen;

import dhbw.Termin05.Aufgabe2.NegativerWertAusnahme;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;


import static org.junit.jupiter.api.Assertions.*;

class KreisTest
{

    @Test
    void getRadius() throws NegativerWertAusnahme
    {
        Kreis k = new Kreis(5);
        assertEquals(5,k.getRadius());

    }

    @Test
    void berechneUmfang() throws NegativerWertAusnahme
    {
        Kreis k = new Kreis(1);
        assertEquals(6.283185307179586, k.berechneUmfang());

    }

    @Test
    void berechneFlaeche() throws NegativerWertAusnahme
    {
        Kreis k = new Kreis(1);
        assertEquals(3.141592653589793,k.berechneFlaeche());
    }

    @Test
    void testToString() throws NegativerWertAusnahme
    {
        Kreis k = new Kreis(1);
        assertEquals("Kreis mit Radius = 1.0", k.toString());

    }

    @Test
    void testEquals() throws NegativerWertAusnahme
    {
        Kreis k = new Kreis(1);
        assertTrue(k.equals(k));
    }

    @Test
    void testHashCode() throws NegativerWertAusnahme
    {
        Kreis k = new Kreis(1);
        assertEquals(1072693248,k.hashCode());
    }
}