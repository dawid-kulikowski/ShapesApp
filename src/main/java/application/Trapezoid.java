package application;

import java.util.InputMismatchException;

public class Trapezoid implements Measurable{
    private double a;
    private double b;
    private double c;
    private double d;
    private double h;

    public Trapezoid(double a, double b, double c, double d, double h) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
        this.h = h;
    }

    public Trapezoid() {
    }

    public void setA(double a) {
        if (a<=0) {
            throw new InputMismatchException("You can't build a trapezoid with 0 or less side length.");
        }
        this.a = a;
    }

    public void setB(double b) {
        if (b<=0) {
            throw new InputMismatchException("You can't build a trapezoid with 0 or less side length.");
        }
        this.b = b;
    }

    public void setC(double c) {
        if (c<=0) {
            throw new InputMismatchException("You can't build a trapezoid with 0 or less side length.");
        }
        this.c = c;
    }

    public void setD(double d) {
        if (d<=0) {
            throw new InputMismatchException("You can't build a trapezoid with 0 or less side length.");
        }
        this.d = d;
    }

    public void setH(double h) {
        if (h<=0) {
            throw new InputMismatchException("You can't build a trapezoid with 0 or less height.");
        }
        this.h = h;
    }

    @Override
    public double area() {
        return ((a+b)*h)*(0.5);
    }

    @Override
    public double perimeter() {
        return a+b+c+d;
    }
}
