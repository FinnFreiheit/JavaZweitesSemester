package SchulungArbeit.swing.LinieMitMausZeichnen;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;


import javax.swing.*;

public class MyWindow extends JFrame implements ActionListener
{
	JToggleButton[] tBtnArr;
	Canvas canvas;
	JButton clear;

	JMenuBar menuBar;
	JMenu menu;
	JCheckBoxMenuItem btnRed;
	JCheckBoxMenuItem btnBlack;



	public MyWindow()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 400);
		this.setTitle("Finn Freiheit");
		this.canvas = new Canvas();

		this.getContentPane().add(this.canvas, BorderLayout.CENTER);
		this.getContentPane().add(createButtonPanel(), BorderLayout.SOUTH);

		this.menuBar = new JMenuBar();
		this.menu = new JMenu("Farbe");
		this.menu.setMnemonic(KeyEvent.VK_1);

		btnRed = new JCheckBoxMenuItem("RED");
		this.btnRed.addActionListener(this);
		menu.add(btnRed);

		btnBlack = new JCheckBoxMenuItem("Black");
		this.btnBlack.addActionListener(this);
		menu.add(btnBlack);



		this.menuBar.add(menu);
		this.setJMenuBar(menuBar);

		this.setVisible(true);



	}

	private JPanel createButtonPanel()
	{
		JPanel panel = new JPanel();

		this.tBtnArr = new JToggleButton[4];


		this.tBtnArr[0] = new JToggleButton("Line");
		this.tBtnArr[0].addActionListener(this);
		panel.add(this.tBtnArr[0]);

		this.tBtnArr[1] = new JToggleButton("Rechteck");
		this.tBtnArr[1].addActionListener(this);
		panel.add(this.tBtnArr[1]);

		this.tBtnArr[2] = new JToggleButton("Dreieck");
		this.tBtnArr[2].addActionListener(this);
		panel.add(this.tBtnArr[2]);

		/*this.tBtnArr[3] = new JToggleButton("Clear");
		this.tBtnArr[3].addActionListener(this);
		panel.add(this.tBtnArr[3]);*/

		this.clear = new JButton("Clear");
		this.clear.addActionListener(this);
		panel.add(this.clear);

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
		else if (e.getSource() == tBtnArr[2])
		{
			System.out.println("Dreieck gedrückt");
			tBtnArr[1].setSelected(false);
			tBtnArr[0].setSelected(false);
		}
		else if (e.getSource() == clear)
		{
			System.out.println("Clear gedrückt");
			this.canvas.allLines.clear();
			this.canvas.allRect.clear();
			this.canvas.allDrei.clear();
			this.canvas.repaint();
		}
		//Farbe
		if (e.getSource() == btnBlack)
		{
			System.out.println("btnBlack");
			btnRed.setSelected(false);
		}
		else if(e.getSource() == btnRed)
		{
			btnBlack.setSelected(false);

		}

	}

	class Canvas extends JPanel implements MouseListener
	{

		Line curLine;
		Rectangle curRect;
		Dreieck curDrei;
		//ArrayListen
		List<Line> allLines;
		List<Rectangle> allRect;
		List<Dreieck>allDrei;

		boolean boolP1 = false;
		boolean boolP2 = false;

		Canvas() //Konstruktor
		{
			this.addMouseListener(this);
			this.allLines = new ArrayList<>();
			this.allRect = new ArrayList<>();
			this.allDrei = new ArrayList<>();
		}

		@Override
		protected void paintComponent(Graphics g)
		{
			super.paintComponent(g);

			for(Line l : this.allLines)
			{
				g.setColor(l.farbe);
				g.drawLine(l.start.x, l.start.y, l.end.x, l.end.y);
			}

			for(Rectangle r : this.allRect)
			{
				g.drawRect(r.x,r.y,r.width,r.hight);
			}
			for(Dreieck d : this.allDrei)
			{
				g.drawLine(d.p1.x,d.p1.y,d.p2.x,d.p2.y);
				g.drawLine(d.p2.x,d.p2.y,d.p3.x,d.p3.y);
				g.drawLine(d.p3.x,d.p3.y,d.p1.x,d.p1.y);
			}
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
					this.curLine = new Line(here, here,Color.BLACK);
				}
				else
				{
					this.curLine.setEnd(here);

					//Farbe
					if(MyWindow.this.btnRed.isSelected())
					{
						this.curLine.setFarbe(Color.RED);
					}
					else if(MyWindow.this.btnBlack.isSelected())
					{
						this.curLine.setFarbe(Color.BLACK);
					}


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

			//Dreieck
			if(MyWindow.this.tBtnArr[2].isSelected())
			{

				Point here = e.getPoint();
				if(!boolP1)
				{
					this.curDrei = new Dreieck(here,here,here);
					boolP1 = true;
				}
				else if(!boolP2)
				{
					this.curDrei.setP2(here);
					boolP2 = true;
				}
				else
				{
					this.curDrei.setP3(here);
					this.allDrei.add(this.curDrei);
					boolP1 = false;
					boolP2 = false;
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
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub

		}
	}

	public static void main(String[] args)
	{
		new MyWindow();
	}
}
