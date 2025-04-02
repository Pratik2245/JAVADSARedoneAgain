public class patterntriangle {
    public static void main(String[] args) {
        int n=5;
        for (int i = 5; i >=1 ; i--) {
            for (int j = 0; j <=i; j++) {
                if(j<i-1){
                    System.out.print("_");
                }else if (j==i){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
