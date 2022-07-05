package application;

public class Trapeze implements Measurable{
    private double a;
    private double b;
    private double d;
    private double h;

    public Trapeze(double a, double b, double d, double h) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.h = h;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
