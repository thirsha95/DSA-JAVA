/*
 * File Name: TwoSum.java
 *
 * Problem:
 * Two Sum (LeetCode 1)
 *
 * Pattern:
 * HashMap (Value → Index)
 *
 * Problem Statement:
 * Given an integer array nums and an integer target,
 * return the indices of the two numbers such that
 * they add up to the target.
 *
 * You may assume exactly one solution exists,
 * and you may not use the same element twice.
 *
 * Sample Input:
 * nums = [2, 7, 11, 15]
 * target = 9
 *
 * Sample Output:
 * [0, 1]
 *
 * Approach:
 * - Traverse the array once.
 * - For each number, calculate:
 *      complement = target - current number
 * - Check if complement already exists in HashMap.
 * - If yes, return its index and current index.
 * - Otherwise, store:
 *      current number → current index
 *
 * Key Idea:
 * Instead of searching the entire array again,
 * remember previously visited numbers in a HashMap.
 *
 * Time Complexity:
 * O(n)
 *
 * Space Complexity:
 * O(n)
 */

import java.util.*;
public class TwoSum {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n ; i++){
     arr[i]=sc.nextInt();    
    }
    int target = sc.nextInt();

    HashMap <Integer, Integer> map = new HashMap<>();
    for(int i=0; i<n; i++){
        int complement = target - arr[i];
        if(map.containsKey(complement)){
           System.out.print(map.get(complement) + " " + i); 
           return ;
        }
        map.put(arr[i],i);
    }
     System.out.print("No Pair Found");
    }
}
