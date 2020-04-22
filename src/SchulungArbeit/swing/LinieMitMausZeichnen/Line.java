package SchulungArbeit.swing.LinieMitMausZeichnen;

import java.awt.*;

public class Line
{
	Point start;
	Point end;
	Color farbe;
	
	public Line(Point start, Point end, Color farbe)
	{
		this.farbe = farbe;
		this.start = start;
		this.end = end;
	}

	public void setStart(Point start)
	{
		this.start = start;
	}

	public void setEnd(Point end)
	{
		this.end = end;
	}

	public void setFarbe(Color farbe)
	{
		this.farbe = farbe;
	}



}
