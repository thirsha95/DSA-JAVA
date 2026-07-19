/*
===========================================================
Problem: Remove Element
Platform: LeetCode 27
Difficulty: Easy
Pattern: Two Pointers (Read Pointer + Write Pointer)

Description:
Given an integer array nums and an integer val, remove all
occurrences of val in-place. The order of the remaining
elements may be changed. Return the number of elements that
are not equal to val.

Approach:
1. Use two pointers:
   - i : Reads every element.
   - k : Writes the next valid element.
2. Traverse the array.
3. If nums[i] != val:
      nums[k] = nums[i];
      k++;
4. Return k.

Time Complexity : O(n)
Space Complexity: O(1)

Key Learning:
- In-place array modification
- Read Pointer + Write Pointer technique
- Foundation for Move Zeroes, Remove Duplicates,
  Merge Sorted Array, Partition Array

===========================================================
*/

import java.util.*;
public class RemoveElement {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
      }
      int val = sc.nextInt();

      int k=0;
      for(int i=0; i<n; i++){
       if(arr[i] != val){
        arr[k]=arr[i];
        k++;
       }
      }
      for(int i=0; i<k ; i++){
      System.out.print(arr[i] + " ");
      }
      
    }
}
