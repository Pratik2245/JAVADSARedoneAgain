package ClassWork;

public class TransposeOfAMatrix {
    public static void main(String[] args) {
        int arr[][]={{2,4,1,3},
                     {-10,5,11,5},
                     {18,-7,6,9}};
        int col=arr[0].length;
        int row=arr.length;
        int[][] newArr=new int[col][row];
        for (int k = 0; k <col ; k++) {
            for (int l = 0; l <row ; l++) {
                newArr[k][l]=arr[l][k];
            }
        }
        for ( int i = 0; i <newArr.length ; i++) {
            for (int j = 0; j <newArr[0].length ; j++) {
                System.out.print(newArr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
