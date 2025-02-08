public class pattern5 {
    public static void main(String[] args) {
        int n=5;
        for (int row = 1; row <2*n ; row++) {
//            System.out.println(row);
            int totalColumns=row>n?2*n-row:row;
            for (int col = 0; col <totalColumns; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
