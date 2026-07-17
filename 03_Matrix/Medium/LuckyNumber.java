/*
 * LeetCode 1380 - Lucky Numbers in a Matrix
 *
 * Problem:
 * A lucky number is an element that is:
 * 1. The minimum element in its row.
 * 2. The maximum element in its column.
 *
 * Return all lucky numbers in the matrix.
 *
 * Approach (Row Minimum + Column Verification):
 * 1. Traverse each row and find its minimum element.
 * 2. Store the column index of that minimum element.
 * 3. Traverse the stored column to verify whether
 *    the minimum element is also the maximum in that column.
 * 4. If true, add it to the answer list.
 *  Example:
 * Input:
 * matrix =   [[3,7,8],
 *            [9,11,13],
 *            [15,16,17]]
 *
 * Output:
 * [15]
 *             
 *
 * Time Complexity: O(rows × cols)
 * Space Complexity: O(1) (excluding output list)
 */

import java.util.*;
public class LuckyNumber {
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
    int[] row_min = new int[m];
    int[] col_max = new int[n];
    
    for(int i=0; i<m; i++){
    row_min[i]= Integer.MAX_VALUE;
    }
    
    for(int i=0; i<n; i++){
        col_max[i] = Integer.MIN_VALUE;
    }
    
    for(int i=0; i<m; i++){    //checks every row  // Each row
        for(int j=0; j<n; j++){     // Every column in that row
          if(matrix[i][j] < row_min[i]){
             row_min[i]=matrix[i][j];
          }
        }
    }
        for(int j=0; j<n; j++){  // check for every col       // Each column
            for(int i=0; i<m; i++){     // Every row
                if(matrix[i][j] > col_max[j] ){
                    col_max[j] = matrix[i][j]; 
                }
        }
    }
// System.out.println("Row Min: " + Arrays.toString(row_min));
// System.out.println("Col Max: " + Arrays.toString(col_max));
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            if(matrix[i][j]==row_min[i]  && matrix[i][j] == col_max[j]){
                System.out.print(matrix[i][j]);
            }
        }
    }


 }
    }


