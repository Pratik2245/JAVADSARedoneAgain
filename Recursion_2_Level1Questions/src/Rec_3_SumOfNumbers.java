public class Rec_3_SumOfNumbers {
    public static void main(String[] args) {
        int num=7;
        int sum=Sum(num);
        System.out.println(sum);
    }
    public static  int Sum(int num){
//        base case for the above program
        if(num==1){
            return 1;
        }
        return num+Sum(num-1);
    }
}
