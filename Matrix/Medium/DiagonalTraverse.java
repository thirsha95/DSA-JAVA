/*
 * Program    : Diagonal Traverse
 * Problem    : LeetCode 498 - Diagonal Traverse
 * Description: Traverse a matrix in diagonal zigzag order by alternating
 *              between moving up-right (↗) and down-left (↙) until all
 *              elements are visited.
 * 
 *  */
package Matrix.Medium;
import java.util.*;
public class DiagonalTraverse {
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

    int[]res = new int[m*n];
    int index=0;
    for(int d=0; d<=m+n-1; d++){  // diagonals = rows +cols
        if(d%2==0){
            int row = Math.min(d,m-1);
            int col = d- row;
            while(row>=0 && col<n){
                res[index++]=matrix[row][col];
                row--;
                col++;
            }
        }else{
            int col = Math.min(d,n-1);
            int row = d-col ;
            while(col >=0 && row < m){
                res[index++]= matrix[row][col];
                row++;
                col--;
            }
            
        }
    }
        System.out.print(Arrays.toString(res));
    }
}
