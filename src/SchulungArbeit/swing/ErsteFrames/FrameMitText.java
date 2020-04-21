package SchulungArbeit.swing.ErsteFrames;

import javax.swing.*;
import java.awt.*;
//Erzeugt ein einfaches Swing-Fenster
public class FrameMitText extends JFrame
{
    Container c;         //Container dieses Frames
    JLabel beschriftung; // Label, das im Frame erscheine soll

    public FrameMitText()
    {
        //Konstruktor
        //Bestimme die Referenz auf den eigenen Container
        c = getContentPane();
        //Setze das Layout
        c.setLayout(new FlowLayout());
        //Erzeuge das Labelobjekt mit uebergbe des Labeltextes
        beschriftung = new JLabel("Label-Text im Frame");
        //Fuege das Label der Frame hinzu
        c.add(beschriftung);
    }

    public static void main(String[] args)
    {
        FrameMitText fenster = new FrameMitText();
        fenster.setTitle("Frame mit Text mit Label");
        fenster.setSize(300,150);
        fenster.setVisible(true);
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
