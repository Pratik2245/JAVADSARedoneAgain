
public class Main {
    public static void main(String[] args) {
//    Student s=new Student(1,"pratik",90);
    Student s=new Student();
    s.rollNo=123;
    s.Display();
    }
}
class Student{
    int rollNo=23;
    String name;
    float marks;
    Student(){
        System.out.println("hello world");
    }
    Student(int roll,String name,int marks){
    this.rollNo=roll;
    this.name=name;
    this.marks=marks;
    }
    public void Display(){
        System.out.println(rollNo);
        System.out.println(name);
        System.out.println(marks);
    }
}