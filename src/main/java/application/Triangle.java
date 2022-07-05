package application;

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
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setH(double h) {
        this.h = h;
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

