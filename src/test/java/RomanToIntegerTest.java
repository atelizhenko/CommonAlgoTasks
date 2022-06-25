import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanToIntegerTest {
    @ParameterizedTest
    @CsvSource(value = {"III:3", "LVIII:58", "MCMXCIV:1994"}, delimiter = ':')
    void testRomanToIntegerShouldEqualToExpectedValue(String input, Integer expected) {
        RomanToInteger romanToInteger = new RomanToInteger();
        assertEquals(expected, romanToInteger.romanToInt(input));
    }
}