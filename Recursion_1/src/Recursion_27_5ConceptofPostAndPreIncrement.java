public class Recursion_27_5ConceptofPostAndPreIncrement {
    public static void main(String[] args) {
        fun(5);
    }
    public static  void fun(int num){
        if(num==0){
            return;
        }
        System.out.println(num);
//       fun(num--); this will give the infinite recursion
        fun(--num);
    }
}
