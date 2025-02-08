public class LeetCode_1342_CountTheNumberOfSteps {
    public static void main(String[] args) {
        int number=14;
        int ans=numberOfSteps(number);
        System.out.println(ans);
    }
    public static int numberOfSteps(int num) {
    return helperFunction(num,0);
    }
    public static int helperFunction(int num,int count){
        if(num==0){
            return count;
        }
        if(num%2==0){
            return helperFunction(num/2,count+1);
        }else{
            return helperFunction(num-1,count+1);
        }
    }
}
