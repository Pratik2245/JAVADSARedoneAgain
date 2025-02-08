public class Rec_6_Concept {
    public static void main(String[] args) {
        fun(5);
    }
    public static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n--);
    }
}
