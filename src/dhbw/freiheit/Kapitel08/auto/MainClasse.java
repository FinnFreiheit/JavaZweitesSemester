package dhbw.freiheit.Kapitel08.auto;

public class MainClasse
{
    public static void main(String[] args)
    {
        Car golfv = new Car( "Golf V TDI",60,60,6.2,0);
        System.out.println( "Spritztour ins Allgäu bitte: 600 km");
        golfv.drive( 600 );
        System.out.println( golfv.toString() );
        System.out.println( "\nSo, und nun zurück. "+ "Leider kein Geld mehr für's Tanken ...");
        golfv.drive( 600 );
        System.out.println( golfv.toString() );
    }
}
