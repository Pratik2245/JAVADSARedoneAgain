public class Rec_5_ProductOfDigit {
    public static void main(String[] args) {
        int num=1234;
        int result=SumOfDigit(num);
        System.out.println(result);
    }
    public static int SumOfDigit(int num){
        if(num==0){
            return 1;
        }
        return (num%10)*SumOfDigit(num/10);
    }
}
