package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Day3_Anagram {
    public static void main(String[] args) {
        String s="geeks";
        String s1="ksaeg";
       boolean ans= areAnagrams(s,s1);
        System.out.println(ans);
    }
    public static boolean areAnagrams(String s1, String s2) {
     if(s1.length() !=s2.length()){
         return false;
     }
     char CharacterArray1[]=s1.toCharArray();
     char CharacterArray2[]=s2.toCharArray();
        Arrays.sort(CharacterArray1);
        Arrays.sort(CharacterArray2);
        int i=0;
        while (i<CharacterArray1.length){
            if(CharacterArray1[i]!=CharacterArray2[i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
