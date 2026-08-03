/*
 * Problem:
 * Max Consecutive Ones III
 *
 * Pattern:
 * Variable Sliding Window
 *
 * Difficulty:
 * Medium
 *
 * Sample Input:
 * n = 11
 * arr = [1,1,1,0,0,0,1,1,1,1,0]
 * k = 2
 *
 * Sample Output:
 * 6
 *
 * Explanation:
 * We can flip at most k zeros into ones.
 * Find the maximum length of a contiguous subarray
 * containing at most k zeros.
 *
 * Approach:
 * - Use two pointers (i and j) to maintain a sliding window.
 * - Expand the window by moving j.
 * - Count the number of zeros inside the current window.
 * - If zeroCount becomes greater than k, shrink the window
 *   from the left until it becomes valid again.
 * - Every valid window is a possible answer, so update
 *   the maximum window length.
 *
 * Algorithm Flow:
 * 1. Initialize:
 *      i = 0
 *      zeroCount = 0
 *      maxLength = 0
 *
 * 2. Move j from 0 to n-1.
 *
 * 3. If arr[j] == 0:
 *      Increment zeroCount.
 *
 * 4. While zeroCount > k:
 *      - If arr[i] == 0:
 *            Decrement zeroCount.
 *      - Increment i.
 *
 * 5. Once the window becomes valid:
 *      - Calculate window length.
 *      - Update maximum length.
 *
 * 6. Print maximum length.
 *
 * Key Idea:
 * - Window is valid when zeroCount <= k.
 * - j expands the window.
 * - i shrinks the invalid window.
 *
 * Time Complexity:
 * O(n)
 *
 * Space Complexity:
 * O(1)
 */

import java.util.*;

public class MaxConsecutiveOnesIII {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int index = 0; index < n; index++) {
            arr[index] = sc.nextInt();
        }
        int k = sc.nextInt();  // Maximum zeros that can be flipped
      
        int i = 0;
        int zeroCount = 0;
        int maxLength = 0;

        // Expand the window
        for (int j = 0; j < n; j++) {
            // Add current element
            if (arr[j] == 0) {
                zeroCount++;
            }
            // Shrink the window if invalid
            while (zeroCount > k) {//replaceable zeroes graeter than replaceable valuel
                if (arr[i] == 0) {
                    zeroCount--;
                }
                i++;
            }
            // Update maximum valid window length
            maxLength = Math.max(maxLength, j - i + 1);
        }

        System.out.println(maxLength);

        sc.close();
    }
}