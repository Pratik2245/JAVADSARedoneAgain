public class Recursion_12_BinaryStringProblem {
    public static void main(String[] args) {
        printBinaryString(3,0,"");//only consective 1 should not appear
    }
    public static void printBinaryString(int n,int lastPos,String s){
        if(n==0){
            System.out.println(s);
            return;
        }
        if(lastPos==0){
            printBinaryString(n-1,0,s+"0");
            printBinaryString(n-1,1,s+"1");
        }else {
            printBinaryString(n-1,0,s+"0");
        }
    }
}
