package althorithm1;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class RansomNote {
//    public static boolean canConstructor(String note1, String note2) {
//
//    }
    public static void main(String[] args) {
        String ransomNote = "abc";
        String magazine = "hung";
        List<Character> ransomNoteList = ransomNote.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
        System.out.println(ransomNoteList.toString());
        List<Character> magazineList = magazine.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
        System.out.println(magazineList.toString());
        HashMap<Character, Integer> countRansomNote = ransomNoteList.stream().collect(HashMap::new, (m, c) -> {
            m.put(c, m.containsKey(c) ? (m.get(c) + 1) : 1);
        }, HashMap::putAll);
        System.out.println(countRansomNote.toString());

    }
}
