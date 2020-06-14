package dhbw.Termin05.Aufgabe2.Formen;

import dhbw.Termin05.Aufgabe2.NegativerWertAusnahme;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RechteckFlaecheComparatorTest
{

    Rechteck r1, r2;

    @BeforeEach
    void setUp() throws NegativerWertAusnahme
    {
     r1 = new Rechteck(1,1);
     r2 = new Rechteck(2,2);
    }

    @Test
    void compare()
    {
        RechteckFlaecheComparator rc = new RechteckFlaecheComparator();
        assertEquals(0, rc.compare(r1,r1));
        assertEquals(-1,rc.compare(r1,r2));
        assertEquals(1, rc.compare(r2,r1));
    }
}