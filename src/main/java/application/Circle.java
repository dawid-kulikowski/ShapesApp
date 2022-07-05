package application;

import java.util.InputMismatchException;

public class Circle implements Measurable {
    private static final double PI = 3.14;
    private int r;

    public Circle(int r) throws InputMismatchException {
        this.r = r;
    }

    public Circle() {

    }

    public void setR(int r) {
        if (r<=0) {
            throw new InputMismatchException ("You can't build a circle with 0 or less radius.");
        }
        this.r = r;
    }

    @Override
    public double area() {
        return PI*(r*r);
    }

    @Override
    public double perimeter() {
        return 2*PI*r;
    }
}

