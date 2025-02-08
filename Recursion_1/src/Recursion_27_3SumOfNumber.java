public class Recursion_27_3SumOfNumber {
    public static void main(String[] args) {
        int res=sum(5);
        System.out.println(res);
    }
    public static int sum(int num){
        if(num==1){
            return num;
        }
        return num+sum(num-1);
    }
}
