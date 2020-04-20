package SchulungArbeit.swift.LinieMitMausZeichnen;

import javax.swing.*;
import java.awt.*;

public class ZeichenPanel extends JPanel
{
    public void paintComponent(Graphics g)
    {
        //Oben Links im Fenster Koordinaten (0,0)
        //Y-Achse positiv nach unten
        //X-Achse positiv nach rechts

        g.drawLine(10,10,30,30); //Zeichnet eine Linie

        int[] x = {30,40,60,70};
        int[] y = {5,5,30,5};
        g.drawPolyline(x,y,4);

        g.drawRect(10,50,20,10);

        g.drawPolygon(x,y,4);

    }
}
