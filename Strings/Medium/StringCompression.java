/*
Program: StringCompression

Problem:
Compress consecutive repeating characters.

Example:
Input  : aaabbccccd
Output : a3b2c4d1

Description:
Count consecutive occurrences of each character and
append character followed by its frequency.
*/
package Strings.Medium;
import java.util.*;
public class StringCompression  {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    
    StringBuilder res = new StringBuilder(); 
    int count = 1;
    for(int i=1; i<str.length(); i++){
     if(str.charAt(i) == str.charAt(i-1)){
       count++;
     }else{
        res.append(str.charAt(i-1));
        res.append(count);
        count=1;
     }
     
    }
     res.append(str.charAt(str.length()-1)); // hell0 --> 5 here vists until 4
     res.append(count);
     System.out.println(res);
    }
}
