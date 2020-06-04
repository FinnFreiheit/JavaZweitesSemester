package dhbw.Termin04.Aufgabe01;

import java.awt.*;

/**
 *Rechenbeispiele unter Verwendung vom Strategie Muster
 */
public class CalculusDemo
{
    /**
     * Main Methode mit Rechenbeispielen addition, subtraktion, multiplikation und division.
     * @param args Startparameter werden nicht benötigt.
     */
    public static void main(String[] args)
    {

        int zahl1 = 5;
        int zahl2 = 4;


        Context addition = new Context(new OperationAdd());
        Context subtraktion = new Context(new OperationSubtract());
        Context multiplikation = new Context(new OperationMultiply());
        Context division = new Context(new OperationDivide());

        System.out.print("Addition von " + zahl1 + " und "+ zahl2 + " = "  );
        System.out.println(addition.executeStrategy(zahl1,zahl2));

        System.out.print("Subtraktion von " + zahl1 + " und "+ zahl2 + " = " );
        System.out.println(subtraktion.executeStrategy(zahl1,zahl2));

        System.out.print("Multiplikation von " + zahl1 + " und "+ zahl2 + " = " );
        System.out.println(multiplikation.executeStrategy(zahl1, zahl2));

        System.out.print("Ganzzahlige Division von " + zahl1 + " und "+ zahl2 + " = " );
        System.out.println(division.executeStrategy(zahl1, zahl2));
    }
}
