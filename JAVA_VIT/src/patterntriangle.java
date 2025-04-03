public class patterntriangle {
    public static void main(String[] args) {
        int n=5;
        int z=1;
        for (int i = 5; i >=1 ; i--) {
            for (int j = 0; j <=i; j++) {
                if(j<i-1){
                    System.out.print("_");
                }else if (j==i){
                    System.out.print("*");
                    for (int k = 0; k <z ; k++) {
                        System.out.print("_");
                    }

                }
            }
            System.out.println();
        }
    }
}
