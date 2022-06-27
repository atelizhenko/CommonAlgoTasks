import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RichestCustomerWealthTest {
    static Stream<Arguments> generateCustomerWealthData() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 2, 3}, {3, 2, 1}}, 6),
                Arguments.of(new int[][]{{1, 5}, {7, 3}, {3, 5}}, 10),
                Arguments.of(new int[][]{{2, 8, 7}, {7, 1, 3}, {1, 9, 5}}, 17)
        );
    }

    @ParameterizedTest
    @MethodSource("generateCustomerWealthData")
    void testRichestCustomerWealth(int[][] accounts, int expected) {
        RichestCustomerWealth richestCustomerWealth = new RichestCustomerWealth();
        assertEquals(expected, richestCustomerWealth.maximumWealth(accounts));
    }
}