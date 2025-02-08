public class Math_1_EvenOdd {
    public static void main(String[] args) {
        int number=7;
        int ans=number &1;
        if(ans==0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
    }
}
