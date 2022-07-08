package application;

import java.util.InputMismatchException;

public class Rectangle implements Measurable{
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle() {
    }

    public void setA(double a) {
        if (a<=0) {
            throw new InputMismatchException("You can't build a rectangle with 0 or less side length.");
        }
        this.a = a;
    }

    public void setB(double b) {
        if (b<=0) {
            throw new InputMismatchException("You can't build a rectangle with 0 or less side length.");
        }
        this.b = b;
    }

    @Override
    public double area() {
        return a*b;
    }

    @Override
    public double perimeter() {
        return ((2*a)+(2*b));
    }
}
