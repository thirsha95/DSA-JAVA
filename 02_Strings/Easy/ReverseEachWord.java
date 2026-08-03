/*
Program: ReverseEachWord.java

Problem:
Given a sentence, reverse each word individually while keeping
the order of the words unchanged.

Approach:
- Split the input string into words using spaces.
- Reverse each word using StringBuilder reverse().
- Append the reversed words to the result.
- Remove the extra space at the end and print the output.

Sample Input:
Hello World Java

Sample Output:
olleH dlroW avaJ

Time Complexity:
O(n) - Each character is processed once.

Space Complexity:
O(n) - Extra space is used for storing words and result.
*/
package Strings.Easy;
import java.util.*;
public class ReverseEachWord {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] words= str.split("\\s+");

        StringBuilder result =new StringBuilder ();
        for(String word : words){
            StringBuilder sb = new StringBuilder(word);
            result.append(sb.reverse()).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
