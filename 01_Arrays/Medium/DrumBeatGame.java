/*
Program: Drum Beat Student Rearrangement

Problem Description:
There are N students standing in a line. Their jersey numbers are initially
arranged in increasing order from 1 to N.

At each position, there is a fixed board containing a unique number from
1 to N. The board arrangement forms a permutation.

After every drum beat, each student moves to the position indicated by the
board number at their current location.

This process repeats until all students return to their original arrangement.
Your task is to determine the minimum number of drum beats required for all
students to be back in their starting positions.

Input Format:
- First line contains an integer N.
- Next N lines contain the board numbers A[i].

Output Format:
- Print the minimum number of drum beats required to restore the original
  student arrangement.

Example:

Input:
5
2
3
1
5
4

Initial Arrangement:
Board-2, 3, 1, 5,4
Position : 1  2  3  4  5
Board    : 2  3  1  5  4
Jersey   : 1  2  3  4  5

After 1 Beat:

Position : 1  2  3  4  5
Jersey   : 3  1  2  5  4

After 2 Beats:

Position : 1  2  3  4  5
Jersey   : 2  3  1  4  5

Students continue moving according to the board numbers.

Cycle Analysis:
1 -> 2 -> 3 -> 1   (Cycle Length = 3)
4 -> 5 -> 4        (Cycle Length = 2)

Answer = LCM(3, 2) = 6

Output:
6
*/
package Arrays.Medium;
import java.util.*;
public class DrumBeatGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] board = new int[n];
        for(int i=0; i<board.length; i++){
            board[i] = sc.nextInt();
        }
        int[] jersey = new int[n];
        for(int i=0; i<n; i++){
            jersey[i] = i+1;
        }
        int[] original = jersey.clone();
        int beats =0;
        while(true){
        int[] res = new int[n];
        for(int i=0; i<jersey.length; i++){
            res[board[i]-1] = jersey[i];
        }
        beats++;
        jersey = res;//Now we want the next beat to start from this new arrangement.
        if(Arrays.equals(jersey,original))
        break;
    }
     System.out.print("Number of beats = "+ " " + beats);

    }
}
