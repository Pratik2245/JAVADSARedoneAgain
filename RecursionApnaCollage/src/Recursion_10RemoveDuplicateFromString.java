public class Recursion_10RemoveDuplicateFromString {
    public static void main(String[] args) {
        String s="gooodmoorinnngig";
        int n=26;
        boolean arr[]=new boolean[n];
         StringBuilder stringBuilder=new StringBuilder();
        FindDuplicate(s,0,stringBuilder,arr);
    }

    private static void FindDuplicate(String s,int index,StringBuilder stringBuilder,boolean map[]) {
//     base case
       if(index==s.length()){
           System.out.println(stringBuilder);
           return;
       }
       //kaam
       char character=s.charAt(index);
       if(map[character - 'a']){
           FindDuplicate(s,index+1,stringBuilder,map);
       }else {
           map[character-'a']=true;
           FindDuplicate(s,index+1,stringBuilder.append(character),map);
       }
    }


}
