package SchulungArbeit.swift.LinieMitMausZeichnen.finn.gui1;

import java.awt.Point;

public class Line
{
	Point start;
	Point end;
	
	public Line(Point start, Point end)
	{
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
	
	
	
}
