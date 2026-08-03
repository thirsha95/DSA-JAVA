/*
 * Folder:
 * LogicalPatterns
 *
 * File Name:
 * TopNFrequentWords.java
 *
 * Problem:
 * Top N Frequent Words
 *
 * Pattern:
 * HashMap + Collections.sort() + Comparator
 *
 * Problem Statement:
 * Given a sentence and an integer N, find the N most frequent words.
 * Print each word along with its frequency.
 *
 * Sorting Rules:
 * 1. Sort by frequency in descending order.
 * 2. If two or more words have the same frequency,
 *    sort them alphabetically in ascending order.
 *
 * Approach:
 * 1. Split the sentence into words.
 * 2. Count the frequency of each word using a HashMap.
 * 3. Store all unique words in a List.
 * 4. Sort the list using a custom Comparator:
 *      - Higher frequency first.
 *      - If frequencies are equal, alphabetical order.
 * 5. Print the first N words with their frequencies.
 *
 * Sample Input:
 * apple banana apple orange banana apple
 * 2
 *
 * Sample Output:
 * apple 3
 * banana 2
 *
 * Time Complexity:
 * O(n + m log m)
 * n = Total words
 * m = Unique words
 *
 * Space Complexity:
 * O(m)
 */

import java.util.*;
public class TopNFrequentWords {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int n = sc.nextInt();
    String[] words = str.split(" ");

    HashMap<String,Integer> map = new HashMap<>();
    for(String word : words){
        map.put(word, map.getOrDefault(word,0)+1);
    }

    List<String> list = new ArrayList<>(map.keySet());  //list = [apple, banana, orange]

    Collections.sort(list, (a,b)->{// this comparator -> means we can write sort the way we want(custom custing algorrithm)
        if(!map.get(a).equals(map.get(b))){// Sort by frequency, then alphabetically
            return map.get(b)- map.get(a);
        }

        return a.compareTo(b);//then alphabetically so no need get() map.get() returrs freq after freq checked we go for word alphabetical order
    });
    for(int i=0; i<n && i < list.size(); i++){
       String word = list.get(i);
       int freq = map.get(word);
       System.out.println(word + " "+ freq); 
    }
}
}