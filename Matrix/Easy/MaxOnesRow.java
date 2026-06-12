/*
Program: Max 1s Row in Matrix

Input:
n m (rows and columns)
n x m binary matrix (0s and 1s)

Output:
Index of row having maximum number of 1s

Description:
Find the row which contains the highest count of 1s.

Example:
Input:
4 4
0 1 1 0
1 1 1 1
0 0 1 0
1 0 1 1

Output:
1
*/
package Matrix.Easy;
import java.util.*;
public class MaxOnesRow {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
              matrix[i][j] = sc.nextInt();
            }
        }
        
        int maxrow =-1; //row 0 possible answer
        int maxcount =0;

        for(int i=0; i<m; i++){
            int count =0;
            for(int j=0; j<n; j++){
                if(matrix[i][j]==1){
                    count++;
                }
            }
            //“After completing each row, the count is compared with maxCount.”
             if(count > maxcount){ 
                maxcount = count ;
                maxrow = i ;
           }
        }
        System.out.println(maxrow);
    }
}
