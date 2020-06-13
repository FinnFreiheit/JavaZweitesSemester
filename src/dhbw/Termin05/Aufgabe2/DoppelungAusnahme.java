package dhbw.Termin05.Aufgabe2;

/**
 * Diese fachliche Ausnahme wird geworfen, wenn der aufrufer unerlaubterweise,
 * ein bereits existierendes Objekt einer Liste hinzufügen möchte.
 */
public class DoppelungAusnahme extends Exception
{
    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public DoppelungAusnahme()
    {
        System.out.println("Doppelung von Studenten");
    }
}
