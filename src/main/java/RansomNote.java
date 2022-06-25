import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote == null || ransomNote.isEmpty()) {
            return true;
        }
        if (magazine == null || magazine.isEmpty()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        for (char c : ransomNote.toCharArray()) {
            Integer value = map.getOrDefault(c, 0);
            map.put(c, value + 1);
            if (map.get(c) == 1) {
                count++;
            }
        }

        for (int i = 0; i < magazine.length(); i++) {
            char chr = magazine.charAt(i);
            Integer value = map.getOrDefault(chr, 0);
            map.put(chr, value - 1);
            if (map.get(chr) == 0) {
                if (--count == 0) {
                    return true;
                }
            }
        }
        return count == 0;
    }
}
