package Polymorphism;

public class MethodOverloading {
    public static void main(String[] args) {
        base b=new base();
        b.display("biryani");
        b.display(10,20);
        double ans=b.display(30,40.5);
        System.out.println(ans);
    }
}
class base{
    void display(String food){
        System.out.println("I am eating "+food);
    }
    void display(int a,int b){
        System.out.println(a+b);
    }
    double display(int a,double b){
        return (a+b);
    }
}
