package Strings.Easy;
import java.util.*;
public class SortCharacters {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
       String str = sc.nextLine();

       int[] freq = new int[26];
       for(char ch : str.toCharArray()){
          if(ch >= 'A' && ch<= 'Z'){
        freq[ch - 'A']++;
       }
       else if(ch >= 'a' && ch<= 'z'){
        freq[ch - 'a']++;
       }
       }

       StringBuilder res =  new StringBuilder();
       for(int i=0; i<26; i++){
         while(freq[i] > 0 ){
            res.append((char)(i + 'a'));
            freq[i]--;   }
       }
       System.out.println(res.toString());
  }
}
