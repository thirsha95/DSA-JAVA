/*
Problem:
Given an array of integers and an integer k,
find the average of every contiguous subarray of size k.

Example:
Input:
arr = [1,3,2,6,-1,4,1,8,2]
k = 5

Output:
2.2
2.8
2.4
3.6
2.8

Explanation:
Window 1: [1,3,2,6,-1]  Average = 2.2
Window 2: [3,2,6,-1,4]  Average = 2.8
Window 3: [2,6,-1,4,1]  Average = 2.4
Window 4: [6,-1,4,1,8]  Average = 3.6
Window 5: [-1,4,1,8,2]  Average = 2.8

Approach (Fixed Sliding Window):
1. Calculate the sum of the first k elements.
2. Print the average of the first window.
3. Slide the window:
      Add the new element.
      Remove the old element.
4. Print the average of each new window.

Time Complexity : O(n)
Space Complexity: O(1)

Pattern:
Sliding Window (Fixed Size)

Learned:
✔ Reuse the Fixed Window Template
✔ Calculate average using window sum
✔ Add new element
✔ Remove old element
✔ Print result for every window
*/

import java.util.*;
public class AverageOfSubarrayOfSizeK {
    public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int n =sc.nextInt();
   int[]arr= new int[n];
   for(int i=0; i<n ; i++){
    arr[i]=sc.nextInt();
   }
   int k =sc.nextInt();

   int windowsum= 0;
   for(int i=0; i<k; i++){
    windowsum += arr[i];
   }

   System.out.println((double)windowsum / k); //print first window average

   for(int j=k; j<n; j++){
    windowsum += arr[j];
    windowsum -= arr[j-k];
   double average  =(double)windowsum / k;
   System.out.println(average);
   }
    }
}
