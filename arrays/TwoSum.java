/*
Problem: Two Sum
Platform: LeetCode
Topic: Hashing / Array
Approach:
- Use a HashMap to store numbers and their indices
- For each number, check if (target - current number) exists in the map
- If yes, return indices;  else, add current number to map
Time Complexity: O(n)
Space Complexity: O(n)
*/

package arrays;
import java.util.*; 
public class TwoSum {
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] res = toosum(nums,target);
        System.out.println(Arrays.toString(res));

    }
    public  static int[] toosum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement = target-nums[i];
            if(map.containsKey(complement)){
            return new int[]{map.get(complement),i} ;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return new int[]{};

    }
}
