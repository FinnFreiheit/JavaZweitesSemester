package dhbw.Termin04.Aufgabe01;

public class OperationMultiply implements Strategy
{
    /**
     * Multiplikation von Zahl 1 und Zahl 2
     * @param zahl1 int Zahl 1
     * @param zahl2 int Zahl 2
     * @return Produkt aus Zahl 1 und Zahl 2
     */
    @Override
    public int doOperation(int zahl1, int zahl2)
    {
        return zahl1 * zahl2;
    }
}
