package ExceptionHandling;

import com.sun.security.jgss.GSSUtil;

public class DivideByZero {
    public static void main(String[] args) {
        int num1=10;
        int num2=0;
        division(num1,num2);
    }
    public static  void  division(int num1,int num2){
     try {
        int res= num1/num2;
         System.out.println(res);
     }catch (Exception e){
         System.out.println(e);
     }
    }

}
