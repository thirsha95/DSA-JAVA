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
