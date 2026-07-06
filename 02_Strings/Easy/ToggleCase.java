/* Toggle character case using ASCII logic: ch + 32 converts uppercase to lowercase,
   and ch - 32 converts lowercase to uppercase. */
package Strings.Easy;
import java.util.*;
public class ToggleCase {
    public static void main (String[] args ){
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        String res =" ";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch >='A' && ch<='Z'){
                res += (char)(ch + 32);
            }else if(ch >= 'a' && ch <='z'){
                res += (char)(ch-32);
            }else{
                res+=ch;
            }
        }
        System.out.println(res);
    }
    
    
}
