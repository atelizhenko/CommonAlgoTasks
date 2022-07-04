import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MedianOfTwoSortedArraysTest {

    static Stream<Arguments> generateSortedArrays() {
        return Stream.of(
                Arguments.of(new int[]{1, 3}, new int[]{2}, 2D),
                Arguments.of(new int[]{1, 2}, new int[]{3, 4}, 2.5D)
        );
    }

    @ParameterizedTest
    @MethodSource({"generateSortedArrays"})
    void testToFindMedianSortedArrays(int[] nums1, int[] nums2, double expected) {
        MedianOfTwoSortedArrays median = new MedianOfTwoSortedArrays();
        assertEquals(expected, median.findMedianSortedArrays(nums1, nums2));
    }
}