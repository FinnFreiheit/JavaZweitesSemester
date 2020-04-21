package SchulungArbeit.swift.LinieMitMausZeichnen;

import java.awt.*;

public class Linie
{
    Point start;
    Point end;

    public Linie(Point start, Point end)
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
