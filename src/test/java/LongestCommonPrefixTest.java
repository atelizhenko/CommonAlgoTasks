import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonPrefixTest {

    static Stream<Arguments> generateLongestCommonPrefix() {
        return Stream.of(
                Arguments.of(new String[]{"flower", "flow", "flight"}, "fl"),
                Arguments.of(new String[]{"dog", "racecar", "car"}, "")
        );
    }

    @ParameterizedTest
    @MethodSource({"generateLongestCommonPrefix"})
    void longestCommonPrefix(String[] strs, String expected) {
        LongestCommonPrefix commonPrefix = new LongestCommonPrefix();
        assertEquals(expected, commonPrefix.longestCommonPrefix(strs));
    }
}