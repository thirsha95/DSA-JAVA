/*
 * Search in Row & Column Sorted Matrix (Staircase Search)
 *
 * Problem:
 * You are given an N × M matrix where:
 *
 * 1. Every row is sorted in increasing order.
 * 2. Every column is sorted in increasing order.
 *
 * Find whether a target element exists in the matrix.
 * If found, print its row and column index.
 * Otherwise, print "Not Found".
 *
 * ------------------------------------------------------------
 * Example:
 *
 * Input:
 * 4 4
 * 1  4  7  11
 * 2  5  8  12
 * 3  6  9  16
 * 10 13 14 17
 * Target = 8
 *
 * Output:
 * Found at (1, 2)
 *
 * ------------------------------------------------------------
 * Observation:
 *
 * Start from the top-right corner.
 *
 * If current element == target
 *      -> Target found.
 *
 * If current element > target
 *      -> Move left.
 *      (Current column can be eliminated.)
 *
 * If current element < target
 *      -> Move down.
 *      (Current row can be eliminated.)
 *
 * At every step, one complete row or one complete column
 * is eliminated from further search.
 *
 * ------------------------------------------------------------
 * Pattern:
 * Staircase Search
 * (Search in Row & Column Sorted Matrix)
 *          
 *
 * ------------------------------------------------------------
 * Approach:
 *
 * Step 1:
 * Start from the top-right corner.
 *
 * Step 2:
 * Compare the current element with the target.
 *
 * Step 3:
 * If current > target
 *      -> Move left.
 *
 * Step 4:
 * If current < target
 *      -> Move down.
 *
 * Step 5:
 * Repeat until:
 *      - Target is found, or
 *      - Indices go out of bounds.
 *
 * ------------------------------------------------------------
 * Time Complexity : O(N + M)
 * Space Complexity: O(1)
 */

import java.util.*;
public class SearchSortedMatrix {
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int m= sc.nextInt();
   int[][] matrix = new int[n][m];
   for(int i=0; i<n; i++){
    for(int j=0; j<m; j++){
        matrix[i][j]=sc.nextInt();
    }
   }
   int target = sc.nextInt();

    int row = 0;
    int col = m-1;

    while(row < n && col >= 0 ){
        int current = matrix[row][col];
        if(current == target){
            System.out.println("found at "+ row + " , " + col);
            return;
        }
        else if(current > target){
            col--;
        }else{
            row++;
        }
    }
   System.out.print("Not Found");

    }
}
