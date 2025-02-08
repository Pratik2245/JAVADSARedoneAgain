//package DailyProblems;
//
//import java.util.HashMap;
//
//public class countPairsWithGivenSum {
//    ArrayList<Integer> search(String txt, String pat) {
//        ArrayList<Integer> result = new ArrayList<>();
//        int n = txt.length();
//        int m = pat.length();
//
//        // Handle edge case where pattern is empty or longer than text
//        if (m == 0 || m > n) {
//            return result; // Return empty list
//        }
//
//        // Step 1: Compute the LPS (Longest Prefix Suffix) array
//        int[] lps = computeLPS(pat);
//
//        // Step 2: Use the LPS array to search for the pattern in the text
//        int i = 0; // Index for txt
//        int j = 0; // Index for pat
//        while (i < n) {
//            if (txt.charAt(i) == pat.charAt(j)) {
//                i++;
//                j++;
//            }
//            if (j == m) {
//                // Pattern found at index (i - m)
//                result.add(i - m + 1); // 1-based indexing as per GFG convention
//                j = lps[j - 1]; // Reset j to the previous match position
//            } else if (i < n && txt.charAt(i) != pat.charAt(j)) {
//                if (j != 0) {
//                    j = lps[j - 1]; // Use LPS array to avoid unnecessary comparisons
//                } else {
//                    i++;
//                }
//            }
//        }
//        return result;
//    }
//
//    public int[] computeLPS(String pat) {
//        int m = pat.length();
//        int[] lps = new int[m];
//        int len = 0; // Length of the previous longest prefix suffix
//        int i = 1;
//
//        // LPS array calculation
//        while (i < m) {
//            if (pat.charAt(i) == pat.charAt(len)) {
//                len++;
//                lps[i] = len;
//                i++;
//            } else {
//                if (len != 0) {
//                    len = lps[len - 1];
//                } else {
//                    lps[i] = 0;
//                    i++;
//                }
//            }
//        }
//        return lps;
//    }
//    public static void main(String[] args) {
//        int arr[]={1, 5, 7, -1, 5};
//
//    }
//}
