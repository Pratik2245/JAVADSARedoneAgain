package Polymorphism;

public class Base {
    void area(){
        System.out.println("Area of Base Class");
    }
    public static void main(String[] args) {
        Circle c=new Circle();
        c.area();
        Base b=new Circle();
        b.area();
    }
}
