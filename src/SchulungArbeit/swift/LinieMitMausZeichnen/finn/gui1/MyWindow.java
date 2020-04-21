package SchulungArbeit.swift.LinieMitMausZeichnen.finn.gui1;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;


import javax.swing.*;

public class MyWindow extends JFrame implements ActionListener
{
	JToggleButton[] tBtnArr;
	Canvas canvas;

	public MyWindow()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 400);
		this.setTitle("Finn Freiheit");
		this.canvas = new Canvas();
		this.getContentPane().add(this.canvas, BorderLayout.CENTER);
		this.getContentPane().add(createButtonPanel(), BorderLayout.SOUTH);
		this.setVisible(true);
	}

	private JPanel createButtonPanel()
	{
		JPanel panel = new JPanel();

		this.tBtnArr = new JToggleButton[3];

		this.tBtnArr[0] = new JToggleButton("Line");
		this.tBtnArr[0].addActionListener(this);
		panel.add(this.tBtnArr[0]);

		this.tBtnArr[1] = new JToggleButton("Rechteck");
		this.tBtnArr[1].addActionListener(this);
		panel.add(this.tBtnArr[1]);

		this.tBtnArr[2] = new JToggleButton("Dreieck");
		this.tBtnArr[2].addActionListener(this);
		panel.add(this.tBtnArr[2]);

		return panel;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// zwischen den Buttons hin- und her
		if (e.getSource() == tBtnArr[0])
		{
			System.out.println("Linie gedrückt");
			tBtnArr[1].setSelected(false);
			tBtnArr[2].setSelected(false);
		}
		else if (e.getSource() == tBtnArr[1])
		{
			System.out.println("Rechteck gedrückt");
			tBtnArr[0].setSelected(false);
			tBtnArr[2].setSelected(false);
		}
		else
		{
			System.out.println("Dreieck gedrückt");
			tBtnArr[1].setSelected(false);
			tBtnArr[0].setSelected(false);
		}

	}

	class Canvas extends JPanel implements MouseListener
	{
		Line curLine;
		List<Line> allLines;

		Rectangle curRect;
		List<Rectangle> allRect;

		Canvas() //Konstruktor
		{
			this.addMouseListener(this);
			this.allLines = new ArrayList<>();
			this.allRect = new ArrayList<>();
		}

		@Override
		protected void paintComponent(Graphics g)
		{
			super.paintComponent(g);

			for(Line l : this.allLines)
			{
				g.drawLine(l.start.x, l.start.y, l.end.x, l.end.y);
			}

			for(Rectangle r : this.allRect)
			{
				g.drawRect(r.x,r.y,r.width,r.hight);
			}
		}

		@Override
		public void mouseClicked(MouseEvent e)
		{
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent e)
		{
			//Linie
			if(MyWindow.this.tBtnArr[0].isSelected())
			{
				Point here = e.getPoint();
				if (this.curLine == null)
				{
					this.curLine = new Line(here, here);
				}
				else
				{
					this.curLine.setEnd(here);
					this.allLines.add(this.curLine);
					this.curLine = null;
					this.repaint();
				}
				System.out.println("pressed");
			}

			//Rechteck
			if(MyWindow.this.tBtnArr[1].isSelected())
			{
				Point here = e.getPoint();
				if(this.curRect == null)
				{
					this.curRect = new Rectangle(here.x,here.y,0,0);
				}

				else
				{
					if(here.x > curRect.getX() && here.y > curRect.getY())
					{
						curRect.setWidth(here.x - curRect.getX());
						curRect.setHight(here.y - curRect.getY());
					}
					else if(here.x < curRect.getX() && here.y > curRect.getY())
					{
						int tempX = curRect.getX();
						int tempY = curRect.getY();
						curRect.setX(here.x);
						curRect.setWidth(Math.abs(tempX - here.x));
						curRect.setHight(Math.abs(tempY-here.y));
					}
					else if(here.x > curRect.getX() && here.y < curRect.getY())
					{
						int tempX = curRect.getX();
						int tempY = curRect.getY();
						curRect.setY(here.y);
						curRect.setWidth(Math.abs(tempX - here.x));
						curRect.setHight(Math.abs(tempY-here.y));

					}
					else
					{
						int tempX = curRect.getX();
						int tempY = curRect.getY();
						curRect.setX(here.x);
						curRect.setY(here.y);
						curRect.setWidth(Math.abs(tempX - here.x));
						curRect.setHight(Math.abs(tempY-here.y));

					}
					this.allRect.add(this.curRect);
					this.curRect = null;
					this.repaint();
				}
			}
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}
	}

	public static void main(String[] args)
	{
		new MyWindow();
	}
}
