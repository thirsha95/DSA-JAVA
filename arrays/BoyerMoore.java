
/*
Problem: Majority Element (Boyer-Moore Voting Algorithm)
Platform: LeetCode
Topic: Array / Voting Algorithm / Greedy
Approach:
- Initialize candidate and count
- Iterate through array:
    - If count is 0, set candidate to current element
    - If element == candidate, increment count
    - Else decrement count
- Candidate at the end is the majority element (appears > n/2 times)
*/

package arrays;

public class BoyerMoore {
    public static void main (String[] args){
    int[] nums = {2,2,1,1,1,2,2};
    int res =  majorityelement(nums);
    System.out.println(res);

    }
public static int majorityelement(int[] nums){
   int candidate = 0;
   int count =0;
   for(int num : nums){
    if(count==0){
      candidate = num;
    }
    if(num==candidate){
        count++;
        }
    else{
       count--;
    }
    }
    return candidate;
   }

}







