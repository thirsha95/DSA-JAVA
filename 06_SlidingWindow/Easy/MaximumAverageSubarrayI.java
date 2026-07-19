/*
Problem:
Given an integer array nums and an integer k,
find the maximum average value of any contiguous subarray of size k.

Example:
Input:
nums = [1,12,-5,-6,50,3]
k = 4

Output:
12.75

Explanation:
Subarray [12,-5,-6,50] has the maximum average = 12.75.

Sample Input:
6
1 12 -5 -6 50 3
4

Sample Output:
12.75

Approach (Fixed Sliding Window):
1. Calculate the sum of the first k elements.
2. Store it as the maximum window sum.
3. Slide the window:
      Add the new element.
      Remove the old element.
4. Update the maximum window sum.
5. Print the maximum average.

Time Complexity : O(n)
Space Complexity: O(1)

Pattern:
Sliding Window (Fixed Size)

Learned:
✔ Maintain maximum window sum
✔ Convert maximum sum to average
✔ Single pass through the array
*/

import java.util.*;
public class MaximumAverageSubarrayI {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
    }
    int k = sc.nextInt();

     int windowsum = 0;
     for(int i=0; i<k; i++){
        windowsum += arr[i];
     }
      double maxaverage = (double)windowsum / k;
     for(int j=k; j<n; j++){
        windowsum += arr[j];
        windowsum -= arr[j-k];
        double  average = (double)windowsum / k ;
        maxaverage = Math.max(maxaverage,average);
     }
     System.out.print(maxaverage);
    }
}
