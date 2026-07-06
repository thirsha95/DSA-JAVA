/*
Program: Rotate Matrix 90° Clockwise
Description: Transpose the matrix and reverse each row to rotate it 90° clockwise.

Algorithm :
A 90° clockwise rotation is performed in two steps:

1. Transpose the matrix
   - Swap matrix[i][j] with matrix[j][i].

2. Reverse each row.
*/
package Matrix.Medium;
import java.util.*;
public class RotateMatrix90Clockwise {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m =sc.nextInt();
        int n =sc.nextInt();
        int[][] matrix = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        //logic;  // Step 1 : Transpose
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                 int temp = matrix[i][j];
                 matrix[i][j]= matrix[j][i];
                 matrix[j][i] = temp;
            }
        }
         // Step 2 : Reverse every row
         for(int i=0; i<n; i++){
            int left = 0;
            int right = n-1;
            while(left <  right){
                int temp = matrix[i][left];          /*Row 0 → matrix[0][left]  Row 1 → matrix[1][left]   Row 2 → matrix[2][left] */
                matrix[i][left]=matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
         }

    }
}

