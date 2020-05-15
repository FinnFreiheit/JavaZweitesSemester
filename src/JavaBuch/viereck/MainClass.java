package JavaBuch.viereck;

public class MainClass
{
    public static void main(String[] args)
    {
        Viereck v1 = new Viereck(10,20,30,40);
        v1.print();

        Viereck v2 = new Viereck();
        v2.print();

        Rechteck r1 = new Rechteck(20, 40);
        r1.print();

        Viereck[] va = new Viereck[2];
        va[0] = new Viereck(20,25,30,35);
        va[1] = new Rechteck(30, 40);

        for (int i = 0; i < va.length; i++)
        {
            va[i].print();
        }
    }
}
