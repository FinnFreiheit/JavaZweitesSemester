package SchulungArbeit.swift;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Zeichnung extends JFrame
{
 Container c;
 ZeichenPanel z;

 public Zeichnung() //Konstruktor
 {
     c = getContentPane();
     z = new ZeichenPanel(); //Erzeugt neue Zeichnung
     c.add(z);              //und fügt sie dem Frame hinzu
 }

    public static void main(String[] args)
    {
        Zeichnung fenster = new Zeichnung();
        fenster.setTitle("Zeichnung");
        fenster.setSize(200,200);
        fenster.setVisible(true);
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
