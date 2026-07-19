/*
=========================================================
LeetCode 15 - 3Sum
=========================================================

Difficulty:
Medium ⭐⭐⭐

Pattern:
Sorting + Two Pointers

Problem:
Given an integer array nums, return all the unique
triplets [nums[i], nums[j], nums[k]] such that

nums[i] + nums[j] + nums[k] == 0

The solution set must not contain duplicate triplets.

Example:

Input:
nums = [-1,0,1,2,-1,-4]

Output:
[[-1,-1,2],[-1,0,1]]

---------------------------------------------------------
Approach:

1. Sort the array.
2. Fix one element (i).   Every fixed i starts a fresh two-pointer search
3. Use two pointers:
      left = i + 1
      right = n - 1
4. Calculate the sum.
5. If sum == 0:
      - Store the triplet.
      - Move both pointers.
      - Skip duplicate values.
6. If sum < 0:
      Move left pointer.
7. If sum > 0:
      Move right pointer.

---------------------------------------------------------
Loop boundary rule:

Need k elements including current index:
i < n-(k-1)

3Sum  → 3 elements → i < n-2
4Sum  → 4 elements → i < n-3
Pair  → 2 elements → i < n-1

Time Complexity:
Sorting      : O(n log n)
Two Pointers : O(n²)

Overall      : O(n²)

Space Complexity:
O(1) (Ignoring output list)

=========================================================
*/
import java.util.*;
public class ThreeSum{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
      arr[i]=sc.nextInt();
    }
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(arr);
    for(int i=0; i<n-2; i++){//i moves one step at a time.  For every new i, left and right restart. 
            // Skip duplicate first elements
      if(i > 0 && arr[i] == arr[i-1]){
        continue;           // Same starting value will produce the same triplets
      }

      int left = i+1;
      int right= n-1;
      while(left < right){
         int currentsum = arr[i] + arr[left]+arr[right];
         if(currentsum == 0 ){
            list.add(Arrays.asList(arr[i] , arr[left] ,arr[right]));
         
         left++;    // Move both pointers after using these values
         right--;
         while(left < right && arr[left]==arr[left-1]){    // Avoid adding the same triplet again
            left++;
         }
         while(left<right && arr[right]==arr[right + 1]){    // Avoid adding the same triplet again
            right--;
         }
      }
         else if(currentsum > 0){
            right--;
         }else{
            left++;
         }
         
      }
     }
     if(list.isEmpty()){
      System.out.print("No Triplets Found");
     }else{
      for(List<Integer> triplet_ans:list){
          System.out.println(triplet_ans);
      }
     }
    }
}
