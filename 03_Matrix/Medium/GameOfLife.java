/*
=========================================================
LeetCode 289 - Game of Life
=========================================================

Problem:
Given an m x n binary matrix, update the board according
to the Game of Life rules.

Rules:
1. Any live cell with fewer than 2 live neighbours dies.
2. Any live cell with 2 or 3 live neighbours survives.
3. Any live cell with more than 3 live neighbours dies.
4. Any dead cell with exactly 3 live neighbours becomes alive.

---------------------------------------------------------

Approach:
Matrix Simulation + Extra Matrix + 8 Direction Traversal

Idea:
- Keep original board unchanged.
- Count live neighbours for every cell.
- Store the next generation in a new matrix.
- Copy the result back if the original board needs updating.

Direction Matrix:

(-1,-1) (-1,0) (-1,1)
( 0,-1)    X    (0,1)
( 1,-1) ( 1,0) (1,1)

---------------------------------------------------------

Algorithm:
1. Create an extra matrix `next[][]`.
2. Traverse every cell of the board.
3. Check all 8 neighbours using directions array.
4. Count live neighbours.
5. Apply Game of Life rules.
6. Store the new value in `next[][]`.
7. Copy `next[][]` back to `board` if required.

---------------------------------------------------------
1. Pick current cell (i,j)

2. Look around:
   
   newRow = i + directionRow
   newCol = j + directionCol

3. Boundary check

4. Count neighbours

5. Apply rule

---------------------------------------------------------

Complexity:
Time Complexity  : O(m * n)
Space Complexity : O(m * n)

---------------------------------------------------------

Pattern:
Matrix Simulation
Neighbour Traversal
Direction Array Technique

=========================================================
*/


import java.util.*;
public class GameOfLife {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    int[][] board = new int[m][n];
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            board[i][j]=sc.nextInt();
        }
    }
    int[][] copy = new int[m][n];

    int[][] dirs = {                       //trick
                    {-1,-1},{-1,0},{-1,1}, //Row changes: -1, 0, 1, Column changes: -1, 0, 1 ; 
                    {0,-1},         {0,1}, //Take every combination except: 0,0  (the current cell)
                     {1,-1},{1,0}, {1,1}   
                                         };
    for(int i=0; i<m; i++){ // Traverse every cell
        for(int j=0; j<n; j++){
            int liveNeighbours = 0;
            for(int k=0; k<dirs.length; k++){
                int newrow = i + dirs[k][0];
                int newcol = j + dirs[k][1];

                if(newrow >= 0 && newrow < m && newcol >=0 && newcol < n){
                      if(board[newrow][newcol]==1){
                        liveNeighbours++;
                      }
                }
            }
            if(board[i][j]==1){//cureent cell is alive
                if(liveNeighbours == 2 || liveNeighbours == 3){
                      copy[i][j]=1;
                }
            }else{//else current cell is died
                if(liveNeighbours == 3 ){//when three cell is died
                    copy[i][j]=1;
                }
                        }
        }
    }
    //board=copy if only updated borad asked;
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            System.out.print(copy[i][j]+" ");
        }
       System.out.println();
    }
  } 
}



/*
/*
=========================================================
LeetCode 289 - Game of Life (Optimized)
=========================================================

Approach:
Matrix Simulation + In-place State Encoding

Time Complexity  : O(m * n)
Space Complexity : O(1)

State Encoding:

0 -> 0 = Dead remains Dead
1 -> 1 = Live remains Live
1 -> 0 = -1 (Live becomes Dead)
0 -> 1 = 2  (Dead becomes Live)

While counting neighbours:
Math.abs(board[newRow][newCol]) == 1

because:
1  -> originally alive
-1 -> originally alive

import java.util.*;

public class GameOfLife {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] board = new int[m][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        // 8 Directions
        int[][] dirs = {
                {-1,-1}, {-1,0}, {-1,1},
                {0,-1},          {0,1},
                {1,-1},  {1,0},  {1,1}
        };

        // First Pass
        // Mark temporary states

        for(int i = 0; i < m; i++) {

            for(int j = 0; j < n; j++) {

                int liveNeighbours = 0;

                // Count neighbours
                for(int k = 0; k < dirs.length; k++) {

                    int newRow = i + dirs[k][0];
                    int newCol = j + dirs[k][1];

                    if(newRow >= 0 && newRow < m &&
                       newCol >= 0 && newCol < n) {

                        // Originally alive
                        if(Math.abs(board[newRow][newCol]) == 1) {
                            liveNeighbours++;
                        }
                    }
                }

                // Current cell is alive
                if(board[i][j] == 1) {

                    // Dies
                    if(liveNeighbours < 2 || liveNeighbours > 3) {
                        board[i][j] = -1;
                    }
                }

                // Current cell is dead
                else {

                    // Becomes alive
                    if(liveNeighbours == 3) {
                        board[i][j] = 2;
                    }
                }

            }
        }

        // Second Pass
        // Convert temporary states

        for(int i = 0; i < m; i++) {

            for(int j = 0; j < n; j++) {

                if(board[i][j] == -1) {
                    board[i][j] = 0;
                }

                else if(board[i][j] == 2) {
                    board[i][j] = 1;
                }
            }
        }

        // Print updated board

        for(int i = 0; i < m; i++) {

            for(int j = 0; j < n; j++) {

                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
} */