//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CheckNumberEvenOdd {
    public static void main(String[] args) {
        int number=5;
        int ans=number & 1;
        if(ans==1) {
            System.out.println("Number id Odd");
        }else{
            System.out.println("NUmber is Even");
        }
    }
}