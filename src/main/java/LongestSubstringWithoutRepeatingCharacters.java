import java.util.HashSet;
import java.util.Set;

/**
 * Tasks link: <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/">here</a>
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int count = 0;
        int start = 0;
        int end = 0;
        while (end < s.length()) {
            char current = getChar(s, end);
            if (!set.contains(current)) {
                set.add(current);
                end++;
                count = Math.max(count, set.size());
            } else {
                char next = getChar(s, start);
                set.remove(next);
                start++;
            }
        }
        return count;
    }

    private char getChar(String s, int index) {
        if (index < s.length()) {
            return s.charAt(index);
        } else {
            return '\n';
        }
    }
}
