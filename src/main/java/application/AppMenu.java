package application;

import java.util.Scanner;

public class AppMenu {
    private static Scanner scanner = new Scanner(System.in);

    private AppMenu() {
    }

    public static void menu() {
        int choose;
        System.out.println("Choose your shape: \n 1. Square \n 2. Circle \n 3. Triangle \n 4. Rectangle \n 5. Trapezoid");
        choose = scanner.nextInt();

        switch(choose) {
            case 1:
                System.out.println("SQUARE MEASURE");
                Square square = new Square();
                System.out.println("Square length A:");
                square.setA(scanner.nextInt());
                System.out.println("Area of this square is: " + square.area());
                System.out.println("Perimeter of this square is: " + square.perimeter());
                break;
            case 2:
                System.out.println("CIRCLE MEASURE");
                Circle circle = new Circle();
                System.out.println("Circle radius R:");
                circle.setR(scanner.nextInt());
                System.out.println("Area of this circle is: " + circle.area());
                System.out.println("Perimeter of this circle is: " + circle.perimeter());
                break;
            case 3:
                System.out.println("TRIANGLE MEASURE");
                Triangle triangle = new Triangle();
                System.out.println("Triangle side A:");
                triangle.setA(scanner.nextInt());
                System.out.println("Triangle side B:");
                triangle.setB(scanner.nextInt());
                System.out.println("Triangle side C:");
                triangle.setC(scanner.nextInt());
                System.out.println("Triangle height H:");
                triangle.setH(scanner.nextInt());
                System.out.println("Area of this triangle is: " + triangle.area());
                System.out.println("Perimeter of this triangle is: " + triangle.perimeter());
                break;
            case 4:
                System.out.println("RECTANGLE MEASURE");
                Rectangle rectangle = new Rectangle();
                System.out.println("Rectangle side A:");
                rectangle.setA(scanner.nextInt());
                System.out.println("Rectangle side B:");
                rectangle.setB(scanner.nextInt());
                System.out.println("Area of this rectangle is: " + rectangle.area());
                System.out.println("Perimeter of this rectangle is: " + rectangle.perimeter());
                break;
            case 5:
                System.out.println("TRAPEZOID MEASURE");
                Trapezoid trapezoid = new Trapezoid();
                System.out.println("Trapezoid side A:");
                trapezoid.setA(scanner.nextInt());
                System.out.println("Trapezoid side B:");
                trapezoid.setB(scanner.nextInt());
                System.out.println("Trapezoid side C:");
                trapezoid.setC(scanner.nextInt());
                System.out.println("Trapezoid side D:");
                trapezoid.setD(scanner.nextInt());
                System.out.println("Trapezoid height H:");
                trapezoid.setH(scanner.nextInt());
                System.out.println("Area of this trapezoid is: " + trapezoid.area());
                System.out.println("Perimeter of this trapezoid is: " + trapezoid.perimeter());
                break;
            default: return;
            }

        System.out.println("Do you want to measure other shape? \n 1. Yes \n 2. No");
        choose = scanner.nextInt();
        switch (choose) {
            case 1:
            menu();
                break;
            case 2:
                System.out.println("Thank you for using this App.");
                break;
            default: return;
        }

        }
    }