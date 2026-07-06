/*
 * Program       : SubarraySumEqualsK.java
 * Problem       : LeetCode 560 - Subarray Sum Equals K
 * Description   : Count the number of contiguous subarrays whose sum equals
 *                 a given integer k.
 *                 Uses Prefix Sum + HashMap to achieve O(n) time complexity.
 *
 * Sample Input  :
 * nums = [1, 1, 1]
 * k = 2
 *
 * Sample Output :
 * 2
 */
package PrefixSum.Medium;
import java.util.*;
public class SubarraySumEqualsK {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
        arr[i]= sc.nextInt();
    }

    HashMap<Integer,Integer> map = new HashMap<>();
    map.put(0,1);
    int currentsum =0;
    int count =0;
    for(int i=0; i<n; i++){
      currentsum += arr[i];
      if(map.containsKey(currentsum - k)){
        count+= map.get(currentsum-k);
      }
      map.put(currentsum, map.getOrDefault(currentsum, 0)+1);
    }
    System.out.print(count);
    }
}
