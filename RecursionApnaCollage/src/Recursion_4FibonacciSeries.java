public class Recursion_4FibonacciSeries {
    public static void main(String[] args) {
        int sum=fibo(2);
        System.out.println(sum);
    }
    public static int fibo(int num){
        if(num==0 || num==1){
            return num;
        }
        return fibo(num-1)+fibo(num-2);
    }
}
