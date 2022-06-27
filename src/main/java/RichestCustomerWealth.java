/**
 * Task link: <a href="https://leetcode.com/problems/richest-customer-wealth/">here</a>
 */
public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int[][] indexToMax = new int[accounts.length][1];
        int max = 0;

        for (int i = 0; i < accounts.length; i++) {
            int[] account = accounts[i];
            int sumInAccounts = 0;
            for (int accountValue : account) {
                sumInAccounts += accountValue;
            }
            indexToMax[i][0] = sumInAccounts;
        }

        for (int[] toMax : indexToMax) {
            int value = toMax[0];
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}
