/*
Program: MoveZeroes.java
Problem: Move Zeroes
Description: Moves all zeros to the end of the array while maintaining the relative order of non-zero elements.
*/
package Arrays.Easy;
import java.util.*;
public class MoveZeroes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int j=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
/*
   i -> traverses the entire array.

   j -> points to the position where the next
        non-zero element should be placed.

   Whenever a non-zero is found at i,
   swap nums[i] with nums[j] and move j forward.

   Result:
   All non-zero elements move to the front,
   and all zeros automatically move to the end.
*/