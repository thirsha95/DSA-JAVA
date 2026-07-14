/*
 * LeetCode 125: Valid Palindrome
 *
 * Pattern: Two Pointers
 *
 * 
 * Problem Description:
 * - A phrase is a palindrome if, after converting all uppercase letters to lowercase
 *   and removing all non-alphanumeric characters, it reads the same forward and backward.
 * - Alphanumeric characters include letters (A-Z, a-z) and digits (0-9).
 * - Given a string s, return true if it is a palindrome; otherwise, return false.
 *
 * Input:
 * - String s
 *
 * Output:
 * - boolean
 *   - true  -> if the cleaned string is a palindrome
 *   - false -> otherwise
 *
 * Intuition:
 * - Build a new string containing only lowercase letters and digits.
 * - Use two pointers to compare characters from both ends.
 * - If any pair doesn't match, return false.
 * - Otherwise, return true.
 *
 * Algorithm:
 * 1. Traverse the string.
 * 2. Keep only letters and digits.
 * 3. Convert letters to lowercase and append to StringBuilder.
 * 4. Initialize two pointers: left = 0, right = sb.length() - 1.
 * 5. Compare characters from both ends.
 * 6. If a mismatch is found, return false.
 * 7. If all characters match, return true.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

import java.util.*;
public class ValidPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        for(char i : str.toCharArray()) {
            if(Character.isLetter(i)|| Character.isDigit(i)){
                  sb.append(Character.toLowerCase(i));
            }
        }

        int left=0;
        int right =sb.length()-1;
        while(left<right){
            if(sb.charAt(left) != sb.charAt(right)){
                System.out.print("false");
                return;
            }
            left++;
            right--;
        }
            System.out.print("true");  

    }
}
