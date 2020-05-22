package dhbw.Termin03.Aufgabe02;

import dhbw.Termin03.Aufgabe01.Studenten;

public class StudentenListe
{
    int maximalwert;
    private Studenten[] stListVorher;

    /**
     * Construktor
     */
    StudentenListe()
    {
        this.stListVorher = new Studenten[0];
    }

    /**
     * Fügt ein Student zur Liste hinzu
     * @param s Student Objekt
     */
    void add(Studenten s)
    {
        Studenten[] stListNachher;
        boolean temp = true;
        //Auf Doppelung prüfen
        for (Studenten i : this.stListVorher)
        {
            temp = (s != i);
        }
        if (this.stListVorher.length != 0 && temp)
        {
            //Neues Feld (eins größer als alte Feld)
            stListNachher = new Studenten[stListVorher.length + 1];
            //Coppy Feld
            System.arraycopy(this.stListVorher, 0, stListNachher, 0, this.stListVorher.length);
            stListNachher[stListVorher.length] = s;
        }else
        {
             stListNachher = new Studenten[1];
            stListNachher[0] = s;
        }
        //Referenz auf neue Liste
        this.stListVorher = stListNachher;
    }

    /**
     * Ausgabe der Studentenliste
     */
    void ausgabe()
    {
        for(Studenten s : this.stListVorher)
        {
            System.out.println(s.toString());
            System.out.println("___________________________");
        }
    }

    /**
     * Suche Nachname in Liste
     * @param nachname String
     * @return Student
     */
    Studenten sucheNachnamen(String nachname)
    {
     for (Studenten i : this.stListVorher)
     {
         if (i.getNachname().equals(nachname))
         {
             return i;
         }
     }return null;
    }

    /**
     * Suche Vorname aus Liste
     * @param vorname String
     * @return Student
     */
    Studenten sucheVornamen(String vorname)
    {
        for(Studenten i : this.stListVorher)
        {
            if(i.getVorname().equals(vorname))
            {
                return i;
            }
        }return null;
    }

    /**
     * Suche Matrickelnummer in Liste
     * @param matrikelnummer int
     * @return Student
     */
    Studenten sucheMatrikelnummer(int matrikelnummer)
    {
        for(Studenten i : this.stListVorher)
        {
            if(i.getMatrikelnummer() == matrikelnummer)
            {
                return i;
            }
        }return null;
    }

    /**
     * Suchen Ort in Liste
     * @param ort Sting
     * @return Student
     */
    Studenten sucheOrt(String ort)
    {
        for(Studenten i : this.stListVorher)
        {
            if(i.getAnschrift().getOrt().equals(ort));
            {
                return i;
            }
        }return null;
    }

    /**
     * Löscht Student aus der Liste
     * @param s Student Objekt
     */
    void loeschen(Studenten s)
    {
        StudentenListe sListe = new StudentenListe();
        boolean temp = false;

        for(Studenten i : this.stListVorher)
        {
            if(i != s)
            {
                sListe.add(i);
            }
        }

        this.stListVorher = sListe.stListVorher;
    }

}
