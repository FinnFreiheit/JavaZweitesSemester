package dhbw.Termin03.Aufgabe02;

import dhbw.Termin03.Aufgabe01.Studenten;

import java.util.Objects;

public class StudentenListe
{
    int maximalwert;
    int zaehler = 0;
    private Studenten[] stdListe;

    private final static Studenten STUDENT_NOT_FOUND = new Studenten("Not Found", null, null, null,null);

    /**
     * Construktor
     */
    StudentenListe()
    {
        this.stdListe = new Studenten[0];
    }

    /**
     * Fügt ein Student zur Liste hinzu
     * @pre Studentenliste noch nicht voll
     * @param s Student Objekt
     */
    void add(Studenten s)
    {
        if (zaehler < maximalwert)
        {
            Studenten[] stListNachher;
            boolean temp = true;
            //Auf Doppelung prüfen
            for (Studenten i : this.stdListe)
            {
                temp = (s != i);
            }
            if (this.stdListe.length != 0 && temp)
            {
                //Neues Feld (eins größer als alte Feld)
                stListNachher = new Studenten[stdListe.length + 1];
                //Coppy Feld
                System.arraycopy(this.stdListe, 0, stListNachher, 0, this.stdListe.length);
                stListNachher[stdListe.length] = s;
            }else
            {
                 stListNachher = new Studenten[1];
                stListNachher[0] = s;
            }
            //Referenz auf neue Liste
            this.stdListe = stListNachher;
        }
        this.zaehler++;
    }

    /**
     * Ausgabe der Studentenliste
     */
    void ausgabe()
    {
        for(Studenten s : this.stdListe)
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
     for (Studenten i : this.stdListe)
     {
         if (i.getNachname().equals(nachname))
         {
             return i;
         }
     }return STUDENT_NOT_FOUND;
    }

    /**
     * Suche Vorname aus Liste
     * @param vorname String
     * @return Student
     */
    Studenten sucheVornamen(String vorname)
    {
        for(Studenten i : this.stdListe)
        {
            if(i.getVorname().equals(vorname))
            {
                return i;
            }
        }return STUDENT_NOT_FOUND;
    }

    /**
     * Suche Matrickelnummer in Liste
     * @param matrikelnummer int
     * @return Student
     */
    Studenten sucheMatrikelnummer(String matrikelnummer)
    {
        for(Studenten i : this.stdListe)
        {
            if(Objects.equals(i.getMatrikelnummer(), matrikelnummer))
            {
                return i;
            }
        }return STUDENT_NOT_FOUND;
    }

    /**
     * Suchen Ort in Liste
     * @param ort Sting
     * @return Student
     */
    Studenten sucheOrt(String ort)
    {
        for(Studenten i : this.stdListe)
        {
            if(i.getAnschrift().getOrt().equals(ort))
            {
                return i;
            }
        }return STUDENT_NOT_FOUND;
    }

    boolean sucheObVorhanden(String suchObj)
    {
        if(sucheOrt(suchObj) != STUDENT_NOT_FOUND) return false;
        if(sucheVornamen(suchObj) != STUDENT_NOT_FOUND) return false;
        if(sucheNachnamen(suchObj) != STUDENT_NOT_FOUND) return false;
        if(sucheMatrikelnummer(suchObj) != STUDENT_NOT_FOUND) return false;
        else return true;
    }

    /**
     * Löscht Student aus der Liste
     * @param s Student Objekt
     * @pre Student vorhanden
     */
    void loeschen(Studenten s)
    {
        Studenten zuloeschen;
        if(sucheMatrikelnummer(s.getMatrikelnummer()) != STUDENT_NOT_FOUND)
         zuloeschen = sucheMatrikelnummer(s.getMatrikelnummer());
        else zuloeschen = sucheNachnamen(s.getNachname());
        StudentenListe sListe = new StudentenListe();
        sListe.maximalwert = this.maximalwert;
        for(Studenten i : this.stdListe)
        {
            if(i != zuloeschen)
            {
                sListe.add(i);
            }
        }

        this.stdListe = sListe.stdListe;
    }


    public Studenten[] getStdListe()
    {
        return stdListe;
    }

    public Studenten getStd(int index)
    {
        if(index>=0 && index<this.stdListe.length)
        {
            return this.stdListe[index];
        }
        else return STUDENT_NOT_FOUND;
    }
}
