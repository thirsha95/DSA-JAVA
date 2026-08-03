/*
Program: Sort Characters Using Frequency Array
Description: Counts frequency of each character and rebuilds the string in sorted order (a to z).
*/
package Strings.Easy;
import java.util.*;
public class SortCharacters {
    public static void main(String[] args){
       Scanner sc = new Scanner (System.in);
       String str = sc.nextLine();

       int[] freq = new int[26];
       for(char ch : str.toCharArray()){
          if(ch >= 'A' && ch<= 'Z'){
         freq[ch - 'A']++;             // convert character to index 'ch' - 'a' | 'A' = 65 |  'C' - 'A' | 67 - 65 = 2
       }
       else if(ch >= 'a' && ch<= 'z'){
        freq[ch - 'a']++;        //'a' = 97
       }
       }

       StringBuilder res =  new StringBuilder();
       for(int i=0; i<26; i++){
         while(freq[i] > 0 ){
            res.append((char)(i + 'a')); //Index → Character i + 'a'
            freq[i]--;   }
       }
       System.out.println(res.toString());
  }
}
