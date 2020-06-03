package dhbw.TheoretischeInformatik;

public class FibonacciRek
{
    public static void main(String[] args)
    {

        for (int i = 0; i < 7; i++)
        {
            System.out.println(fibonacciRekursiv(i));
        }

    }

    private static int fibonacciRekursiv(int n)
    {
        if (n <= 1) return n;
        else return fibonacciRekursiv(n-1) + fibonacciRekursiv(n - 2);
    }
}
