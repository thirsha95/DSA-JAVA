/*
 * Problem:
 * Minimum Size Subarray Sum
 *
 * Pattern:
 * Variable Sliding Window + Running Sum
 *
 * Difficulty:
 * Medium
 *
 * Sample Input:
 * Target = 7
 * Array = [2,3,1,2,4,3]
 *
 * Sample Output:
 * 2
 *
 * Explanation:
 * The smallest contiguous subarray whose sum is greater than
 * or equal to target 7 is [4,3].
 * Its length is 2.
 *
 * Approach:
 * - Use two pointers (i and j) to maintain a sliding window.
 * - Move j forward and add elements to the current sum.
 * - When the sum becomes greater than or equal to target,
 *   shrink the window from the left using i.
 * - Update the minimum window length while shrinking.
 *
 * Algorithm Flow:
 * 1. Initialize:
 *      i = 0
 *      sum = 0
 *      minLength = Integer.MAX_VALUE
 *
 * 2. Move j from 0 to n-1:
 *      Add arr[j] to sum.
 *
 * 3. If sum >= target:
 *      - Calculate current window length:
 *            j - i + 1
 *      - Update minimum length.
 *      - Remove arr[i] from sum.
 *      - Increment i.
 *
 * 4. Repeat until j reaches the end.
 *
 * 5. If no valid window exists, return 0.
 *
 * Key Idea:
 * - j expands the window to increase the sum.
 * - i shrinks the window to find the smallest valid window.
 * - Since all numbers are positive, shrinking reduces the sum.
 *
 * Time Complexity:
 * O(n)
 *
 * Space Complexity:
 * O(1)
 */

import java.util.*;
public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        int i = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int j = 0; j < n; j++) {
            sum += arr[j];
            while(sum >= target) {
                min = Math.min(min, j - i + 1);
                sum -= arr[i];
                i++;
            }
        }
       System.out.print(min);

    }
}