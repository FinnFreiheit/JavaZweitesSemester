package dhbw.Termin03.Aufgabe02;

import JavaBuch.Studenten.Student;
import dhbw.Termin03.Aufgabe01.Studenten;

public class StudentenListe
{
    int maximalwert;
    private Studenten[] stListVorher;

    StudentenListe()
    {
        this.stListVorher = new Studenten[0];
    }

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

    void ausgabe()
    {
        for(Studenten s : this.stListVorher)
        {
            System.out.println(s.toString());
            System.out.println("___________________________");
        }
    }

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
