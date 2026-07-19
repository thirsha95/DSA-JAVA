/*
=========================================================
LeetCode 167 - Two Sum II (Input Array Is Sorted)
=========================================================

Problem:
Given a 1-indexed sorted array of integers "numbers"
and a target value, find two numbers such that they
add up to the target.

Return the indices (1-based indexing).

You must use only constant extra space.

Example:

Input:
numbers = [2,7,11,15]
target = 9

Output:
[1,2]

Explanation:
numbers[0] + numbers[1] = 2 + 7 = 9

---------------------------------------------------------
Pattern:
Two Pointers (Opposite Ends)

---------------------------------------------------------
Approach:

Since the array is already sorted,

1. Place one pointer at the beginning.
2. Place another pointer at the end.

While left < right:

If current sum == target
    return answer

If current sum < target
    move left++

If current sum > target
    move right--

---------------------------------------------------------
Time Complexity:
O(n)

Space Complexity:
O(1)

=========================================================
// Since the array is sorted,
// left points to the smaller value and right points to the larger value.

// LeetCode 1: Unsorted array → Use HashMap.
// LeetCode 167: Sorted array → Use Two Pointers.
*/
import java.util.*;
public class TwoSumII {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
    }
    int target = sc.nextInt();

    int left = 0;
    int right = n-1;
    while(left < right){
      int  currentsum = arr[left] + arr[right];
      if(currentsum == target) {
       System.out.print(left+ "  " + right);
       break ;
      }
      else if(currentsum > target ){
        right--;
      }
        else{
            left++;
        }
    }
    }
}
