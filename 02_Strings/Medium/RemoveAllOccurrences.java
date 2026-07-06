/*
Program: RemoveAllOccurrences.java
Problem: Remove all occurrences of a given character from a string.
Description: Traverse the string and keep only characters that are not equal to the target character.
Example
Input:
String = "programming"
Character = 'm'

Output:
prograing

For string questions, remember:

Input Type	Scanner Code
int	sc.nextInt()
String (one word)	sc.next()
String (full line)	sc.nextLine()
char	sc.next().charAt(0)

This is the standard way to read a character in Java.
*/
package Strings.Medium;
import java.util.*;
public class RemoveAllOccurrences {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     String  str = sc.nextLine();
     char target = sc.next().charAt(0);
     String res ="";
     for(char ch : str.toCharArray()){
       if(ch!=target){
         res+=ch;
       }

     }
     System.out.println(res);

    }
}
