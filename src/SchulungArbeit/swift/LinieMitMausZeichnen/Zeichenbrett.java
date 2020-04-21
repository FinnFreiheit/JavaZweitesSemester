package SchulungArbeit.swift.LinieMitMausZeichnen;

import javax.sound.sampled.Line;
import javax.swing.*;
import java.awt.*;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.ListIterator;

public class Zeichenbrett extends JPanel
{
    Point p1 = new Point();
    Point p2 = new Point();
    Point p3 = new Point();
    private JToggleButton[] tButArray;
    private int nrOfPoints;

    ArrayList<Linie> ALLinie = new ArrayList<>();
    ArrayList<Point> ALRechteck = new ArrayList<>();
    ArrayList<Point> ALDreieck = new ArrayList<>();

    public Zeichenbrett(JToggleButton[] tButArray)//Konstruktor
    {
        this.tButArray = tButArray;
        this.nrOfPoints = 0;
        this.addMouseListener(new ClickBearbeiter());

    }


    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

    }



    class ClickBearbeiter extends MouseAdapter
    {
        private JToggleButton[] tButArray;


        public void mousePressed(MouseEvent e,JToggleButton[] tButArray)
        {

            this.tButArray = tButArray;
            p1.x = e.getX();
            p1.y = e.getY();
            nrOfPoints++;
            Zeichenbrett.this.repaint();

            System.out.println("Klicks : " + nrOfPoints);

            if (this.tButArray[0].isSelected())
            {
                System.out.println("Linie ausgewählt");
                Linie l = new Linie(p1,p1);
                if (nrOfPoints == 2)
                {
                    System.out.println("Zweiter Klick");
                }


            }
            else if (this.tButArray[1].isSelected())
            {
                System.out.println("Dreieck ausgewählt");

            }
            else if(this.tButArray[2].isSelected())
            {
                System.out.println("Rechteck ausgewählt");

            }
        }
    }
}
