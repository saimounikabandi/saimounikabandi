import java.util.Arrays;
public class subsetsum {
    public static boolean issubsetsumMemo(int[] arr, int n, int target, int[][] dp) {
        if (target == 0) {
            return true;
        }
        if (n == 0) {
            return false;
        }
     if (dp[n][target] != -1) {
            return dp[n][target] == 1;
        }
 if (arr[n - 1] > target) {
            dp[n][target] = issubsetsumMemo(arr, n - 1, target, dp) ? 1 : 0;
        } else {
            boolean include = issubsetsumMemo(arr, n - 1, target - arr[n - 1], dp);
            boolean exclude = issubsetsumMemo(arr, n - 1, target, dp);
            dp[n][target] = (include || exclude) ? 1 : 0;
        }
return dp[n][target] == 1;
    }
 public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
        int target = 9;
        int n = arr.length;
        int[][] dp = new int[n + 1][target + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
 boolean result = issubsetsumMemo(arr, n, target, dp);
        System.out.println("Subset with given sum exists (memo): " + result);
    }
}
