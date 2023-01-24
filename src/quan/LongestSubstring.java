package quan;

import java.util.HashSet;
import java.util.Stack;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "fafsoenadlmf";
        System.out.println(LongestSubstring(s));
    }

    public static int LongestSubstring (String s){
        HashSet<Character> set = new HashSet<>();
        int start = 0, end = 0;
        int maxLength = 0;

        while (end < s.length()){
            if (!set.contains(s.charAt(end))){
                set.add(s.charAt(end));
                end++;
                maxLength = Math.max(maxLength, set.size());
            } else {
                set.remove(s.charAt(start));
                start++;
            }
        }
        return maxLength;
    }
}
