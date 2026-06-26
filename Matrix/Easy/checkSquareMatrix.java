package Matrix.Easy;
import java.util.*;
public class checkSquareMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
            matrix[i][j]=sc.nextInt();
         }
      }
      if(rows == cols){
        System.out.print("THIS IS A SQUARE MATRIX ");
      }else{
         System.out.print("THIS IS NOT A SQUARE MATRIX ");
      }
    }
}
