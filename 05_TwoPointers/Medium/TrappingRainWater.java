/*
=========================================================
LeetCode 42 - Trapping Rain Water
=========================================================

Problem:
Given n non-negative integers representing an elevation map,
compute how much water it can trap after raining.

the water formula:
water = min(leftMax, rightMax) - height[i]

Example:

Input:
[4,2,0,3,2,5]

Output:
9


Approach:
Two Pointer

Logic:
- Maintain max height from left side and right side.
- Smaller height side decides water level.
- If current height is greater than max boundary,
  update boundary.
- Otherwise, store trapped water.

=========================================================

Water at each index:
water = min(leftMax, rightMax) - height[i]

In two pointer approach:
- If left height is smaller, left side water is calculated.
- If right height is smaller, right side water is calculated.

Time Complexity: O(n)
Space Complexity: O(1)

=========================================================
*/

import java.util.*;
public class TrappingRainWater {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] height = new int[n];
       for(int i=0; i<n; i++){
        height[i] =sc.nextInt();
     }
     int left =0;
     int right=n-1;
     int leftmax=0;
     int rightmax=0;
     int water =0;

    while(left < right){

        if(height[left] < height[right]){
            if(height[left] > leftmax){
                leftmax= height[left];
            }else{
                water += leftmax - height[left];
            }
              left++;
        }else{
            if(height[right] > rightmax){
                rightmax = height[right];
            }else{
                water += rightmax - height[right];
            }
            right--;
        }
    }
    System.out.print(water);


}
}
