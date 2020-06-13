package dhbw.Termin05.Aufgabe2;

/**
 * Diese fachliche Ausnahme wird geworfen, wenn der aufrufer unerlaubterweise, eine Negativen wert ubergeben hat.
 */
public class NegativerWertAusnahme extends Exception
{
    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public NegativerWertAusnahme()
    {
        super("Negativer Wert übergeben");
    }
}
