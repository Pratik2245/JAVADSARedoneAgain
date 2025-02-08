import java.util.ArrayList;

public class MazePathPrinting {
    public static void main(String[] args) {
//        MazePath("",3,3);
//        ArrayList<String> a=MazePathList("",3,3);
        MazePathDiagonal("",3,3);
//        System.out.println(a);
    }
    public static void MazePath(String ans,int r,int col){
        if(col==1 && r==1){
            System.out.println(ans);
            return;
        }
        if(r>1) {
            MazePath(ans + "D", r - 1, col);
        }
        if(col>1) {
            MazePath(ans + "R", r, col - 1);
        }
    }


//    returning an array list
public static ArrayList<String> MazePathList(String ans, int r, int col){
    if(col==1 && r==1){
        ArrayList<String> res = new ArrayList<>();
        res.add(ans);
        return res;
    }
    ArrayList<String> result = new ArrayList<>();
    if(r>1) {
        result.addAll( MazePathList(ans + "D", r - 1, col));
    }
    if(col>1) {
        result.addAll(MazePathList(ans + "R", r, col - 1));
    }
    return result;
}

    public static void MazePathDiagonal(String ans,int r,int col){
        if(col==1 && r==1){
            System.out.println(ans);
            return;
        }
        if(r>1) {
            MazePathDiagonal(ans + "D", r - 1, col);
        }
        if(r>1 && col>1)
        {
            MazePathDiagonal(ans+"V",r-1,col-1);
        }
        if(col>1) {
            MazePathDiagonal(ans + "R", r, col - 1);
        }
    }
}

