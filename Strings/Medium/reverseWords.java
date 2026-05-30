/*
Program: Reverse Words in a String

Problem:
Reverse the order of words in a string.

Description:
Remove extra spaces and return the words in reverse order.
*/

package Strings.Medium;
import java.util.*;
public class reverseWords {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder res = new StringBuilder();
        String[] words = str.trim().split("\\s+");
        for(int i= words.length-1 ; i>=0; i--){
            res.append(words[i]);
            if(i != 0){
                res.append(" ");
            }
        }
        System.out.println( res.toString());

    }
}
