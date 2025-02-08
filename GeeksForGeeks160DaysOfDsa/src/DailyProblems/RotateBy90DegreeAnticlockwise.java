package DailyProblems;

public class RotateBy90DegreeAnticlockwise {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,5},
                     {4,5,6,5},
                     {7,8,9,5}};
        int n=arr.length;
        int m=arr[0].length;
        int arr1[][]=new int[m][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m; j++) {
                arr1[j][i]=arr[i][j];
            }
        }
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }
    }
}
