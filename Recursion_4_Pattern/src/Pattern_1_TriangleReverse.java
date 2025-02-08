//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Pattern_1_TriangleReverse {
    public static void main(String[] args) {
        int num=4;
//        Triangle(num,num);

        Triangle2(num,num);
    }
    public static void Triangle(int row,int col) {
       if(row==0 ){
          return ;
       }
       if(col>0){
          System.out.print("* ");
          Triangle(row,col-1);
       }else{
           if (row != 1) {
               System.out.println();
           }
          Triangle(row-1,row-1);
       }
    }
    public static void Triangle2(int row,int col) {
        if(row==0 ){
            return ;
        }
        if(col>0){
            Triangle2(row,col-1);
            System.out.print("* ");
        }else{

            Triangle2(row-1,row-1);
            System.out.println();
        }
    }

}