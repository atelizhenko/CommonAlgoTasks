import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfStepsToReduceNumberToZeroTest {
    @ParameterizedTest
    @CsvSource(value = {"14:6", "8:4", "123:12"}, delimiter = ':')
    void testNumberOfSteps(int input, int expected) {
        NumberOfStepsToReduceNumberToZero numberToZero = new NumberOfStepsToReduceNumberToZero();
        assertEquals(expected, numberToZero.numberOfSteps(input));
    }
}