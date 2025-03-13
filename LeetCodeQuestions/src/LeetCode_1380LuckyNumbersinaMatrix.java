import java.util.*;
public class LeetCode_1380LuckyNumbersinaMatrix {
        public static List<Integer> luckyNumbers(int[][] matrix) {
            List<Integer> result = new ArrayList<>();
            int m = matrix.length, n = matrix[0].length;
            int[] rowMin = new int[m];
            int[] colMax = new int[n];

            // Find the minimum elements in each row
            Arrays.fill(rowMin, Integer.MAX_VALUE);
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    rowMin[i] = Math.min(rowMin[i], matrix[i][j]);
                }
            }

            // Find the maximum elements in each column
            for (int j = 0; j < n; j++) {
                for (int i = 0; i < m; i++) {
                    colMax[j] = Math.max(colMax[j], matrix[i][j]);
                }
            }

            // Find lucky numbers
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] == rowMin[i] && matrix[i][j] == colMax[j]) {
                        result.add(matrix[i][j]);
                    }
                }
            }

            return result;
            }

            public static void main(String[] args) {
                int[][] matrix1 = {{3,7,8},{9,11,13},{15,16,17}};
                int[][] matrix2 = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
                int[][] matrix3 = {{7,8},{1,2}};

                System.out.println(luckyNumbers(matrix1)); // Output: [15]
                System.out.println(luckyNumbers(matrix2)); // Output: [12]
                System.out.println(luckyNumbers(matrix3)); // Output: [7]
            }
        }
