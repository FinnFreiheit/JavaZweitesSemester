package dhbw.Termin01;
/**
 * Mein erstes Java-Programm
 */
public class HelloWorld
{
    public static void main(String[] args)
    {
        System.out.println("Guten Tag");
        for (int i = 0; i < args.length; i++)
        {
            System.out.println(args[i]);
        }
    }
}
