package Subset;

import java.util.ArrayList;

public class SubSetOfAString {
    public static void main(String[] args) {
        String s="abc";
        String ans="";
        StringSubSet1(s,ans);
//        StringSubSet1Ascii(s,ans);
//        StringSubSet2(s,ans);
//        ArrayList<String> list=new ArrayList<>();
//        list=StringSubSet3(s,ans);
//        System.out.println(list);
    }
    //not returning anything
    public static void StringSubSet1(String s,String ans){
        if(s.isEmpty()){
            System.out.print(ans+" ");
            return;
        }
        char ch=s.charAt(0);
        StringSubSet1(s.substring(1),ans+ch);
        StringSubSet1(s.substring(1),ans);
    }
//    returning a string
    public static String StringSubSet2(String s,String ans){
        if(s.isEmpty()){
            System.out.print(ans+" ");
            return ans;
        }
        char ch=s.charAt(0);
        return StringSubSet2(s.substring(1),ans+ch)+StringSubSet2(s.substring(1),ans);
    }
//    returning an arraylist
    public static ArrayList<String> StringSubSet3(String s,String ans){
        if(s.isEmpty()){
            ArrayList<String>list=new ArrayList<>();
            list.add(ans);
            return list;
        }
        ArrayList<String> include=new ArrayList<>();
        ArrayList<String> exclude=new ArrayList<>();
        char ch=s.charAt(0);
        include=StringSubSet3(s.substring(1),ans+ch);
        exclude=StringSubSet3(s.substring(1),ans);
        include.addAll(exclude);
        return include;
    }

    public static void StringSubSet1Ascii(String s,String ans){
        if(s.isEmpty()){
            System.out.print(ans+" ");
            return;
        }
        char ch=s.charAt(0);
        StringSubSet1Ascii(s.substring(1),ans+ch);
        StringSubSet1Ascii(s.substring(1),ans);
        StringSubSet1Ascii(s.substring(1),ans+(ch+0));
    }
}
