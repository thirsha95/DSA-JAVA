/*
 * Program     : Multiple Missing Numbers
 * Problem     : Find all missing numbers within a given range.
 * Description : Read the range and array elements, mark the numbers present
 *               using a boolean array, then traverse the range and print
 *               the numbers that are not marked as present.
 */
package Arrays.Easy;
import java.util.*;
public class MultipleMissingNumbers {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int  n =sc.nextInt();
      int start = sc.nextInt();
      int end = sc.nextInt();
      int[] arr = new int[n];
      for(int i=0; i<n ; i++){
        arr[i]= sc.nextInt();
      }
      boolean[] present = new boolean[end+1];
      for(int num : arr){
        present[num] = true;
      }
      for(int i=start; i<=end; i++){
          if(present[i] != true){
            System.out.print(i+ " ");
          }
      }

    }
}
