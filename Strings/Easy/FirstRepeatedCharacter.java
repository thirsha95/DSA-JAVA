package Strings.Easy;
import java.util.*;
public class FirstRepeatedCharacter {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    
    HashSet <Character> set = new HashSet<>();
    for(int i=0; i<str.length();i++){
        char ch = str.charAt(i);
        if(set.contains(ch)){
         System.out.println("FirstRepeatedCharacter : "+ch);
         return;
        }
        set.add(ch);
    }
     System.out.println("No repeated character found");

    }
}
