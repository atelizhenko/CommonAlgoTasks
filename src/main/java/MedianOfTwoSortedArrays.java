import java.util.Arrays;

/**
 * Task link <a href="https://leetcode.com/problems/median-of-two-sorted-arrays/">...</a>
 *
 * Algorithm:
 * Naive Approach:
 *
 * 1. Sort the array arr[] in increasing order.
 * 2. If number of elements in arr[] is odd, then median is arr[n/2].
 * 3. If the number of elements in arr[] is even, median is average of arr[n/2] and arr[n/2-1].
 *
 * Problem with merging arrays:
 * Method 1: By traversing both the arrays to keep track of the current element in each arrays and finding the minimum
 * value among the two and updating the output_array with the least value.
 *
 * Method 2: Concatenate the two arrays into one and then sorting the entire array.
 *
 * Method 3: Another approach is by using min-heaps. Take first element from both the arrays and add it to the min-heap
 * and output the root element from the min-heap to the merged_sorted_array and continue the same until all the array
 * elements have been processed.
 * Method 3 algorithm:
 * Declare two arrays and input the array elements in both the arrays.
 * Take the first element from both the arrays and insert them into a min-heap.
 * The root element of the min-heap (minimum element) is moved to the output_array and the index of the output_array is incremented.
 * Now, take the next element from both the arrays and continue the same procedure.
 */
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];

        System.arraycopy(nums1, 0, result, 0, nums1.length);
        System.arraycopy(nums2, 0, result, nums1.length, nums2.length);

        Arrays.sort(result);

        int length = result.length;
        //even?
        if ((length & 1) == 0) {
            return ((double)result[length / 2] + (double)result[length / 2 - 1] ) / 2;
        } else {
            //odd
            return result[length / 2];
        }
    }
}
