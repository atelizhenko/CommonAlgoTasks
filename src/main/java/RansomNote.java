import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static void main(String[] args) {
        RansomNote ransomNote = new RansomNote();
        String ransomNoteString = "aa";
        String magazineString = "ab";
        System.out.printf("Input: ransomNote = %s, magazine = %s%n", ransomNoteString, magazineString);
        System.out.printf("Output: %s%n", ransomNote.canConstruct(ransomNoteString, magazineString));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote == null || ransomNote.isEmpty()) {
            return true;
        }
        if (magazine == null || magazine.isEmpty()) {
            return false;
        }

        Map<String, Integer> lettersCounter = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            String letter = String.valueOf(magazine.charAt(i));
            if (ransomNote.contains(letter)) {
                Integer integer = lettersCounter.get(letter);
                if (integer == null) {
                    lettersCounter.put(letter, 1);
                } else {
                    lettersCounter.put(letter, ++integer);
                }
            } else {
                lettersCounter.put(letter, 1);
            }
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            String letter = String.valueOf(ransomNote.charAt(i));
            Integer integer = lettersCounter.get(letter);
            if (integer == null || integer == 0) {
                return false;
            } else {
                lettersCounter.put(letter, --integer);
            }
        }
        return true;
    }
}
