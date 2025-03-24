public class LeetCode_1351CountTheNegativeNumberInASortedMatrix {
    public static void main(String[] args) {
//  Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
//  Output: 8
//  Explanation: There are 8 negatives number in the matrix.
        int arr[][]={{4,3,2,-1},
                    {3,2,1,-1},
                    {1,1,-1,-2},
                    {-1,-1,-2,-3}};
        int ans=countNegatives(arr);
        System.out.println(ans);
    }
    public static int countNegativesInRow(int arr[]){
        int left=0;
        int right=arr.length-1;
        while (left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]<0){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return arr.length-left;
    }
    public static int countNegatives(int[][] grid) {
      int count=0;
      for(int row[]:grid){
          count+=countNegativesInRow(row);
      }
      return count;
    }
}
