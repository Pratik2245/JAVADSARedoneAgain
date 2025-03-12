package Polymorphism;

public class MethodOverridingCW {
    public static void main(String[] args) {
        BaseClass baseClass;
        baseClass=new child1Class();
        baseClass.eat();
        int result1=baseClass.add(10,20);
        System.out.println(result1);
        baseClass=new child2Class();
        baseClass.eat();
        int res2=baseClass.add(30,40);
        System.out.println(res2);
    }
}
class BaseClass{
    void eat(){
        System.out.println("Base class");
    }
    int add(int a,int b){
        return a+b;
    }
}
class child1Class extends BaseClass{
    void eat(){
        System.out.println("Child class 1");
    }
    int add(int a,int b){
        return a+b;
    }
}

class child2Class extends BaseClass{
    void eat(){
        System.out.println("Child class 2");
    }
    int add(int a,int b){
        return a+b;
    }
}
