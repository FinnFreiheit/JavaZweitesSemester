package dhbw.Termin01.Aufgabe02;

/**
 * Programm zur Berechnung des Kleinen 1 x 1
 */
public class KleineEinMalEins
{
    /**
     *
     * @param args Es werden keine Startparameter übergeben
     */
    public static void main(String[] args)
    {
        System.out.println("Das kleine 1 x 1: ");
        for (int i = 1; i <= 10  ; i++)
        {
            System.out.println();
            for (int j = 1; j <= 10; j++)
            {
                int temp = i * j;

                if (temp < 10)
                {
                    System.out.print("  " + temp);
                }
                else if(temp < 100)
                {
                    System.out.print(" " + temp);
                }
                else
                {
                    System.out.println(temp);
                }
                System.out.print(" ");
            }
        }
    }
}
