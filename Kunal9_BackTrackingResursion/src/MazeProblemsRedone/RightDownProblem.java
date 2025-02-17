package MazeProblemsRedone;

public class RightDownProblem {
    public static void main(String[] args) {
        int col=3,row=3;
//      int ans=  mazeProblem(col,row);
//        System.out.println(ans);
//        int res=mazeIteration(col,row);
//        System.out.println(res);
//        printThePath("",col,row);
//    printingThePathDiagonally("",3,3);
        boolean maze[][]=
        {{true,true,true},
        {true,false,true},
        {true,true,true}};
        pathWithRestrictions("",maze,0,0);
    }
//    going to print how many ways we can solve the above problem
    public static int mazeProblem(int col,int row){
        if(col==1 || row==1){
            return 1;
        }
       int right= mazeProblem(col,row-1);
       int down= mazeProblem(col-1,row);
       return  right+down;
    }

//    using iteration method we can solve the maze problem
    public static  int mazeIteration(int col,int row){
      int ans=factorial(col+row-2)/factorial(col-1)*factorial(row-1);
      return ans;
    }
    public static int factorial(int n){
        int res=1;
        for (int i = 1; i <n ; i++) {
            res*=i;
        }
        return res;
    }
    public static  void printThePath(String s,int col,int row){
        if(row==1 && col==1){
            System.out.println(s);
            return;
        }
        if(col>1) {
            printThePath(s + "D", col - 1, row);
        }
        if(row>1){
        printThePath(s+"R",col,row-1);
        }
    }
    public static void printingThePathDiagonally(String s,int col,int row){
        if(row==1 && col==1){
            System.out.println(s);
            return;
        }
        if(row>1 && col>1) {
            printingThePathDiagonally(s + "D", col - 1, row - 1);
        }
        if(col>1) {
            printingThePathDiagonally(s + "V", col - 1, row);
        }
        if(row>1){
            printingThePathDiagonally(s+"H",col,row-1);
        }
    }

//    path with restrictions
   public static void pathWithRestrictions(String s,boolean[][] maze,int row,int col){
        if(row==maze.length-1 && col==maze[0].length-1){
            System.out.println(s);
            return;
        }
        if(!maze[row][col]){
            return;
        }
        if(row<maze.length-1){
            pathWithRestrictions(s+"D",maze,row+1,col);
        }
        if(col<maze[0].length-1){
            pathWithRestrictions(s+"R",maze,row,col+1);
        }
   }
}
