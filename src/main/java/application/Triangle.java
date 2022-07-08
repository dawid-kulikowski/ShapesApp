package application;

import java.util.InputMismatchException;

public class Triangle implements Measurable{
    private double a;
    private double b;
    private double c;
    private double h;

    public Triangle() {
    }

    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }


    public void setA(double a) {
        if (a<=0) {
            throw new InputMismatchException("You can't build a triangle with 0 or less side length.");
        }
        this.a = a;
    }

    public void setB(double b) {
        if (b<=0) {
            throw new InputMismatchException("You can't build a triangle with 0 or less side length.");
        }
        this.b = b;
    }

    public void setC(double c)
    {
        if (c<=0) {
            throw new InputMismatchException("You can't build a triangle with 0 or less side length.");
        }
        this.c = c;
    }

    public void setH(double h)
    {
        if (h<=0) {
            throw new InputMismatchException("You can't build a triangle with 0 or less side height.");
        }
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getH() {
        return h;
    }

    @Override
    public double area() {
        return ((a*h)*(0.5));
    }

    @Override
    public double perimeter() {
        return a+b+c;
    }

}

