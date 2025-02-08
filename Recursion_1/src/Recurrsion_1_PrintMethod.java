//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Recurrsion_1_PrintMethod {
    public static void main(String[] args) {
        printNumber(5);
//        print1(1);
    }
    public static void printNumber(int num)
    {
         if(num==0)
         {
             return;
         }
          System.out.println(num);
//         this is called tail recursion beacuse it is ending with a function call
          printNumber(num-1);
    }
//    public static void print1(int one){
//        System.out.println(one);
//        print2(3);
//    }
//    public static void print2(int one){
//        System.out.println(one);
//        print3(2);
//    }
//    public static void print3(int one){
//        System.out.println(one);
//        print4(1);
//    }
//    public static void print4(int one){
//        System.out.print(one);
//    }
}