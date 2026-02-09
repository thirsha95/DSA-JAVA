/*
Problem: Subarray Sum Equals K
Platform: LeetCode
Topic: Arrays, HashMap, Prefix Sum
Difficulty: Medium

Approach:
- Use Prefix Sum technique with a HashMap
- Maintain a running sum while traversing the array
- If (currentPrefixSum - k) exists in the map,
  then a subarray with sum k is found
- Store frequency of each prefix sum in the map

Time Complexity: O(n)
Space Complexity: O(n)
*/
package arrays;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public static void main(String[] args){
        int[] nums = {1,1,1};
        int k = 2;
        int res = subarr(nums,k);
        System.out.println(res);

    } 
  public static int subarr(int[] nums, int k ){
    HashMap<Integer,Integer> map = new HashMap<>();
    map.put(0,1);
    int count = 0;
    int currentsum=0;
    for(int i=0; i< nums.length; i++){
        currentsum+=nums[i];
        if(map.containsKey(currentsum-k)){
                count+= map.get(currentsum-k);
        }
           map.put(currentsum ,map.getOrDefault(currentsum,0)+1);
    }
    return count;
  }
}
