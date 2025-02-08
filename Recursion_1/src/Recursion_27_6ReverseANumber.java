public class Recursion_27_6ReverseANumber {
    public static void main(String[] args) {
        int num=23456;
       int sum1= reverseNumber(num);
        System.out.println(sum1);
    }
    static int sum=0;
//    1 st way but not optimal 
    public static int reverseNumber(int num){
        if(num==0){
            return 1;
        }
         int rem=num%10;
        return (rem*10)+reverseNumber(num/10);
    }
//    public static void reverseNumber(int num){
//        if(num==0){
//            return;
//        }
//         int rem=num%10;
//        sum=(sum*10)+rem;
//        reverseNumber(num/10);
//    }
}
