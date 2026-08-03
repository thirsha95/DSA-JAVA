/*
 * Problem:
 * Longest Substring Without Repeating Characters
 *
 * Pattern:
 * Variable Sliding Window + HashMap
 *
 * Difficulty:
 * Medium
 *
 * Sample Input:
 * abcb
 *
 * Sample Output:
 * 3
 *
 * Explanation:
 * The longest substring without repeating characters is "abc",
 * which has length 3.
 *
 * Approach:
 * - Use two pointers (i and j) to maintain a sliding window.
 * - Move j forward to expand the window.
 * - Store character frequencies using HashMap.
 * - If duplicate character appears:
 *      - Move i forward.
 *      - Decrease frequency of characters.
 * - Maintain maximum window length.
 *
 * Algorithm Flow:
 * 1. Initialize i = 0 and max = 0.
 * 2. Move j from 0 to n-1.
 * 3. Add current character into HashMap.
 * 4. While duplicate exists:
 *      - Remove character at i.
 *      - Increase i.
 * 5. Calculate window length:
 *      j - i + 1
 * 6. Update maximum length.
 *
 * Key Idea:
 * - j expands the window.
 * - i shrinks the invalid window.
 * - HashMap stores characters present inside window.
 *
 * Time Complexity:
 * O(n)
 *
 * Space Complexity:
 * O(n)
 */

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();

        int i = 0;
        int max = 0;
        for(int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            while(map.get(ch) > 1) { // every time while(invalid condition if ocndition becomes invalid it moves i)
                char removeChar = str.charAt(i);
                map.put(removeChar, map.get(removeChar) - 1);

                if(map.get(removeChar) == 0) {
                    map.remove(removeChar);
                }
                i++;
            }
            max = Math.max(max, j - i + 1);
        }
        System.out.print(max);

    }
}