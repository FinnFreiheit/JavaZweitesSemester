package dhbw.Termin04.Aufgabe01;

public class OperationSubtract implements Strategy
{
    /**
     * Subtrahiert Zahl 1 mit Zahl 2
     * @param zahl1 int Minuend
     * @param zahl2 int Subtrahend
     * @return Differenzwert zwischen Minuend und Subtrahend
     */
    @Override
    public int doOperation(int zahl1, int zahl2)
    {
            return zahl1 - zahl2;
    }
}
