import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

/**
 * Task link: <a href="https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/">here</a>
 */
public class TheKWeakestRowsInAMatrix {
    public int[] kWeakestRows(int[][] mat, int k) {
        final int[][] indexToSoldiers = new int[mat.length][1];
        int[] result = new int[k];

        for (int i = 0; i < mat.length; i++) {
            int[] soldiers = mat[i];
            int sumSoldiers = 0;
            for (int soldier : soldiers) {
                if (soldier == 1) {
                    sumSoldiers += soldier;
                }
            }
            indexToSoldiers[i][0] = sumSoldiers;
        }

        Integer[] indexes = sortByIndexes(indexToSoldiers);

        for (int i = 0; i < k; i++) {
            result[i] = indexes[i];
        }

        return result;
    }

    private Integer[] sortByIndexes(int[][] indexToSoldiers) {
        Integer[] indexes = IntStream.range(0, indexToSoldiers.length).boxed().toArray(Integer[]::new);
        Arrays.sort(indexes, Comparator.comparingDouble(i -> indexToSoldiers[i][0]));
        return indexes;
    }
}