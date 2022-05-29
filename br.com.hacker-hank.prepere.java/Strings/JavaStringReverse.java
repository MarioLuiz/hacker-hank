package Strings;

import java.util.Scanner;

public class JavaStringReverse {
    // https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        String reverseInput = new StringBuilder(input).reverse().toString();
        if (reverseInput.equals(input)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
