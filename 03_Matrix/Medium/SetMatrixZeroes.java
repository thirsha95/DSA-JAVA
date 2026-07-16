/*
 * LeetCode 73 - Set Matrix Zeroes
 *
 * Better Approach (Using HashSet)
 *
 * Problem:
 * Given an m x n integer matrix, if an element is 0,
 * set its entire row and column to 0.
 * Do it in-place.
 *
 * Approach:
 * 1. Traverse the matrix and store all row indices
 *    containing a zero in a HashSet.
 * 2. Store all column indices containing a zero
 *    in another HashSet.
 * 3. Traverse the marked rows and set every element
 *    in those rows to 0.
 * 4. Traverse the marked columns and set every element
 *    in those columns to 0.
 *
 * Time Complexity:
 * O(n × m)
 *
 * Space Complexity:
 * O(n + m)
 *
 * Example:
 * Input:
 * 1 1 1
 * 1 0 1
 * 1 1 1
 *
 * Output:
 * 1 0 1
 * 0 0 0
 * 1 0 1
 */
import java.util.*;
public class SetMatrixZeroes{
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    int[][] matrix = new int[m][n];
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
         matrix[i][j]=sc.nextInt();
        }
    }
        HashSet<Integer> rows = new HashSet<>();
        HashSet<Integer> cols = new HashSet<>();
        for(int i=0; i<m ; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j]==0){
                    rows.add(i);      // mark this row for zero
                    cols.add(j);      // mark this column for zero
                }
            }
        }
        for(int row : rows){             // Set all elements in the marked row to 0.
            for(int j=0; j<n; j++){     // Traverse all columns to make the entire row zero.
                matrix[row][j]=0;
            }
        }
    
    for(int col : cols){                // Set all elements in the marked column to 0.
        for(int i=0; i<m ; i++){       // Traverse all rows to make the entire column zero.
            matrix[i][col]=0;
        }
    }  
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
      System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
   
   }
}

