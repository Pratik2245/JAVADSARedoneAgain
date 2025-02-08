public class messageFunction {
    public static void main(String[] args) {
        message(1);
    }

    static void message(int n){
        if(n==5) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        message(n+1);
    }
//    now we will do this using recursion
//    public static void message(){
//        System.out.println("hello from function 0");
//        message1();
//    }
//    public static  void message1(){
//        System.out.println("hello from function 1");
//        message2();
//    }
//    public static  void message2(){
//        System.out.println("hello from function 2");
//        message3();
//    }
//    public static void message3(){
//        System.out.println("hello from function 3");
//    }
}
