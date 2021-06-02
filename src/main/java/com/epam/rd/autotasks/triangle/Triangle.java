package com.epam.rd.autotasks.triangle;

import java.lang.Math.*;

public class Triangle {
    Point a;
    Point b;
    Point c;

    public Triangle(Point a, Point b, Point c) {
        if((a == null || b == null || c == null) || ((a.getX() == b.getX()  && a.getX() == c.getX()) || (a.getY() == b.getY() && a.getY() == c.getY())) || ((a.getX() == b.getX() && a.getY() == b.getY()) || (a.getX() == c.getX() && a.getY() == c.getY()) || (b.getX() == c.getX() && b.getY() == c.getY())))throw new RuntimeException();
        this.a = a;
        this.b = b;
        this.c = c;
        if(area() == 0) throw new RuntimeException();
    }

    public double area() {
        return (Math.abs((a.getX() - c.getX()) * (b.getY() - a.getY()) - (a.getX() - b.getX()) * (c.getY() - a.getY()))) / 2;
    }

    public Point centroid(){
        return new Point((a.getX() + b.getX() + c.getX())/3, (a.getY() + b.getY() + c.getY())/3);
    }

}
