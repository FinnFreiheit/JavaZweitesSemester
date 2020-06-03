package dhbw.TheoretischeInformatik;

public class FibonacciIterativ
{
    public static int FibInterativ(int n)
    {
        int[] feld  = {0,1};
        int temp = 0;
        for (int i = 0; i < n; i++)
        {
            temp = feld[1];
            feld[1] = feld[0] + feld[1];
            feld[0] = temp;
        }
        return feld[0];
    }

    public static void main(String[] args)
    {
        for (int i = 0; i < 7; i++)
        {
            System.out.println(FibInterativ(i));
        }
    }
}
