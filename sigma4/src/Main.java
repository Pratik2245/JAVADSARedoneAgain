//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    int matrix[][]= {{1, 2, 3,12},
            {5, 6, 7,8},
            {13,14,15,19}
    };
    printSpiralMatrix(matrix);
    }
    static  void printSpiralMatrix(int matrix[][]){
        int startRow=0;
        int startColumn=0;
        int endRow=matrix.length-1;
        int endColumn=matrix[0].length-1;
        while (startRow<=endRow && startColumn<=endColumn){
            //first we will print the top

            for (int j = startColumn; j <=endColumn ; j++) {
                System.out.print(matrix[startRow][j]+" ");
            }
            System.out.println();
            //now we will print the right side
            for (int i = startRow+1; i <=endRow ; i++) {
                System.out.print(matrix[i][endColumn]+" ");
            }
            System.out.println();
            //now we will print the bottom
            for (int i = endColumn-1; i >=startColumn ; i--) {
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][i]+" ");
            }
            System.out.println();
            //now we will print the left
            for (int i = endRow-1; i >=startRow+1 ; i--) {
                if(startColumn==endColumn){
                    break;
                }
                System.out.print(matrix[i][startColumn]+" ");
            }
            System.out.println();
            startColumn++;
            startRow++;
            endRow--;
            endColumn--;
        }

    }
}