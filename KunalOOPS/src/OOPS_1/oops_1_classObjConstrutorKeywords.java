package OOPS_1;

public class oops_1_classObjConstrutorKeywords {
    public static void main(String[] args) {
        Student s=new Student();
//        first it will check in object and then in the class the value of the marks number
//        s.marks=99.5f;
        System.out.println(s.rollNo);
        System.out.println(s.name);
        System.out.println(s.marks);
    }
}
class Student{
    int rollNo;
    String name;
    float marks;
//    constructors in the oops
    Student(){

//        calling a constructor inside a constructor
        this(27,"pratik",100.0f);
        System.out.println("hello world");
    }
    Student(int rollNo,String name,float marks){
        this.rollNo=rollNo;
        this.name=name;
        this.marks=marks;
    }
}
