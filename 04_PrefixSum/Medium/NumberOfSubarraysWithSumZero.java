/*
===========================================================
  NUMBER OF SUBARRAYS WITH SUM 0
===========================================================

Question:
Given an integer array, find the number of subarrays
whose sum is exactly 0.

Pattern:
Prefix Sum + HashMap

Example:
arr = [1, -1, 2, -2]

Output:
3

Zero-sum subarrays:
[1, -1]  -> 0
[2, -2]  -> 0

Key Idea:
If the same prefix sum occurs more than once,
the elements between those positions have sum = 0.

If the same prefix sum appears twice, the elements between those two positions add up to zero.
 This is exactly what we are looking for 
 
Example Prefix Sums:
[1, -1, 2, -2]
  ↓
[1,  0, 2,  0]

Prefix sum 0 occurs twice,
so one zero-sum subarray exists between them.

Time Complexity:  O(n)
Space Complexity: O(n)
===========================================================
*/
import java.util.*;
public class NumberOfSubarraysWithSumZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        HashMap <Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        int prefixsum = 0;
        int count = 0;

        for(int i=0; i<n; i++){
           prefixsum += arr[i];
        

        if(map.containsKey(prefixsum)){
            count += map.get(prefixsum);
        }
        
        map.put(prefixsum , map.getOrDefault(prefixsum,0)+1);

    }
        System.out.print(count);
 }
}
