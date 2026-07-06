package Strings.Easy;
import java.util.*;

public class Checkpalindromestring {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    
    String reversed = new StringBuilder(str).reverse().toString();
    if(str.equals(reversed)){
        System.out.print("palindrome"   );
    }else{
        System.out.print("Not palindrome");

    }
    }
}
