/*
Program  : Count Even and Odd Numbers in Matrix
Problem  : Given an n x m matrix, count how many elements are even and how many are odd.
Description :
            - Read matrix elements from user input
            - Traverse each element
            - If element % 2 == 0 → even count++
            - Else → odd count++
            - Finally print both counts
*/
package Matrix.Easy;
import java.util.*;
public class CountEvenAndOddInMatrix {
    public static void main (String[] args){
       Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] matrix = new int[n][m];
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            matrix[i][j]= sc.nextInt();
        }
    }

   //logic
   int odd =0;
   int even =0;
   for(int i=0; i<n; i++){
    for(int j=0; j<m; j++){
        if(matrix[i][j] % 2 ==0){
            even++;
        }
        else{
           odd++;
        }
    }
   }
   System.out.println("odd " + odd);
   System.out.println("even "+ even);
 }  
}
