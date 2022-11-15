package althorithm1;

import java.util.ArrayList;
import java.util.List;

public class SwapCharacter {
    public static boolean swap(String s1, String s2) {
        // s1 == s2 return true.
        if(s1.equals(s2)) {
            return true;
        }
        // khởi tạo 1 List l để lưu index của những char khác nhau.
        List<Integer> l = new ArrayList<>();
        // Vòng lặp for để kiểm tra char
        for(int i=0;i<s1.length();i++) {
            if(s1.charAt(i) != s2.charAt(i)){   // nếu khác nhau thì add index vào List l
                l.add(i);
            }
            if(l.size() >2) {     // size l > 2 thì sai cmnr. (vì chỉ được 2 char khác nhau thôi)
                return false;
            }
        }
        // này là check cái thằng l đó. size == 1 thì cũng ăn cứt. size bằng 2 thì ok kiểm tra
        // (đọc ko hiểu s1.charAt(l.get(0)) == s2.charAt(l.get(1)) thì hỏi)
        if(l.size() == 2 && s1.charAt(l.get(0)) == s2.charAt(l.get(1)) && s1.charAt(l.get(1)) == s2.charAt(l.get(0))) {
            return true;
        }

        // méo thuộc cái nào thì return false thôi.
        return false;
    }


    public static void main(String[] args) {
        String s1 = "Hung";
        System.out.println(s1.charAt(1));
        System.out.println(swap("Hung", "Hnug"));
    }
}
