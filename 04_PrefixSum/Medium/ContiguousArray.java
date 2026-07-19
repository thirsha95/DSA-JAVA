
/*
 * LeetCode 525: Contiguous Array
 *
 * Pattern: Prefix Sum + HashMap
 *
 * Intuition:
 * - Convert 0 -> -1 and keep 1 -> +1.
 * - Now, a subarray with equal number of 0s and 1s will have a sum of 0.
 * - Use Prefix Sum to calculate the running sum.
 * - Store each prefix sum with its first occurrence index in a HashMap.
 * - If the same prefix sum appears again, the sum of elements between
 *   the two indices is 0, which means the subarray is balanced
 *   (equal number of 0s and 1s).
 *
 * Key Prefix Sum Concept:
 * - Prefix Sum = Sum of elements from index 0 to i.
 * - If the same prefix sum is seen again:
 *  
 *      Current Prefix Sum - Previous Prefix Sum = 0
 *
 *   Therefore, the elements between those two indices have sum = 0.
 *
 * Example:
 * nums = [0,1,0]
 * Converted = [-1,+1,-1]
 *
 * Prefix Sums:
 * Index :    0    1    2
 * Prefix:   -1    0   -1
 *
 * Prefix sum -1 appears at index 0 and again at index 2.
 *
 * Sum between them:
 * = Prefix[2] - Prefix[0]
 * = -1 - (-1)
 * = 0
 *
 * Subarray = [1,0]
 * Converted sum = +1 + (-1) = 0
 * Therefore, it contains equal number of 0s and 1s.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 *
 * Same Prefix Sum
        ↓
Elements between those two positions have sum = 0
 */

import java.util.*;
public class ContiguousArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int[] arr = new int [n];
         for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
    }
    HashMap<Integer,Integer> map = new HashMap<>();
    map.put(0,1);
    int prefixsum =0;
    int maxlength=0;

    for(int i=0; i<n; i++){
    if(arr[i]==0){
        prefixsum += -1;
    }else{
        prefixsum += 1;
    } 
     
    if(map.containsKey(prefixsum)){
        int length = i- map.get(prefixsum);
        maxlength = Math.max(length , maxlength);
    }else{
        map.put(prefixsum,i);
    }
  }
  System.out.println(maxlength);
 }
}
