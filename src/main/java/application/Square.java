package application;

import java.util.InputMismatchException;

public class Square implements Measurable{
    private double a;

    public Square() {
    }

    public Square(double a) throws InputMismatchException {
        this.a = a;
    }

    public void setA(double a) {
        if (a<=0) {
            throw new InputMismatchException ("You can't build a Square with 0 or less side length.");
        }
        this.a = a;
    }

    @Override
    public double area() {
        return a*a;
    }

    @Override
    public double perimeter() {
        return 4*a;
    }
}
