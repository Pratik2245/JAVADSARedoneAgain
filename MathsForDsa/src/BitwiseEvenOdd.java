//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BitwiseEvenOdd {
    public static void main(String[] args) {
       int num=10;
        System.out.println(isOdd(num));
    }

    private static boolean isOdd(int num) {
    return (num&1)==0;
    }
}