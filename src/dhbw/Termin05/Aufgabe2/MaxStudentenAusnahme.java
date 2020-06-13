package dhbw.Termin05.Aufgabe2;

public class MaxStudentenAusnahme extends Exception
{
    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public MaxStudentenAusnahme()
    {
        System.out.println("fehler maximale Anzahl Studenten");
    }

    /**
     * Constructs a new exception with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public MaxStudentenAusnahme(String message)
    {
        super(message);
    }
}
