package DailyProblems;

public class SubArrayWithSumk {
    public static void main(String[] args) {
//        int arr[]={10, 2, -2, -20, 10};
        int arr[]={9, 4, 20, 3, 10, 5};
        int ans=SubArray(arr,33);

    }
    public static  int SubArray(int arr[],int k){
        int sum=0,count=0;
        for (int i = 0; i <arr.length ; i++) {
            sum=0;
            for (int j = i; j <arr.length ; j++) {
                sum += arr[j];
                if(sum==k){
                    count=count+1;
//                    sum=0;//here it was wrong logic which was not chechking for other elements
                }
            }
        }
        System.out.println(count);
        return -1;
    }
}
