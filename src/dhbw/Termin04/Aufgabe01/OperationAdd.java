package dhbw.Termin04.Aufgabe01;

public class OperationAdd implements Strategy
{
    /**
     * Addition von zwei Zahlen
     * @param zahl1 int Erste Zahl
     * @param zahl2 int Zweite Zahl
     * @return Summer aus Zahl eins und Zahl zwei.
     */
    @Override
    public int doOperation(int zahl1, int zahl2)
    {
        return zahl1 + zahl2;
    }
}
