/*
 * LeetCode 977 - Squares of a Sorted Array
 *
 * Problem:
 * Given a sorted integer array nums in non-decreasing order,
 * return an array of the squares of each number,
 * also sorted in non-decreasing order.
 *
 * Example:
 * Input : [-4, -1, 0, 3, 10]
 * Output: [0, 1, 9, 16, 100]
 *
 * Approach (Two Pointers):
 * 1. Create a result array of the same size.
 * 2. Initialize two pointers:
 *      - left = 0
 *      - right = n - 1
 * 3. Compare the squares of the left and right elements.
 * 4. Place the larger square at the end of the result array.
 * 5. Move the corresponding pointer.
 * 6. Continue until left > right.
 * 7. Return the result array.
 *
 * Intuition:
 * The largest square always comes from either the
 * leftmost (most negative) or rightmost (largest positive)
 * element, so compare both ends and fill the answer
 * from right to left.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 * 
 *  Interview Tip:
 * Before writing a two-pointer loop, ask:
 *
 * "When left == right, is there still one element to process?"
 *
 * Yes -> while (left <= right)
 * No  -> while (left < right)
 *
 * Rule:
 * Process every element- (<= ) while (left <= right)
 * Compare/swapping pairs- (<)  while (left < right)
  */ 

import java.util.*;
public class SquaresOfSortedArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        int[] res = new int[n];
        int left = 0;
        int right = n-1;
        int index = n-1;   // Fill the result array from the last index.
        while(left <= right){
          int  leftsq = arr[left] * arr[left];
          int  rightsq = arr[right] * arr[right];
          if(leftsq > rightsq ){// sort in ascending we start from last. largest sqaure either comes from left or right
            res[index]=leftsq;
            left++;
           // index--; --> moving the res arr by point by  point
          } else{
             res[index]=rightsq;
             right--;
           // index--;
          }
          index--;  // Move to the backwards position in the result array.
        }
        for(int i=0; i<n; i++){
           System.out.print(res[i]+" ");
        }

    }
}
