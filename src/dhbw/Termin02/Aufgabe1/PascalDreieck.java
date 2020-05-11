package dhbw.Termin02.Aufgabe1;

public class PascalDreieck
{

    public static void main(String[] args)
    {
        int n = 7;
        int[][] pascalDreieck = new int [n][n];

        for(int zeile = 0; zeile < pascalDreieck.length; zeile++)
        {
            pascalDreieck[zeile][0] = 1;
            pascalDreieck[zeile][zeile] = 1;
            for (int spalte = 1; spalte < zeile ; spalte++)
            {
                pascalDreieck[zeile][spalte] = pascalDreieck[zeile - 1][spalte - 1] + pascalDreieck[zeile - 1][spalte];
            }
        }



        int anzLeerzeichen = n ;

            for (int[] ints : pascalDreieck)
            {
                for (int i = 0; i < anzLeerzeichen; i++)
                {
                    System.out.print("  ");
                }
                for (int j = 0; j < pascalDreieck.length; j++)
                {

                    if (ints[j] != 0)
                    {
                        System.out.print(ints[j]);
                        System.out.print("   ");
                    }
                }
                System.out.println();
                anzLeerzeichen = anzLeerzeichen - 1;

            }

    }
}
