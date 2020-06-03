package dhbw.Termin04.Aufgabe01;

public class Context
{
    private Strategy strategy;

    public Context(Strategy strategy)
    {
        super();
        this.strategy = strategy;
    }

    public int executeStrategy(int n, int m)
    {
        return strategy.doOperation(n, m);
    }


}
