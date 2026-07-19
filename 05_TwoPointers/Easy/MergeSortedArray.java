/*
 * LeetCode 88: Merge Sorted Array
 *
 * Pattern: Two Pointer (Merge From Back)
 *
 * Approach:
 * - i points to last valid element of nums1
 * - j points to last element of nums2
 * - k points to last position of nums1
 * - Compare from the back and place the larger element at nums1[k]
 *
 * Time Complexity: O(m+n)
 * Space Complexity: O(1)
 * 
  * Input Format:
 * m n
 * nums1 (m sorted elements)
 * nums2 (n sorted elements)
 *
 * Sample Input:
 * 3 3
 * 1 2 3
 * 2 5 6
 *
 * Sample Output:
 * 1 2 2 3 5 6
 *
 * Example:
 * nums1 = [1,2,3,0,0,0]
 * nums2 = [2,5,6]
 *
 * After Merge:
 * nums1 = [1,2,2,3,5,6]
 * -------------------------------------------------------
 */
 */


import java.util.Scanner;
public class MergeSortedArray {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int m= sc.nextInt(); // Input nums1 size
     int n =sc.nextInt(); // Input nums2 size

    int[] nums1 = new int[m+n]; // nums1 valid elements
    for(int i=0; i<m; i++){
        nums1[i]=sc.nextInt(); 
    }// nums1 remaining empty spaces are 0 initially

    int[] nums2 = new int[n];
    for(int i=0; i<n; i++){
        nums2[i]=sc.nextInt();
     }

     int i= m-1;
     int j= n-1;
     int k =m+n-1;
     while(i>=0 && j>=0){
         if(nums1[i] > nums2[j]){
            nums1[k] = nums1[i];
            i--;
            k--;
         }else{
            nums1[k]= nums2[j];
            j--;
            k--;
         }
     }
     while(j>=0){
        nums1[k]=nums2[j];
        j--;
        k--;
     }
   // Output merged array
      for(int p=0; p<m+n; p++){
        System.out.print(nums1[p]+" ");
      }


    }
    
}
