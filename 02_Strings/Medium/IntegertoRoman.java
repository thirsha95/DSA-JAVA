/*
 * Problem:
 * Integer to Roman
 *
 * Pattern:
 * Greedy Algorithm
 *
 * Approach:
 * - Store Roman values in decreasing order.
 * - Always choose the largest value that can fit in the given number.
 * - Append the corresponding Roman symbol.
 * - Subtract that value and continue until number becomes 0.
 *
 * Key Idea:
 * Take the biggest possible Roman symbol first.
 *
 * Example:
 * Input:
 * 58
 *
 * Output:
 * LVIII
 *
 * Time Complexity:
 * O(1)
 *
 * Space Complexity:
 * O(1)
 */

package Strings.Medium;

import java.util.*;

public class IntegerToRoman {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] values = {
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4, 1
        };

        String[] symbols = {
            "M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV", "I"
        };

        StringBuilder result = new StringBuilder();

        // Start from biggest Roman value
        for (int i = 0; i < values.length; i++) {

            // Use same symbol while value can be subtracted
            while (num >= values[i]) {

                result.append(symbols[i]);

                num = num - values[i];
            }
        }

        System.out.println(result.toString());

        sc.close();
    }
}