/*
Program: RemoveDuplicateCharacters.java

Problem:
Remove duplicate characters from a string while preserving
the order of their first occurrence.

Approach:
- Traverse the string character by character.
- Check if the current character already exists in the result string.
- If not, append it to the result.
- Print the final string containing only unique characters.

Sample Input:
programming

Sample Output:
progamin
*/

// Remove duplicate characters by checking if the character already exists in the result string.
// indexOf() returns -1 when the character is not present, so only unique characters are added.
package Strings.Easy;

import java.util.*;
public class RemoveDuplicateCharacters {
    public static void main (String[] args ){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
  
    String res =" ";
    for(int i=0; i<str.length(); i++){
    char ch = str.charAt(i);

    if(res.indexOf(ch)==-1){
          res += ch;
    }
    }
    System.out.println(res);
    
    }
}
