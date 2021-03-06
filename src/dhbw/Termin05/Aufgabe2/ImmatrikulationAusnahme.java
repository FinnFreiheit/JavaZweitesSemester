package dhbw.Termin05.Aufgabe2;

/**
 * Diese fachliche Ausnahme wird geworfen, wenn es ein problem mit der Immatrikulationsnummer auftritt.
 */
public class ImmatrikulationAusnahme extends Exception
{
    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public ImmatrikulationAusnahme()
    {
        System.out.println("fehler Immatrikulation");
    }

    /**
     * Constructs a new exception with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public ImmatrikulationAusnahme(String message)
    {
        super(message);
    }
}
