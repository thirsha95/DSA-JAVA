package Matrix.Easy;
import java.util.*;
public class DiagonalSumMatrix {
   public static void main(String[] args){
    Scanner sc = new Scanner(system.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] matrix = new int[n][m];
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
        matrix[i][j]=sc.nextInt();
        }
    }
        
    
//logic : primary diagonal
       int primaryDiagonal =0;
       int secondaryDiagonal =0;

     for (int i = 0; i < Math.min(n, m); i++) {
            primaryDiagonal += matrix[i][i];
            secondaryDiagonal += matrix[i][m - 1 - i];
        }

    System.out.println("primaryDiagonal " + primaryDiagonal);
    System.out.println("secondaryDiagonal " + secondaryDiagonal);
   } 
}
//this loop works for a rectangular matrix (n × m), not just a square matrix.
 