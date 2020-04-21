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
		this.canvas = new Canvas(this.tBtnArr);
		this.getContentPane().add(this.canvas, BorderLayout.CENTER);
		this.getContentPane().add(createButtonPanel(), BorderLayout.SOUTH);
		this.setVisible(true);
	}
	
	private JPanel createButtonPanel()
	{
		JPanel panel = new JPanel();
		
		this.tBtnArr = new JToggleButton[3];
		
		this.tBtnArr[0] = new JToggleButton("Line");
		panel.add(this.tBtnArr[0]);
		
		this.tBtnArr[1] = new JToggleButton("Rechteck");
		panel.add(this.tBtnArr[1]);
		
		this.tBtnArr[2] = new JToggleButton("Dreieck");
		panel.add(this.tBtnArr[2]);
		
		return panel;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		// zwischen den Buttons hin- und her
		
	}
	
	class Canvas extends JPanel implements MouseListener
	{
		JToggleButton[] tBtnArr; 
		Line curLine;
		List<Line> allLines;
		
		Canvas(JToggleButton[] tBtnArr)
		{
			this.addMouseListener(this);
			this.tBtnArr = tBtnArr;
			this.allLines = new ArrayList<>();
		}
		
		@Override
		protected void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			for(Line l : this.allLines)
			{
				g.drawLine(l.start.x, l.start.y, l.end.x, l.end.y);
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
			if(tBtnArr[0].isSelected())
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
		}

		@Override
		public void mouseReleased(MouseEvent e)
		{
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e)
		{
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e)
		{
			// TODO Auto-generated method stub
			
		}
	}

	public static void main(String[] args)
	{
		new MyWindow();
	}
}
