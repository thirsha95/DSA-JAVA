/* 
========================================================= 
LeetCode 11 - Container With Most Water
========================================================= 
 
Pattern: 
Two Pointers 
 
Problem: 
Given an integer array height, where height[i] represents 
the height of a vertical line, find two lines that form a 
container that holds the maximum amount of water.
 
--------------------------------------------------------- 
Input:
 
An integer array:
 
height = [1,8,6,2,5,4,8,3,7]
 
Each value represents the height of a vertical line.
 
--------------------------------------------------------- 
Output:
 
Return the maximum amount of water that can be contained.
 
Output:
49
 
Explanation:
 
Choose height[1] = 8 and height[8] = 7
 
Width = 8 - 1 = 7
Minimum height = min(8,7) = 7
 
Area = width × minimum height
     = 7 × 7
     = 49
 
--------------------------------------------------------- 
Approach:
 
1. Start with two pointers:
      left = 0
      right = n - 1
 
2. Calculate width:
      width = right - left
 
3. Find the smaller height:
      min(height[left], height[right])
 
4. Calculate area:
      area = width × minimum height
 
5. Update maximum area.
 
6. Move the pointer with the smaller height:
 
      if(height[left] < height[right])
          left++;
      else
          right--;
 
7. Continue until:
      left < right
 
--------------------------------------------------------- 
Formula:
 
Area = (right - left) × min(height[left], height[right])
 
--------------------------------------------------------- 
Why move the smaller height?
 
The smaller height limits the water.
Moving the taller pointer makes the width smaller,
but the smaller height is still the limiting factor.
 
So we move the smaller-height pointer hoping to find
a taller line.
 
--------------------------------------------------------- 
Loop Boundary:
 
while(left < right)
 
We need two different lines to form a container.
When left == right, there is no width left.
 
--------------------------------------------------------- 
Time Complexity:
 
O(n)
 
Each pointer moves only toward the other pointer.
 
Space Complexity:
 
O(1)
 
========================================================= 
*/
import java.util.*;
public class ContainerWithMostWater {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int[] height = new int[n];
    for(int i=0; i<n; i++){
        height[i] =sc.nextInt();
    }
    
    int left = 0;
    int right = n-1;
    int maxarea = 0;
    while(left < right){
    int width = right - left ;
    int minheight = Math.min(height[left],height[right]);
    int area = width * minheight;
     maxarea = Math.max(area,maxarea);

        if(height[left] < height[right]){
            left++;
        }else{
            right--;
        }
    }
    System.out.print(maxarea);
    }
}
