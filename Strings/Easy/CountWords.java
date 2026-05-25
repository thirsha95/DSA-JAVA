package Strings.Easy;
import java.util.*;
public class CountWords  {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence : ");
        String str = sc.nextLine().trim();

        if(str.isEmpty()){
         System.out.println("word count = 0  ");

        }else
            {
          String [] words = str.split("\\s+");
        System.out.println("words count : "+ words.length );

         for(int i=0; i<words.length; i++){
            System.out.println(words[i]);
            }
           
            }
            
        }
     
    }

