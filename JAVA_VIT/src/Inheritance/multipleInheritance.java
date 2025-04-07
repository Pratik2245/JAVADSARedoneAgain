package Inheritance;

interface MOM{
    void greet();
    void display(int data);
}
interface DAD{
void run();
void display();
}

//In Java, you cannot reduce the visibility of a method when you override it.
//So when the interface says the method is public, your class must implement it with public access, or you'll get a compilation error.
class child implements MOM,DAD{
    @Override
    public void greet() {
        System.out.println("Good morning");
    }

    @Override
    public void display() {
        System.out.println("Showing users details");
    }
    public void display(int data){
        System.out.println("Value="+data);
    }

    @Override
    public void run() {
        System.out.println("Running");
    }
}
public class multipleInheritance {
    public static void main(String[] args) {
    child c=new child();
    c.greet();
    c.display(123);
    c.display();
    c.run();
    }
}
