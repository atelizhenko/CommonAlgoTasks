import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {
    static Stream<Arguments> generateFizzBuzzData() {
        return Stream.of(
                Arguments.of(Arrays.asList("1", "2", "Fizz"), 3),
                Arguments.of(Arrays.asList("1", "2", "Fizz", "4", "Buzz"), 5),
                Arguments.of(Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"), 15)
        );
    }

    @ParameterizedTest
    @MethodSource("generateFizzBuzzData")
    void testFizzBuzzSimpleCase(List<String> expected, int input) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(expected, fizzBuzz.fizzBuzz(input));
    }
}