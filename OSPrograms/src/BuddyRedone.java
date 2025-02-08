import java.util.ArrayList;

public class BuddyRedone {
    class  Pair{
        int LowerBound,UpperBound;
        Pair(int a ,int b){
            LowerBound=a;
            UpperBound=b;
        }
    }
        int size;//size of memory
        ArrayList<Pair> arr[];
        BuddyRedone(int s){
        int x=(int)Math.ceil(Math.log(s)/Math.log(s));
        arr=new ArrayList[x+1];//we do x+1 beacuse we need 0 and the max size of the memory so
       }

    public static void main(String[] args) {
        int initialMemory=0,val=0;
        initialMemory=128;
        BuddyRedone b=new BuddyRedone(initialMemory);
//        b.allocate();
    }
}
