/*
Problem:
Given an array of integers and an integer k,
find the maximum sum of any contiguous subarray of size k.

Example:
Input:
arr = [2,1,5,1,3,2]
k = 3

Output:
9

Explanation:
Subarray [5,1,3] has maximum sum = 9.

Approach (Fixed Sliding Window):
1. Calculate sum of first k elements.
2. Store it as maximum sum.
3. Slide the window:
      Remove left element.
      Add new right element.
4. Update maximum.

Time Complexity : O(n)
Space Complexity: O(1)

Pattern:
Sliding Window (Fixed Size)

Learned:
✔ Fixed Window Template
✔ Add new element
✔ Remove old element
✔ Keep window size fixed
✔ Update answer while sliding
*/
import java.util.*;
public class MaximumSumSubarrayOfSizeK {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n =  sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
    }
    int k = sc.nextInt();

    int windowsum =0;
    for(int i=0; i<k; i++){
     windowsum += arr[i];
    }
    int maxwindow = windowsum;
    for(int j=k; j<n; j++){
        windowsum += arr[j];
        windowsum -=arr[j-k];
        maxwindow = Math.max(maxwindow , windowsum);
    }
    System.out.print(maxwindow);

}
}
