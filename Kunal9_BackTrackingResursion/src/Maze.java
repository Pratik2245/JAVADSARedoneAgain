//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Maze {
    public static void main(String[] args) {
//        method to solve is using matrix
//          ___   ___   ___
//        |     |     |     |
//        |     |     |     |
//        | ___ | ___ | ___ |
    int ans=mazeProblem(3,3);
//    int ans2=mazeProblem2(1,1);
//    int ans3=mazeProblem3(3,1);
        int dai=mazeProblemDiagonal(3,3);
        System.out.println(dai);
    }
//    method 1 to start form 3 ,3
    public static int mazeProblem(int r,int c){
//     base condition
        if(r==1 || c==1){
            return 1;
        }
        int down=mazeProblem(r-1,c);
        int right=mazeProblem(r,c-1);
        return down+right;
    }

//    method 2 to start from 1,1
    public static int mazeProblem2(int row,int col){
        if(row==3 || col==3){
            return 1;
        }
        int down=mazeProblem2(row+1,col);
        int right=mazeProblem2(row,col+1);
        return down+right;
    }
    //    method 3 to start from 3,1
    public static int mazeProblem3(int row,int col){
        if (row == 1 && col == 3) {
        return 1;
        }
        if (row < 1 || col < 1) { // Out of bounds condition
            return 0;
        }
        int down=mazeProblem2(row-1,col);
        int right=mazeProblem2(row,col+1);
        return down+right;
    }
//   using diagonal method
    public static int mazeProblemDiagonal(int r,int c){
//     base condition
        if(r==1 || c==1){
            return 1;
        }
        int down=mazeProblemDiagonal(r-1,c);
        int diagonal=mazeProblemDiagonal(r-1,c-1);
        int right=mazeProblemDiagonal(r,c-1);
        return down+right+diagonal;
    }
}