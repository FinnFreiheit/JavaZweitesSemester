package JavaBuch.viereck;

public class Rechteck extends Viereck
{

    public Rechteck(int breite, int hoehe)
    {
        super(breite, hoehe, breite, hoehe);
    }

    public int area()
    {
        return this.getA() * this.getB();
    }

    @Override
    public void print()
    {
        System.out.println("[ " + this.getA() + ", " + this.getB() + ", " + this.getC() + ", " + this.getD() + "] ");
        System.out.println("Der Umfang des Rechtecks betraegt         " + this.umfang());
        System.out.println("Der Flaecheninhalt des Rechtecks betraegt " + this.area());
    }
}
