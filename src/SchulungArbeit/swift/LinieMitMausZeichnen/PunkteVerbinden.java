package SchulungArbeit.swift.LinieMitMausZeichnen;

import javax.swing.*;
import java.awt.*;

public class PunkteVerbinden extends JFrame
{
    Container c;
    Zeichenbrett z;

    public PunkteVerbinden()
    {
        c = getContentPane();
        z = new Zeichenbrett();
        c.add(z);
    }

    public static void main(String[] args)
    {
        PunkteVerbinden fenster = new PunkteVerbinden();
        fenster.setTitle("Punkte Verbinde");
        fenster.setSize(250,200);
        fenster.setVisible(true);
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
