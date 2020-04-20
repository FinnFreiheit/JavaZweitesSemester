package SchulungArbeit.swift.LinieMitMausZeichnen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Zeichenbrett extends JPanel
{
    private int[] x,y; //Koordinaten des Maus-Klicks
    private int n;      // Anzahl der Klicks

    public Zeichenbrett()
    {
        n = 0;
        x = new int[1000];
        y = new int[1000];
        addMouseListener(new ClickBearbeiter());
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawPolyline(x,y,n);
    }

    class ClickBearbeiter extends MouseAdapter
    {
        public void mousePressed(MouseEvent e)
        {
            x[n] = e.getX();
            y[n] = e.getY();
            n++;
            repaint();
        }
    }
}
