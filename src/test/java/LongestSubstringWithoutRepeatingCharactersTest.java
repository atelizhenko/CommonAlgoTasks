import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringWithoutRepeatingCharactersTest {

    @ParameterizedTest
    @CsvSource(value = {"au:2", "aue:3", "abcabcbb:3", "bbbbb:1", "pwwkew:3", "\' \':1", "c:1", "aab:2"}, delimiter = ':')
    void testLengthOfLongestSubstring(String s, int expectedLength) {
        LongestSubstringWithoutRepeatingCharacters repeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        assertEquals(expectedLength, repeatingCharacters.lengthOfLongestSubstring(s));
    }
}