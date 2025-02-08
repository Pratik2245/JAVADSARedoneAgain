public class Recursion_2SumOfNNaturalNumbers {
    public static void main(String[] args) {
        int num;
        num=Sum(5);
        System.out.println(num);
    }
    public static int Sum(int num){
        if(num==1){
            return 1;
        }
        return num+Sum(num-1);
    }
}
