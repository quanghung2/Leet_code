package quan;

import java.util.HashMap;

public class ValidAnagram {


    public static void main(String[] args) {
        String s = "anagram";
        String s2 = "nagaram";
        System.out.println(isAnagram(s, s2));
    }

    public static boolean isAnagram (String s, String t){
        if (s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++){
            char c1 = s.charAt(i);
            if (map.containsKey(c1)){
                map.put(c1, map.get(c1) + 1); // put đè nếu trong string có các char trùng nhau
            } else {
                map.put(c1, 1);
            }
        }

        for (int i = 0; i < t.length(); i++){
            char c2 = t.charAt(i);
            if(map.containsKey(c2)){
                if(map.get(c2) == 1){
                    map.remove(c2);
                } else {
                    map.put(c2, map.get(c2) -1); // remove dần dần
                }
            } else {
                return false;
            }
        }

        if (map.size() > 0){
            return false;
        }

        return true;
    }
}


