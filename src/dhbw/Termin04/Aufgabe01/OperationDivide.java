package dhbw.Termin04.Aufgabe01;

public class OperationDivide implements Strategy
{
    /**
     * Division von zwei Zahlen
     * @param zahl1 int Zahl 1
     * @param zahl2 int Zahl 2
     * @return Quotient von Zahl 1 und Zahl 2
     * @pre es darf nicht durch 0 geteilt werden.
     */
    @Override
    public int doOperation(int zahl1, int zahl2)
    {

        if(zahl2 != 0)
          return zahl1 / zahl2;
        else return 0 ;

    }
}
