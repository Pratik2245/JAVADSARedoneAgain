//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Rec_1_PrintNTo1 {
    public static void main(String[] args) {
       print(7);
    }
    public static  void print(int n){
        if(n==1)
        {
            System.out.println(n);
            return;
        }
        print(n-1);
        System.out.println(n);
    }
}