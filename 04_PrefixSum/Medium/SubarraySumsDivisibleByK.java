/*
=========================================
LeetCode 974 - Subarray Sums Divisible by K
=========================================

Problem:
Return the number of subarrays whose sum is divisible by k.

Example:
Input : nums = [4,5,0,-2,-3,1], k = 5
Output: 7

Approach:
- Use Prefix Sum + HashMap.
- Store (remainder -> frequency).
- If the same remainder appears again, all previous occurrences form valid subarrays.
- Convert negative remainders to positive:
    if (remainder < 0) remainder += k;

Time Complexity : O(n)
Space Complexity: O(min(n, k))
*/

import java.util.*;
public class  SubarraySumsDivisibleByK {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int k = sc.nextInt();
    int[] arr = new int[n];
    for(int i =0; i<arr.length; i++){
        arr[i] = sc.nextInt();
    }
    //logic
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0,1);
    int prefixsum =0;
    int count =0;
    for( int i=0; i<arr.length; i++){
        prefixsum += arr[i];
        int remainder = prefixsum % k;
        if(map.containsKey(remainder)){
            count+= map.get(remainder);
        }
        map.put(remainder,map.getOrDefault(remainder,0)+1);
    }
    System.out.print(count);
}
}
