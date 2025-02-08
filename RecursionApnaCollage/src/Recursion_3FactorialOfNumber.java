public class Recursion_3FactorialOfNumber {
    public static void main(String[] args) {
        int ans=fact(5);
        System.out.println(ans);
    }
    public static int fact(int num){
     if(num==0){
         return 1;
     }
     return num*fact(num-1);
    }
}
