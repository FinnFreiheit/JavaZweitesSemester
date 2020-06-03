package dhbw.Termin04.Aufgabe01;

public class OperationSubtract implements Strategy
{
    public int doOperation(int zahl1, int zahl2)
    {
        if(zahl1 > zahl2)
            return zahl1 - zahl2;
        else return zahl2 - zahl1;
    }
}
