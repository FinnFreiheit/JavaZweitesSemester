package dhbw.Termin04.Aufgabe01;

import java.awt.*;

public class CalculusDemo
{
    public static void main(String[] args)
    {
        Context addition = new Context(new OperationAdd());
        System.out.println(addition.executeStrategy(5,6));
    }
}
