public class Rec_2_FactorialOfANumber {
    public static void main(String[] args) {
        int num=5;
        int ans=factorial(num);
        System.out.println("factorial od number "+num+"="+ans);
    }
    public static int factorial(int num){
        if(num<1){
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if(num==1){
            return 1;
        }
        return num*factorial(num-1);
    }
}
