package ClassWork;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int row=2,col=2;
        int row2=2,col2=3;
        int[][] arr={{2,4},
                {1,4}};
        int[][] arr2={{1,4,7},
                {1,3,9}};
        int[][] ans=new int[row2][col2];
        for (int i = 0; i <row; i++) {
            for (int j = 0; j <col2; j++) {
                for (int k = 0; k <col ; k++) {
                  ans[i][j]+=arr[i][k]*arr2[k][j];
                }
            }
        }

        for (int i = 0; i <ans.length ; i++) {
            for (int j = 0; j < ans[0].length; j++) {
            System.out.print(ans[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
