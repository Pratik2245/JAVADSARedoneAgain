package Assignments;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Assignment4 {
    public static void main(String[] args) {
        System.out.println("==Triangle==");
        Triangle t=new Triangle();
        t.getInput();

        System.out.println("==Square==");
        Square s=new Square();
        s.getInput();

        System.out.println("==Circle==");
        Circle c=new Circle();
        c.getInput();

        t.setArea();
        t.setArea(100,50);

        s.setArea();
        s.setArea(50);

        c.setArea();
        c.setArea(10);
    }
}

class Shape{
 double area;
}
class Triangle extends  Shape{
  double height;
  double width;
    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base of Triangle: ");
        width = sc.nextDouble();
        System.out.print("Enter height of Triangle: ");
        height = sc.nextDouble();
    }

    void setArea() {
        area = 0.5 * width * height;
        System.out.println("Area of Triangle: " + area);
    }

    // Overloaded setArea() that accepts parameters directly
    void setArea(double base, double height) {
        area = 0.5 * base * height;
        System.out.println("Area of Triangle (using parameters): " + area);
    }

}
class Circle extends  Shape{
    double radius;
    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of Circle: ");
        radius = sc.nextDouble();
    }
    void setArea() {
        area = PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    // Overloaded setArea() that accepts parameters directly
    void setArea(double radius) {
        area = PI * radius * radius;
        System.out.println("Area of Circle (using parameter): " + area);
    }
}
class Square extends  Shape{
    double side;
    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of Square: ");
        side = sc.nextDouble();
    }
    void setArea() {
        area = side * side;
        System.out.println("Area of Square: " + area);
    }

    // Overloaded setArea() that accepts a parameter directly
    void setArea(double side) {
        area = side * side;
        System.out.println("Area of Square (using parameter): " + area);
    }
}