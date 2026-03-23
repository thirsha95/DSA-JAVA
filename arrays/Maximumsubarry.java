
/*
Problem: Maximum Subarray Sum
Algorithm: Kadane's Algorithm
Time Complexity: O(n)
Space Complexity: O(1)

Example:
Input: [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Subarray: [4,-1,2,1]
*/

package arrays;

public class Maximumsubarry {
  
public static void main(String[]args){
    int[] arr ={ -2,1,-3,4,-1,2,1,-5,4};
    int res = maxisum(arr);
    System.out.println(res);



}

public static int maxisum(int[] nums){
  int maximumsum = nums[0];
  int currentsum = 0;

  for( int num : nums){
    if(currentsum < 0 ){
        currentsum = 0;
    }
    currentsum += num;


    if( currentsum > maximumsum){
      maximumsum = currentsum;
  }

  }

  return maximumsum;
}

    
}
