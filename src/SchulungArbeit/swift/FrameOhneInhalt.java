package SchulungArbeit.swift;
import javax.swing.*;
import java.awt.*;

public class FrameOhneInhalt extends JFrame
{
    public FrameOhneInhalt()
    {

    }
    public static void main(String[] args)
    {
        //Erzeugt ein Fenster Objekt
        FrameOhneInhalt fenster = new FrameOhneInhalt();
        //Setzt Titel des Fenster
        fenster.setTitle("Mein erstes Swing-Fenster");
        //Setzt die größe des Fensters
        fenster.setSize(300,150);
        //Stellt das Fenster dar
        fenster.setVisible(true);
        //setzt das Verhalten beim Schließen
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
