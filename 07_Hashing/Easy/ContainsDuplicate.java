/*
 * Folder:
 * Hashing/Easy
 *
 * File Name:
 * ContainsDuplicate.java
 *
 * Problem:
 * Contains Duplicate (LeetCode 217)
 *
 * Pattern:
 * HashSet
 *
 * Problem Statement:
 * Given an integer array nums,
 * return true if any value appears at least twice.
 * Return false if every element is distinct.
 *
 * Sample Input:
 * 5
 * 1 2 3 1 5
 *
 * Sample Output:
 * true
 *
 * Sample Input:
 * 5
 * 1 2 3 4 5
 *
 * Sample Output:
 * false
 *
 * Approach:
 * - Traverse the array.
 * - Before inserting an element into the HashSet,
 *   check if it already exists.
 * - If it exists, return true.
 * - Otherwise, insert it.
 * - If the loop finishes, return false.
 *
 * Key Idea:
 * HashSet stores only unique elements.
 * If an element is already present, it is a duplicate.
 *
 * Time Complexity:
 * O(n)
 *
 * Space Complexity:
 * O(n)
 */
import java.util.*;

public class ContainsDuplicate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
          for(int i=0; i<n; i++){
            if(set.contains(arr[i])){
                System.out.print("TRUE");
                return ;
            }
            set.add(arr[i]);
          }
          System.out.print("FALSE");

        sc.close();
    }
}