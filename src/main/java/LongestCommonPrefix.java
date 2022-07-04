import java.util.Arrays;

/**
 * Task link: <a href="https://leetcode.com/problems/longest-common-prefix/">...</a>
 * <p>
 * Algorithm
 * Sort the array of strings in alphabetical order.
 * <p>
 * Compare the characters in the first and last strings in the array. Since the array is sorted, common characters among the first and last element will be common among all the elements of the array.
 * <p>
 * 2.1. If they are same, then append the character to the result.
 * <p>
 * 2.2. Else, stop the comparison – result contains the longest common prefix among the strings in the array.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        } else if (strs.length == 1) {
            return strs[0];
        } else {
            Arrays.sort(strs);
            int length = strs[0].length();
            int size = strs.length;
            StringBuilder resultBuilder = new StringBuilder(length);
            for (int i = 0; i < length; i++) {
                char charFromFirst = strs[0].charAt(i);
                char charFromLast = strs[size - 1].charAt(i);
                if (charFromFirst == charFromLast) {
                    resultBuilder.append(charFromFirst);
                } else {
                    break;
                }
            }
            return resultBuilder.toString();
        }
    }
}
