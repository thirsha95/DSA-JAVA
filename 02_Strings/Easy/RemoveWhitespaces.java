package Strings.Easy;
import java.util.*;
public class RemoveWhitespaces {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String result = str.replace(" ","");
        System.out.println(result);

    }
}
