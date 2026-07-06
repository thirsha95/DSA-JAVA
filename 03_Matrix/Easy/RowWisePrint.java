package Matrix.Easy;

import java.util.*;
public class RowWisePrint {
    public static void main (String[] args){
     Scanner sc = new Scanner(System.in);
     int m = sc.nextInt();
     int n = sc.nextInt();
     int[][] matrix = new int[m][n];
     for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            matrix[i][j] = sc.nextInt();
        }
     } 
     System.out.println("ROW WISE MATRIX PRINTED ");
     for(int i=0; i<m; i++){
      for(int j=0; j<n; j++){
        System.out.print(matrix[i][j] + " ");
      }
     }
    }
}
