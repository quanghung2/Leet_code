package quan2;

public class ValidPalindrom2 {
    public static void main(String[] args) {
        String s = "abca";
        System.out.println(validPalindrom(s));
    }

    public static boolean validPalindrom(String s){
        if (!check(s)){
            for (int start = 0, end = s.length() - 1; start < end; start++, end--){
                if (s.charAt(start) != s.charAt(end)){

                    String removeStart = s.substring(0, start) + s.substring(start + 1);
                    String removeEnd = s.substring(0, end) + s.substring(end + 1);
                    if (check(removeEnd) == true || check(removeStart) == true){
                        return true;
                    } else {
                        return false;
                    }
                }

            }
        }
        return true;
    }

    public static boolean check(String s){
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
