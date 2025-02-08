public class LeetCode_605CanPlaceFlowers {
    public static void main(String[] args) {
        int arr[]={0,0,1,0,0};
        int n=1;
        boolean b=canPlaceFlowers(arr,n);
        System.out.println(b);
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
      int i=0;
      int count=0;
        for (int j = 0; j <flowerbed.length; j++) {
         if(flowerbed[i]==0){
             boolean rightCheck=(i== flowerbed.length-1 || flowerbed[i+1]==0) && (i==0 || flowerbed[i-1]==0);
             if(rightCheck && n>0){
                 count++;
                 i++;
             }
         }
         if(count>=n) return true;
      }
      return n == 0;
    }
}

//old ans
//int i=0;
//      while (i<flowerbed.length){
//        if(flowerbed[i]==0){
//boolean rightCheck=(i== flowerbed.length-1 || flowerbed[i+1]==0) && (i==0 || flowerbed[i-1]==0);
//             if(rightCheck && n>0){
//flowerbed[i]=1;
//n=n-1;
//i++;
//        }
//        }
//i++;
//        }
//        return n == 0;
