package dhbw.Termin03.Aufgabe01;


public class Test
{
    public static void main(String[] args)
    {
        //erster Student
        Studenten studentA = new Studenten
                ("Finn","Freiheit","Simplonstraße","10245","Berlin");
        System.out.println("erster Student: ");
        System.out.println(studentA.toString());
        System.out.println("_______________________________________");

        //zweiter Student
        Studenten.Anschrift anschriftstudent2 = new Studenten.Anschrift("Müllerstraße", "11111", "Stuttgart");
        Studenten studentB = new Studenten("Max", "Musterman", anschriftstudent2);
        System.out.println("zweiter Student: ");
        System.out.println(studentB.toString());
        System.out.println("_______________________________________");

        //dritter Student
       Studenten studentC = new Studenten
               ("Marie", "Musterfrau", "Mariestraße", "101010", "Frankfurt");
        System.out.println("dritter Student: ");
        System.out.println(studentC.toString());
        System.out.println("_______________________________________");

        //Erster Student Exmatrikulieren
        System.out.println("Ersten Student Exmatrikulieren (fehler) ");
        studentA.exmatrikulieren();
        System.out.println(studentA.toString());
        System.out.println("_______________________________________");

        //erster Student Immatrikulieren
        System.out.println("Ersten Student Immatrikulieren");
        studentA.immatrikulieren("123456789");
        System.out.println(studentA.toString());
        System.out.println("_______________________________________");

        //zweiten Student Immatrikulieren
        System.out.println("zweiten Student Immatrikulieren");
        studentB.immatrikulieren("987654321");
        System.out.println(studentB.toString());
        System.out.println("_______________________________________");

        //dritten Student Immatrikulieren
        System.out.println("dritten Student Immatrikulieren");
        studentC.immatrikulieren("567891234");
        System.out.println(studentC.toString());
        System.out.println("_______________________________________");

        //zweiten Student Exmatrikulieren
        System.out.println("Zweiten Student Exmatrikulieren");
        studentB.exmatrikulieren();
        System.out.println(studentB.toString());
        System.out.println("_______________________________________");
    }
}
