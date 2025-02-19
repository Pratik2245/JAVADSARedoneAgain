package MazeProblemsRedone;
public class MazeAllPathPrinting {
    public static void main(String[] args) {
        int  col=0,row=0;

        boolean arr[][]={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        mazeAllPathPrinting("",col,row,arr);
    }
    public static void mazeAllPathPrinting(String s,int col,int row,boolean arr[][])
    {
        if(col==arr[0].length-1 && row==arr.length-1){
            System.out.println(s);
            return;
        }
        if(!arr[row][col]){
            return;
        }
        arr[row][col]=false;
        if(row<arr.length-1){
            mazeAllPathPrinting(s+"D",col,row+1,arr);
        }

        if(col<arr[0].length-1){
            mazeAllPathPrinting(s+"R",col+1,row,arr);
        }
        if(row>0){
            mazeAllPathPrinting(s+"L",col,row-1,arr);
        }
        if(col>0){
            mazeAllPathPrinting(s+"L",col-1,row,arr);
        }
        arr[row][col]=true;
    }
}
