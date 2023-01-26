package quan2;

import java.util.HashMap;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "cbbd";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s){
        int start = 0, end = s.length() ;
        while (start < end){
           while (end > start) {
               if (!isPalindrome(s)){
                   s = s.substring(0, end - 1);
                   end--;
               } else {
                   return s;
               }
           }
           end = s.length() ;
           start++;
       }
       return null;
    }
    public static boolean isPalindrome(String s){
        int start = 0, end = s.length()-1;
        while (start < end){
            if (s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}
