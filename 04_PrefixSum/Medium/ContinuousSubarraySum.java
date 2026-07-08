/*
 * LeetCode 523 - Continuous Subarray Sum
 *
 * Sample Input:
 * nums = [23, 2, 4, 6, 7]
 * k = 6
 *
 * Sample Output:
 * true
 *
 * Algorithm:
 * 1. Create a HashMap (remainder → first index).
 * 2. Store (0, -1) to handle subarrays starting at index 0.
 * 3. Traverse the array and calculate the prefix sum.
 * 4. Compute remainder = prefixSum % k.
 * 5. If the remainder is new, store its first index.
 * 6. If the remainder already exists and the distance between indices is at least 2,
 *    return true.
 * 7. If no valid subarray is found, return false.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(min(n, k))
 */

import java.util.*;

public class ContinuousSubarraySum {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int [n];
    int k = sc.nextInt();
    for(int i=0; i<nums.length; i++){
        nums[i]= sc.nextInt();
    }
    //logic for continous subarray which is multiple of k and has length of >=2
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put (0,-1);
   int prefixsum=0;
   boolean result = false;

   for(int i=0; i<nums.length; i++){
    prefixsum += nums[i];
    int remainder = prefixsum % k;
    if(map.containsKey(remainder)){
        if(i - map.get(remainder)>=2){
            result = true;
        }
    }
    else{
      map.put(remainder,i);
    }
}
  System.out.print(result);


    }
}
