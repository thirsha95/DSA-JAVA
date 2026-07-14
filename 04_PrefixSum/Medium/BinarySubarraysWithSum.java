/*
 * LeetCode 930: Binary Subarrays With Sum
 *
 * Pattern: Prefix Sum + HashMap
 * Description:
 * Given a binary array nums and an integer goal, return the number
 * of non-empty subarrays whose sum is exactly equal to goal.
 *
 * * Sample Input 1:
 * nums = [1,0,1,0,1]
 * goal = 2
 *
 * * Sample  Output 2 :
 * 4
 * Sample Input 2
  5
  0 0 0 0 0
  0
  Sample Output 2
  15
 *
 * Intuition:
 * - Calculate the running prefix sum.
 * - If (currentPrefixSum - goal) exists in the HashMap,
 *   then a subarray with sum = goal ends at the current index.
 * - Store the frequency of each prefix sum in the HashMap.
 *
 * Formula:
 * currentPrefixSum - previousPrefixSum = goal
 * previousPrefixSum = currentPrefixSum - goal
 *
 * Note:
 * - This approach works for any integer array.
 * - Sliding Window is an O(1) space optimization for binary arrays (0s and 1s).
 *
 *  HashMap
 *  Time Complexity:  : O(n)
 *  Space Complexity:: O(n)
 *
 * Sliding Window
 *  Time Complexity: : O(n)
 *  Space Complexity: : O(1)
 *
 * 
 */
import java.util.*;
public class BinarySubarraysWithSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        } 
        int goal = sc.nextInt();

        //logic
        int prefixsum =0;
        int count =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0; i<nums.length; i++){
            prefixsum += nums[i];
            if(map.containsKey(prefixsum-goal)){
                count+=map.get(prefixsum-goal);
            }
            map.put(prefixsum, map.getOrDefault(prefixsum,0)+1);
        }
        System.out.println(count);

    }
}
