package dhbw.Termin04.Aufgabe01;

public class OperationDivide implements Strategy
{
    public int doOperation(int zahl1, int zahl2)
    {

        if(zahl2 != 0)
          return zahl1 / zahl2;
        else return 0;

    }
}
