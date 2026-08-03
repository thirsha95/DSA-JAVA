/*
 * Folder:
 * Strings/Medium
 *
 * File Name:
 * RomanToInteger.java
 *
 * Problem:
 * Roman to Integer
 *
 * Description:
 * Convert a Roman numeral string into its integer value.
 *
 * Pattern:
 * Reverse Traversal + HashMap
 *
 * Approach:
 * - Store Roman symbols and their values using HashMap.
 * - Traverse the string from right to left.
 * - Compare current value with the previous (right side) value.
 * - If current value is smaller, subtract it.
 * - Otherwise, add it.
 *
 * Key Idea:
 * Small value before a bigger value means subtraction.
 * While scanning from right to left:
 * curr < prev  → subtract
 * curr >= prev → add
 *
 * Example:
 * Input:
 * MCMIV
 *
 * Output:
 * 1904
 *
 * Time Complexity:
 * O(n)
 *
 * Space Complexity:
 * O(1)
 */
package Strings.Medium;

import java.util.*;
public class RomanToInteger {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
         
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D', 500);
        map.put('M',1000);

       int result = 0;
       int prev = 0;
       for(int i=str.length()-1; i>=0; i--){
        int curr = map.get(str.charAt(i));
        if(curr < prev ){
            result -= curr;
        }
        else{
           result += curr;
        }
        prev = curr;
       }
      System.out.println(result);
    }
}
