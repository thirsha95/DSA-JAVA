/*
 * Problem:
 * Longest Repeating Character Replacement
 *
 * Pattern:
 * Variable Sliding Window + HashMap
 *
 * Difficulty:
 * Medium
 *
 * Sample Input:
 * ABAB
 * 2
 *
 * Sample Output:
 * 4
 *
 * Explanation:
 * You can replace at most k characters.
 * Find the length of the longest substring that can
 * be converted into a string of the same character.
 *
 * Example:
 * "ABAB", k = 2
 *
 * Replace both 'A's with 'B's (or both 'B's with 'A's):
 *
 * ABAB
 * ↓ ↓
 * BBBB
 *
 * Longest valid substring length = 4.
 *
 * Program Description:
 * Read a string and an integer k.
 * Find the length of the longest substring that can be
 * converted into a substring containing only one repeating
 * character by replacing at most k characters.
 *
 * Approach:
 * - Use two pointers (i and j) to maintain a sliding window.
 * - Expand the window by moving j.
 * - Store the frequency of each character using a HashMap.
 * - Track the frequency of the most frequent character
 *   inside the current window.
 * - Calculate how many characters need replacement.
 * - If replacements required become greater than k,
 *   shrink the window from the left.
 * - Update the maximum valid window length.
 *
 * Algorithm Flow:
 * 1. Initialize:
 *      i = 0
 *      maxLength = 0
 *      maxFrequency = 0
 *
 * 2. Move j from 0 to n-1.
 *
 * 3. Add s[j] into the HashMap.
 *
 * 4. Update maxFrequency.
 *
 * 5. Calculate:
 *      Window Length = j - i + 1
 *      Replacements Needed =  Window Length - maxFrequency
 *
 * 6. While replacementsNeeded > k:
 *      - Remove s[i] from HashMap.
 *      - If frequency becomes 0, remove it from HashMap.
 *      - Increment i.
 *
 * 7. Once the window becomes valid:
 *      - Update maximum length.
 *
 * Key Idea:
 * - Window is valid when:
 *
 *      Window Length - maxFrequency <= k
 *
 * - j expands the window.
 * - i shrinks the invalid window.
 * - Update the answer only after the window becomes valid.
 *
 * Time Complexity:
 * O(n)
 *
 * Space Complexity:
 * O(26) ≈ O(1)
 */


// maxfreq = count of the most frequent (same) character in the current window.
// All other characters must be replaced to make the entire window the same.

import java.util.*;

public class LongestRepeatingCharacterReplacement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int k = sc.nextInt();

        int i = 0;
        int max = 0;
        int maxfreq = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            maxfreq = Math.max(maxfreq, map.get(ch));

            // Shrink the window if it becomes invalid
            while ((j - i + 1) - maxfreq > k) {//window size - most frequent count; Keep the most frequent character :// If replacements > k, shrink the window.
                char removechar = str.charAt(i);
                map.put(removechar, map.get(removechar) - 1);

                if (map.get(removechar) == 0) {
                    map.remove(removechar);
                }

                i++;
            }

            // Update maximum valid window length
            max = Math.max(max, j - i + 1);
        }

        System.out.println(max);

        sc.close();
    }
}
// Example:
// str = "ABA"
// k = 1

// i = 0

// --------------------
// j = 0
// Window = "A"
// map = {A=1}
// maxfreq = 1
// (1 - 1) = 0 <= 1 ✅ Valid
// max = 1

// --------------------
// j = 1
// Window = "AB"
// map = {A=1, B=1}
// maxfreq = 1
// (2 - 1) = 1 <= 1 ✅ Valid
// max = 2

// --------------------
// j = 2
// Window = "ABA"
// map = {A=2, B=1}
// maxfreq = 2
// (3 - 2) = 1 <= 1 ✅ Valid
// max = 3

// Answer = 3
//-------------------------------------------
//str = "ABC"
//k = 0 
//j = 0
// Window = "A"
// Valid
// max = 1

// j = 1
// Window = "AB"
// 2 - 1 = 1 > 0 ❌ Invalid

// Remove 'A'
// Window = "B"

// max = Math.max(1,1) = 1

// j = 2
// Window = "BC"
// 2 - 1 = 1 > 0 ❌ Invalid

// Remove 'B'
// Window = "C"

// max = Math.max(1,1) = 1