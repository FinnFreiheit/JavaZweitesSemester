package dhbw.Termin05.Aufgabe1.vehicle;

/**
 * Klasse zum Testen der Vehicle Klassestruktur
 */
public class VehicleTest
{
    /**
     * Testet ob das Objekt vom Typ vehicle vom typ drving oder swimming ist
     *
     * @param vehicle the vehicle
     */
    public static void testAbilities(Vehicle vehicle)
    {
        System.out.println("---> Object: " + vehicle);

        if(vehicle instanceof Driving)
        {
            System.out.println("Can drive: ");
            ((Driving)vehicle).drive();
        }

        if(vehicle instanceof Swimming)
        {
            System.out.println("Can swim");
            ((Swimming)vehicle).swim();
        }
    }

    /**
     * main Methode
     * Aufrufen von testAbilities mit zwei unterschiedlichen vehicle
     * @param args the input arguments
     */
    public static void main(String[] args)
    {
        testAbilities(new Car());
        testAbilities(new Amphibious());
    }
}
