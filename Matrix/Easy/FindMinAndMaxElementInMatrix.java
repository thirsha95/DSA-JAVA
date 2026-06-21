/*
Program: Find Maximum & Minimum Element in Matrix

Problem:
Given a 2D matrix of size n x m, find the maximum element present in the matrix.

Description:
Traverse all elements in the matrix and keep track of the largest value found.
Return or print the maximum element after full traversal.
*/
package Matrix.Easy;
import java.util.*;
public class FindMinAndMaxElementInMatrix {
 public static void main(String [] args ) {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] matrix = new int[n][m];
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            matrix[i][j]= sc.nextInt();
        }
    }

    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            if(matrix[i][j] > max){
                max = matrix[i][j];
            }
            if(matrix[i][j] < min){
                min = matrix[i][j];
            }
        }
    }
   System.out.println("Maximum of MATRIX : " + max);
   System.out.println("Minimum of MATRIX : " + min);
 }  
}
