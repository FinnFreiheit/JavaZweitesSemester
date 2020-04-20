package SchulungArbeit.swift.LinieMitMausZeichnen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PunkteVerbinden extends JFrame
{
    Container c;
    Zeichenbrett z;
    JPanel jp1,jp2;
    JToggleButton[] b = new JToggleButton[3];

    public PunkteVerbinden()
    {
        this.c = getContentPane();

        this.jp2 = new JPanel();
        this.z = new Zeichenbrett(this.b);
        //jp1.add(z);
        String[] text = {"Linie","Dreieck","Rechteck"};
        for (int i = 0; i < 3; i++)
        {
            this.b[i] = new JToggleButton(text[i] );
            this.b[i].setFont(new Font("SansSerif",Font.ITALIC,24));
            this.jp2.add(this.b[i]);
        }


        ButtonListener bL = new ButtonListener();
        this.b[0].addActionListener(bL);
        this.b[1].addActionListener(bL);
        this.b[2].addActionListener(bL);

        this.jp1 =  this.z;
        this.c.add(jp1,BorderLayout.CENTER);
        this.c.add(jp2,BorderLayout.SOUTH);
    }

    class ButtonListener implements ActionListener
    {
     public void actionPerformed(ActionEvent e)
     {
         if (e.getSource() == b[0])
         {
             //getGraphics().drawLine(10, 10, 30, 30);
             System.out.println("Linie gedrückt");
             b[1].setSelected(false);
             b[2].setSelected(false);
         }
         else if (e.getSource() == b[1])
         {
             System.out.println("Dreieck gedrückt");
             b[0].setSelected(false);
             b[2].setSelected(false);
         }
         else
         {
             System.out.println("Rechteck gedrückt");
             b[1].setSelected(false);
             b[0].setSelected(false);
         }
     }
    }
    public static void main(String[] args)
    {
        PunkteVerbinden fenster = new PunkteVerbinden();
        fenster.setTitle("Punkte Verbinde");
        fenster.setSize(500,500);
        fenster.setVisible(true);
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
