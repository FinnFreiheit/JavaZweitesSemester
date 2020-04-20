package dhbw.freiheit.Kapitel09.Waehrung;

public class WaehrungMain
{
    public static void main(String[] args)
    {
        Yen safe = new Yen(2000);
        Yen.setKurs(1.0/130);
        System.out.println(safe.dollarBetrag());
    }
}
