package dhbw.freiheit.Kapitel08.OOPUebunge.Aufgabe0421;

public class Aufgabe0421
{
    public static void main(String[] args)
    {
        for (int j = 0; j < 8; j++)
        {
            for (int i = 1; i <= 8; i++)
            {
                if ((i+j) < 10)
                {
                    System.out.print(" ");
                }
                System.out.print(i+j);
                System.out.print(" ");
            }
            System.out.println();
            System.out.println();


        }
    }
}
