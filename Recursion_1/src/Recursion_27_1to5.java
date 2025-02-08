public class Recursion_27_1to5 {
    public static void main(String[] args) {
        funBoth(1);
    }
    static void funBoth(int num){
        if(num==5){
            System.out.println(num);
            return;
        }
        System.out.println(num);
//        this is calles tail recursion beacuse this is the last statement to get executed so it is called tail recursion
        funBoth(num+1);
//        System.out.println(num);
    }
}
