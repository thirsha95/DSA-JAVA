/*
=========================================
LeetCode 325 - Maximum Size Subarray Sum Equals k
=========================================

Problem:
Given an integer array nums and an integer k,
find the maximum length of a subarray whose
sum is equal to k.

Example:
Input : nums = [1, -1, 5, -2, 3], k = 3
Output: 4

Explanation:
The subarray [1, -1, 5, -2] has sum = 3
and maximum length = 4.

Approach:
- Use Prefix Sum + HashMap.
- Store first occurrence of each prefix sum.
- If (currentPrefixSum - k) exists,
  a subarray with sum k is found.
- Calculate maximum length.

Time Complexity : O(n)
Space Complexity: O(n)
=========================================
*/

import java.util.*;
public class MaximumSizeSubarraySumEqualsK {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
       //logic
       HashMap<Integer,Integer> map = new HashMap<>();
       map.put(0,-1);
       int prefixsum =0;
       int maxlength=0;
       for(int i=0; i<arr.length; i++){
        prefixsum += arr[i];
        if(map.containsKey(prefixsum-k)){
            maxlength = Math.max(maxlength,i-map.get(prefixsum-k));
        }
     //we always keep the first occurrence of each prefix sum, which gives the maximum possible subarray length.
        if (!map.containsKey(prefixsum)) {
                map.put(prefixsum, i);
             }
    }
       System.out.print(maxlength);
    }
}
