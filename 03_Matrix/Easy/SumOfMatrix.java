package Matrix.Easy;

import java.util.*;
public class SumOfMatrix {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int [m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
  
        int sum = 0; 
        for(int i=0; i<m; i++){
          for(int j=0; j<n; j++){
           sum += matrix[i][j] ;
          }
        }
        System.out.println("SUM OF MATRIX " + sum);
    }
}
