package dhbw.Termin03.Aufgabe01;


import java.time.LocalDate;


/**
 *
 */
public class Studenten
{
    private String vorname;
    private String nachname;
    private String matrikelnummer;
    private Anschrift anschrift;

    private LocalDate immatrikulationsdatum;
    private LocalDate exmatrikulationsdatum;

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

    /**
     * Student Immatrikulieren
     * @param matrikelnummer
     * @return boolean
     */
    public boolean immatrikulieren(String matrikelnummer)
    {
        this.immatrikulationsdatum = LocalDate.now();
        if(matrikelnummer.length() == 9)
        {
            this.matrikelnummer = matrikelnummer;
            return true;
        }
        else return false;

    }

    /**
     * Student Exmatrikulieren
     * @return boolean
     */
    public boolean exmatrikulieren()
    {
        if (this.immatrikulationsdatum != null)
        {
            this.exmatrikulationsdatum = LocalDate.now();
            return true;
        }else return false;

    }

    /**
     * To String
     * @return String Student
     */
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
        private String strasse;
        private String postleitzahl;
        private String ort;

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

        public String getOrt()
        {
            return ort;
        }
    }

    /**
     * Get Vorname
     * @return Vorname Student
     */
    public String getVorname()
    {
        return vorname;
    }

    /**
     * Get Nachname
     * @return nachname Student
     */
    public String getNachname()
    {
        return nachname;
    }

    /**
     * Get Matrikelnummer
     * @return Matrikelnummer Student
     */
    public String getMatrikelnummer()
    {
        return matrikelnummer;
    }

    /**
     * Get Anschrift
     * @return Anschrift Student
     */
    public Anschrift getAnschrift()
    {
        return anschrift;
    }
}