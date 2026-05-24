package Strings.Easy;
import java.util.*;
public class CountCharTypes {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); 
        int upper =0;
        int Lower = 0;
        int digits=0;
        int special=0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                upper++;
            }
            else if(ch >= 'a' && ch <= 'z'){
                Lower++;
            }
            else if(ch >= '0' && ch <= '9'){
                digits++;
            }else{
                special++;
            }
        }
        System.out.println("Uppercase count "+ upper);
        System.out.println("Lowercase count "+ Lower);
        System.out.println("digits count "+ digits);
        System.out.println("specials count "+ special);

        

    }
}

