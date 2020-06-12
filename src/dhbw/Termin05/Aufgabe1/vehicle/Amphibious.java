package dhbw.Termin05.Aufgabe1.vehicle;

/**
 * The type Amphibious.
 * Amphibious vehicle kann sowohl <code> Swimming </code> als auch <code> Driving </code>
 */
public class Amphibious implements Driving, Swimming
{
    private Driving d;
    private Swimming s;

    /**
     * Construktor
     * erzeugen von objekten der Klassen <code> DrivingImpl </code> und <code> SwimmingImpl </code>
     */
    public Amphibious()
    {
        this.d = new DrivingImpl();
        this.s = new SwimmingImpl();
    }

    /**
     * Zugriff auf die drive Methode von <code> DrivingImpl </code>
     */
    public void drive()
    {
       d.drive();
    }

    /**
     * Zugriff auf die swim Methode von <code> SwimmingImpl </code>
     */
    public void swim()
    {
        s.swim();
    }

    @Override
    public String toString()
    {
        return "Amphibious";
    }
}
