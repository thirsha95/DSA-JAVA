/*
 * Program     :  LeetCode 54 - Spiral Matrix 
 * Problem     : Print all elements of a matrix in spiral order.
 * Description : Traverse the matrix by visiting the top row, right column,
 *               bottom row, and left column repeatedly while shrinking the
 *               boundaries after each traversal until all elements are visited.
 *
 * Example:
 *
 * Input:
 * Matrix =
 * 1   2   3
 * 4   5   6
 * 7   8   9
 *
 * Output:
 * 1 2 3 6 9 8 7 4 5
 *
 * Spiral Traversal:
 * → Right across the top
 * ↓ Down the right side
 * ← Left across the bottom
 * ↑ Up the left side
 * Repeat until all elements are visited.
 */
package Matrix.Medium;
  import java.util.*;
public class SpiralMatrix {
    public static  void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] matrix = new int[n][m];
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            matrix[i][j]=sc.nextInt();
        }
    }
    List<Integer> result = new ArrayList<>();
     int left = 0;
     int top = 0;
     int right = matrix[0].length-1;
     int bottom = matrix.length-1;
     int dir =0; // 4 directions--> one direction executes every iteration based on case value 0,1,2,3 =4
     while(top<=bottom && left<=right){
        switch(dir){
            case 0 -> {
        for(int i=left; i<=right; i++){ //left to right
         result.add(matrix[top][i]);
        }
        top++;
    }
       case 1 ->{ 
       for(int i=top ; i<=bottom; i++){ //top to botom
        result.add(matrix[i][right]);
       }
       right--;
    }
      
       case 2 ->{
       for(int i=right; i>=left; i--){//right to left 
        result.add(matrix[bottom][i]);
       }
       bottom--;
    }

      case 3->{
       for(int i=bottom; i>=top; i--){
        result.add(matrix[i][left]);
       }
       left++;
    }
  }
 }
    System.out.print(result);  


  }
}
