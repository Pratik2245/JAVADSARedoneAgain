public class LeetCode_1886WhetherMatrixCanBeObtainedByRotation {
    public static void main(String[] args) {
    int arr[][]={{0,1},{1,0}};
    int target[][]={{1,0},{0,1}};
    findRotation(arr,target);
    }
    public static boolean findRotation(int[][] mat, int[][] target) {
        int row=0,endRow=mat.length-1;
        int i=0;
        while (row<=endRow && i<mat.length) {
            int temp=mat[row][i];
            mat[row][i]=mat[endRow][i];
            mat[endRow][i]=temp;
            row++;
            endRow--;
            i++;
        }
        for (int j = 0; j <mat.length ; j++) {
            for (int k = 0; k <mat[0].length; k++) {
                System.out.print(mat[j][k]);
            }
            System.out.println();
        }
        return true;
    }
}
