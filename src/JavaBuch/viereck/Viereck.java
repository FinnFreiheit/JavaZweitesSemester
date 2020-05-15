package JavaBuch.viereck;

public class Viereck
{
    private int a,b,c,d;

    public Viereck(int a, int b, int c, int d)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Viereck()
    {
        this.a = 1;
        this.b = 1;
        this.c = 1;
        this.d = 1;
    }

    protected int getA()
    {
        return this.a;
    }

    protected int getB()
    {
        return this.b;
    }

    protected int getC()
    {
        return this.c;
    }

    protected int getD()
    {
        return this.d;
    }

    public int umfang()
    {
        return this.a + this.b + this.c + this.d;
    }

    public void print()
    {
        System.out.println("[ " + this.a + ", " + this.b + ", " + this.c + ", " + this.d + "] ");
        System.out.println("Der Umfang des Vierecks betraegt " + this.umfang());
    }
}
