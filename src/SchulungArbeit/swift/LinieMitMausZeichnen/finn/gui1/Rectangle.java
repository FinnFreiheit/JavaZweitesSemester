package SchulungArbeit.swift.LinieMitMausZeichnen.finn.gui1;

import java.awt.*;

public class Rectangle
{
    int x;
    int y;
    int width;
    int hight;

    public Rectangle(int x, int y, int width, int hight)
    {
        this.x = x ;
        this.y = y;
        this.width = width;
        this.hight = hight;
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public int getHight()
    {
        return hight;
    }

    public void setHight(int hight)
    {
        this.hight = hight;
    }
}

