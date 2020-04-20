package SchulungArbeit.swift.LinieMitMausZeichnen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Zeichenbrett extends JPanel
{
    private int[] x,y; //Koordinaten des Maus-Klicks
    private int n;      // Anzahl der Klicks
    private JToggleButton[] tButArray;

    public Zeichenbrett(JToggleButton[] tButArray)
    {
        this.tButArray = tButArray;
        this.n = 0;
        this.x = new int[3];
        this.y = new int[3];
        this.addMouseListener(new ClickBearbeiter());
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        if(this.tButArray[0].isSelected())
        {
            System.out.println("Linie Zeichnen");
            if(this.n==2)
            {
                g.drawLine(x[0],y[0],x[1],y[1]);
                this.n = 0;
            }
        }
        else if(this.tButArray[1].isSelected())
        {
            System.out.println("Dreieck Zeichnen");
            if(this.n == 3)
            {
                g.drawPolygon(x,y,n);
                this.n = 0;
            }

        }
        else if(this.tButArray[2].isSelected())
        {
            System.out.println("Rechteck");
            if(this.n==2)
            {
                g.drawRect(x[0],y[0],x[1]-x[0],y[1]-y[0]);
                this.n = 0;
            }
        }
        //g.drawPolyline(x,y,n);
    }

    class ClickBearbeiter extends MouseAdapter
    {
        public void mousePressed(MouseEvent e)
        {



            x[n] = e.getX();
            y[n] = e.getY();
            n++;
            Zeichenbrett.this.repaint();
            //repaint();
            //getGraphics().drawPolygon(x,y,n);

        }
    }
}
