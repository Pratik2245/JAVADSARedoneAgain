package Tut;

public class staticVariable {
    public static void main(String[] args) {
        staticVariable s=new staticVariable() ;
        s.add();
        s.add();
    }
    static int a=0;
    public  void  add(){
        a++;
        System.out.println(a);

    }
}
