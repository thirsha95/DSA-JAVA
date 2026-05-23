/*
Program: Count Uppercase & Lowercase

Description:
Counts uppercase and lowercase letters in a string.

Example:
Input: HeLLo
Output: Uppercase=3, Lowercase=2
*/
package Strings.Easy;
import java.util.*;
public class Countuppercaseandlowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int uppercase =0;
        int Lowercase =0;
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                uppercase++;
            }else{
                Lowercase++;
            }        
        }
          System.out.println("Uppercase letters: " + uppercase);
          System.out.println("Lowercase letters: " + Lowercase);


    }
}
