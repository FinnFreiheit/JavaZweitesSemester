package dhbw.freiheit.Kapitel08.OOPUebunge.Aufgabe0810;

public class Strecke
{
    private Punkt p;
    private Punkt q;

    public Strecke(Punkt p, Punkt q)
    {
        this.p = p;
        this.q = q;
    }
    void read(double px, double py, double qx, double qy)
    {
        this.p.read(px,py);
        this.q.read(qx,qy);
    }
    public double getLaenge()
    {

        return Math.pow((Math.pow((p.getX()-q.getX()),2)+ Math.pow(p.getY()-q.getY(),2)),0.5);

    }

    @Override
    public String toString()
    {
        return "Strecke{" + "p=" + p.toString() + ", q=" + q.toString() + '}';
    }
}
