package dhbw.Termin04.Aufgabe01;

/**
 * Klasse legt fesst welche Operation ausgeführt werden soll.
 */
public class Context
{
    /**
     * Die zu verwendende Operation
     */
    private Strategy strategy;

    /**
     * Konstruktor
     * @param strategy die verwendete Operation
     */
    public Context(Strategy strategy)
    {
        super();
        this.strategy = strategy;
    }

    /**
     * Führt die im Context gewählte Operation auf zwei Zahlen aus.
     * @param n int Zahl 1
     * @param m int Zahl 2
     * @return Int Ergebnis der Operation
     */
    public int executeStrategy(int n, int m)
    {
        return strategy.doOperation(n, m);
    }


}
