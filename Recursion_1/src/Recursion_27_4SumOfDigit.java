import javax.swing.plaf.metal.MetalButtonUI;

public class Recursion_27_4SumOfDigit {
    public static void main(String[] args) {
        int ans=sumOfDigit(3245);
        System.out.println(ans);
        int result=productOfDigit(1234);
        System.out.println(result);
    }
    public static int sumOfDigit(int number){
        if(number==0){
            return 0;
        }
        return (number%10)+sumOfDigit(number/10);
    }
    public static int productOfDigit(int number){
        if(number==0){
            return 0;
        }
        return (number%10)*sumOfDigit(number/10);
    }
}
