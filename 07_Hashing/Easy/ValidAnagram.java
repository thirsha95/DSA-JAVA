/*
 * Folder:
 * Hashing/Easy
 *
 * File Name:
 * ValidAnagram.java
 *
 * Problem:
 * Valid Anagram (LeetCode 242)
 *
 * Pattern:
 * HashMap (Frequency Counting)
 *
 * Problem Statement:
 * Given two strings s and t,
 * return true if t is an anagram of s.
 *
 * An anagram means both strings contain the same characters
 * with the same frequency.
 *
 * Sample Input 1:
 * anagram
 * nagaram
 *
 * Sample Output 1:
 * true
 *
 * Sample Input 2:
 * rat
 * car
 *
 * Sample Output 2:
 * false
 *
 * Approach:
 * - Store the frequency of each character in the first string.
 * - Traverse the second string.
 * - Check whether the character exists in the HashMap.
 * - If it exists, decrease its frequency.
 * - If frequency becomes negative, the second string has extra
 *   occurrences of that character.
 * - If all characters balance, both strings are anagrams.
 *
 * Key Idea:
 * HashMap stores:
 *
 * Character -> Frequency
 *
 * Example:
 *
 * s = "aabbc"
 *
 * a -> 2
 * b -> 2
 * c -> 1
 * 
 * 
 * Dry Run:
 *
 * Input:
 * s = "aabb"
 * t = "bbaa"
 *
 * Step 1: Frequency Map of s
 *
 * a -> 2
 * b -> 2
 *
 * Step 2: Traverse t
 *
 * b -> 1
 * b -> 0
 * a -> 1
 * a -> 0
 *
 * All counts become 0
 *
 * Output:
 * true
 * 
 *
 * Time Complexity:
 * O(n)
 *
 * Space Complexity:
 * O(1)
 * (Only lowercase English characters)
 */

import java.util.*;

public class ValidAnagram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Store frequency of s
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        // Step 2: Check t
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(!map.containsKey(ch)){
                System.out.print("false");
                return;
            }
            map.put(ch,map.get(ch)-1);

            if(map.get(ch) < 0){
                System.out.print("false");
                return;
            }

        }
        System.out.print("true");

    }
}