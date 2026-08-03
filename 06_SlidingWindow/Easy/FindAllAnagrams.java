/*
 * Problem:
 * Find all starting indices of anagrams of a pattern string in a given string.
 *
 * Pattern:
 * Sliding Window (Fixed Size) + HashMap
 *
 * Key Idea:
 * - We need to find windows having the same character frequency as the pattern.
 * - Since order does not matter in an anagram, we compare character counts.
 * - Use HashMap to store frequency of characters.
 *
 * Approach:
 * - Create a HashMap for the pattern frequency.
 * - Create another HashMap for the current window frequency.
 * - Use two pointers (i and j) to maintain a fixed window.
 * - Window size = pattern length.
 * - Add characters using j pointer.
 * - When window size becomes equal to k:
 *      - Compare patternMap and windowMap.
 *      - If both are equal, store the starting index i.
 *      - Remove the outgoing character arr[i] from windowMap.
 *      - Slide the window by increasing i and j.
 *
 * Algorithm:
 * 1. Initialize i = 0 and j = 0.
 * 2. Store frequency of all characters in patternMap.
 * 3. Traverse string using j.
 * 4. Add current character into windowMap.
 * 5. If window size < k:
 *      - Increase j.
 * 6. If window size == k:
 *      - Check if both frequency maps are equal.
 *      - Add index i if anagram is found.
 *      - Remove character at i from windowMap.
 *      - Move window: i++ and j++.
 *
 * Sample Input:
 * s = "cbaebabacd"
 * p = "abc"
 *
 * Sample Output:
 * [0, 6]
 *
 * Example:
 * Window = "cba"
 * Pattern = "abc"
 *
 * Frequency:
 * a -> 1
 * b -> 1
 * c -> 1
 *
 * Both are same, so it is an anagram.
 *
 * Time Complexity:
 * O(n)
 *
 * Space Complexity:
 * O(k)
 */
import java.util.*;
public class FindAllAnagrams {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String pattern = sc.nextLine();

        int k = pattern.length();
        HashMap<Character,Integer> patternmap = new HashMap<>();
        HashMap<Character,Integer> windowmap = new HashMap<>();
        
        for(int i=0; i<k; i++){
            char ch = pattern.charAt(i);
            patternmap.put(ch, patternmap.getOrDefault(ch,0)+1);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        int i= 0;
        // int j=0;

        // while(j < str.length()){
             for(int j = 0; j < str.length(); j++){
                char ch = str.charAt(j);
             windowmap.put(ch, windowmap.getOrDefault(ch,0)+1);

            // if(j-i+1 < k){
            //     j++;
            // } 
            //elseif
             if(j-i+1 ==k){
                if(patternmap.equals(windowmap)){
                    ans.add(i);
                }
                char removechar = str.charAt(i); 
 
                windowmap.put(removechar , windowmap.getOrDefault(removechar,0)-1);
                if(windowmap.get(removechar)==0){
                    windowmap.remove(removechar);
                }
                i++;
                // j++;
            }
        }
         System.out.print(ans);
    }
}
