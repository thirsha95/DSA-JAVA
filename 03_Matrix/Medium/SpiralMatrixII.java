/*
=========================================================
LeetCode 59 - Spiral Matrix II
=========================================================

Problem:
Given a positive integer n, generate an n x n matrix
filled with elements from 1 to n² in spiral order.

Example:

Input:
n = 3

Output:
[
 [1,2,3],
 [8,9,4],
 [7,6,5]
]

---------------------------------------------------------
Approach:
Boundary Traversal + Simulation

Maintain four boundaries:
top    -> First unvisited row
bottom -> Last unvisited row
left   -> First unvisited column
right  -> Last unvisited column

Fill numbers in four directions:

1. Left  → Right
2. Top   → Bottom
3. Right → Left
4. Bottom→ Top

After completing each direction,
move the corresponding boundary inward.

Direction         Boundary Completed      Pointer Move

→ Left to Right       Top Row             top++
↓ Top to Bottom       Right Column        right--
← Right to Left       Bottom Row          bottom--
↑ Bottom to Top       Left Column         left++

Repeat until:
top > bottom
OR
left > right

---------------------------------------------------------
Algorithm:

1. Initialize:
   top = 0
   bottom = n - 1
   left = 0
   right = n - 1
   num = 1

2. Fill top row
3. Fill right column
4. Fill bottom row (if exists)
5. Fill left column (if exists)

6. Continue until all cells are filled.

---------------------------------------------------------
Time Complexity:
O(n²)

Space Complexity:
O(1)
(Excluding the output matrix)

---------------------------------------------------------
Key Interview Idea:

Think of the matrix as four walls.

Finish TOP wall     → top++
Finish RIGHT wall   → right--
Finish BOTTOM wall  → bottom--
Finish LEFT wall    → left++

Never memorize pointer movements.
Remember which wall you have completed.

Horizontal Movement (→ ←)

Row stays SAME
Column changes
matrix[fixed][i]


Vertical Movement (↑ ↓)

Column stays SAME
Row changes

matrix[i][fixed]

=========================================================
*/
import java.util.*;
public class SpiralMatrixII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];

        int top = 0;
        int bottom=m-1;
        int left = 0;
        int right = n-1;
        int dir =0;
        int nums = 1;// for filling 1 2 3 4 5 
        
        while(left <= right && top <= bottom){
            switch(dir){
                case 0->{
                     for(int i=left; i<=right; i++){
                     matrix[top][i] = nums++;
                     } 
                     top++;
                }

                case 1->{
                   for(int i=top; i<=bottom; i++){
                        matrix[i][right]=nums++;
                         }
                     right--;
                }

                case 2->{
                    for(int i=right; i>=left; i--){
                        matrix[bottom][i]=nums++;
                    }
                    bottom--;
                }
                case 3-> {
                    for(int i=bottom; i>=top; i--){
                         matrix[i][left]=nums++;
                    }
                    left++;
                }
            }
            dir = (dir+1) % 4;
          
        }
        System.out.println("SPIRAL MATRIX");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
               System.out.print(matrix[i][j]+" ") ;
            }
            System.out.println();
        }
    }
}
