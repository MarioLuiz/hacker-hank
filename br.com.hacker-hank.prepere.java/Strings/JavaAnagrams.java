package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {
    // https://www.hackerrank.com/challenges/java-anagrams/problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

    static boolean isAnagram(String a, String b) {
        String firstWord = a.toLowerCase();
        String secondWord = b.toLowerCase();
        boolean isAnagram =  false;
        if (firstWord.length() != secondWord.length()) {
            return isAnagram;
        }
        char[] firstSequence = firstWord.toCharArray();
        char[] secondSequence = secondWord.toCharArray();

        Arrays.sort(firstSequence);
        Arrays.sort(secondSequence);
        
        return Arrays.equals(firstSequence, secondSequence);
    }
}
