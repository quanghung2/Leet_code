package quan2;

import java.util.Locale;

public class ValidPalindrom {
    public static void main(String[] args) {
         String s = "abs    SBA";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s){
        s = s.replaceAll("[^a-zA-Z0-9]","");
        s = s.toLowerCase();
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
