package dhbw.Termin03.Aufgabe01;


import java.time.LocalDate;


/**
 *
 */
public class Studenten
{
    String vorname;
    String nachname;
    int matrikelnummer;
    Anschrift anschrift;

    LocalDate immatrikulationsdatum;
    LocalDate exmatrikulationsdatum;



    //df = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

    /**
     * Construktor
     * @param vorname
     * @param nachname
     * @param anschrift
     */
    public Studenten(String vorname, String nachname, Anschrift anschrift)
    {
        this.vorname = vorname;
        this.nachname = nachname;
        this.anschrift = anschrift;
    }

    /**
     * Construktor
     * @param vorname
     * @param nachname
     * @param strasse
     * @param postleitzahl
     * @param ort
     */
    public Studenten(String vorname, String nachname, String strasse, String postleitzahl, String ort)
    {
        this.vorname = vorname;
        this.nachname = nachname;
        this.anschrift = new Anschrift(strasse, postleitzahl, ort);
    }

    public boolean immatrikulieren(int matrikelnummer)
    {
        this.immatrikulationsdatum = LocalDate.now();
        if(true)//matrikelnummer > 9E8 && matrikelnummer <= 9E9)
        {
            this.matrikelnummer = matrikelnummer;
            return true;
        }
        else return false;


    }

    public boolean exmatrikulieren()
    {
        if (this.immatrikulationsdatum != null)
        {
            this.exmatrikulationsdatum = LocalDate.now();
            return true;
        }else return false;

    }

    @Override
    public String toString()
    {
        return "Studenten{" +
                "" + "vorname='" + vorname + '\''
                + ", nachname='" + nachname + '\''
                + ", matrikelnummer=" + matrikelnummer
                + anschrift.toString()
                + ", immatrikulationsdatum=" + immatrikulationsdatum
                + ", exmatrikulationsdatum=" + exmatrikulationsdatum + '}';
    }

    public static class Anschrift
    {
        String strasse;
        String postleitzahl;
        String ort;

        @Override
        public String toString()
        {
            return ", strasse='" + strasse + '\''
                    + ", postleitzahl='" + postleitzahl + '\''
                    + ", ort='" + ort + '\'' ;
        }

        public Anschrift(String strasse, String postleitzahl, String ort)
        {
            this.strasse = strasse;
            this.postleitzahl = postleitzahl;
            this.ort = ort;
        }
    }

}