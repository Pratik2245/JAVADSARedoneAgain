package DailyProblems;

import java.util.ArrayList;

public class spiralMatrix {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int arr[][] = {{1, 2, 3, 4,5, 6},{ 7, 8, 9, 10, 11, 12}, {13, 14, 15, 16,17,18}};
        int colStart = 0;
        int rowStart = 0;
        int colEnd = arr[0].length - 1;
        int rowEnd = arr.length - 1;
        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int i = colStart; i <= colEnd; i++) {
                arrayList.add(arr[rowStart][i]);
            }
            rowStart++;
            for (int i = rowStart; i <= rowEnd; i++) {
                arrayList.add(arr[i][colEnd]);
            }
            colEnd--;
            if(rowStart<=rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    arrayList.add(arr[rowEnd][i]);
                }
            rowEnd--;
            }
            if(colStart<=colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    arrayList.add(arr[i][colStart]);
                }
                colStart++;
            }
        }
            System.out.println(arrayList);
    }
}
