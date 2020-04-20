package dhbw.freiheit.Kapitel08.OOPUebunge.Aufgabe0810;

public class Punkt
{
    private double x;
    private double y;

    public Punkt(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    void read(double x, double y )
    {
        setX(x);
        setY(y);
    }

    @Override
    public String toString()
    {
        return "Punkt{" + "x=" + x + ", y=" + y + '}';
    }


}
