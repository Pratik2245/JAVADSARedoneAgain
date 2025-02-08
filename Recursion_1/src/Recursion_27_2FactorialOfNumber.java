public class Recursion_27_2FactorialOfNumber {
    public static void main(String[] args) {
        int fact=fact(5);
        System.out.println(fact);
    }
    public static int fact(int num){
        if(num==1){
            return 1;
        }
        int res=num*fact(num-1);
        System.out.println(res);
        return res;
    }
}
