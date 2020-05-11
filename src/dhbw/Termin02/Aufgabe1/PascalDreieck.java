package dhbw.Termin02.Aufgabe1;
/**
 * Aufgabe 01 Erzeugen eines Pascal dreiecks in einem 2D Array
 * mit Formatierter Ausgabe
 */
public class PascalDreieck
{
    /**
     * Funktion zur formartierten Ausgabe des Pascal dreieckes
     * @param pascalDreieck 2D Array
     */
    public static void ausgabePascalDreieck(int[][] pascalDreieck)
    {
        int anzLeerzeichen = pascalDreieck.length;

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

    /**
     * Erzeugen eines 2D Arrays in dem das Pascal dreieck gespeichert wird.
     * @param args übergabe der dreieck Größe
     */
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
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
        ausgabePascalDreieck(pascalDreieck);
    }
}
