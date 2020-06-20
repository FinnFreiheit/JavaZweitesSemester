package dhbw.TheoretischeInformatik;

public class BubleSort
{
    // O(n^2)
    public static int[] BubleSort(int[] Array)
    {
        int temp;
        for (int i = 0; i < Array.length - 1; i++) {
            for (int j = 0; j <  Array.length -1 -i  ; j++) {
                if(Array[j] > Array[j + 1]) {
                   temp = Array[j];
                   Array[j] = Array[j + 1];
                   Array[j + 1] = temp;
                }
            }
        }
        return Array;
    }

    public static void AusgabeArray(int[] Array)
    {
        for(int i : Array)
        {
            System.out.print(i);
        }
        System.out.println();
        System.out.println("____________________________");
    }


    public static void main(String[] args)
    {
        int[] Array = {3,5,2,4,1};
        AusgabeArray(Array);
        Array = BubleSort(Array);
        AusgabeArray(Array);
    }
}
