package Pattern;

public class star {
    public static void main(String[] args) {
        int n=5;
//        for (int i = 5; i >0 ; i--) {
//            for (int j = 1; j <=n ; j++) {
//                if(j<=i-1){
//                    System.out.print(" ");
//                }else{
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }

//        i=1 and j=5;
//        for (int i = 1; i<=n ; i++) {
//            for (int j = 5; j >0 ; j--) {
//                if(i<j){
//                    System.out.print(" ");
//                }else{
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }

        for (int i = n; i>0 ; i--) {
            for (int j = n; j >0 ; j--) {
                if(i>n-j+1){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
