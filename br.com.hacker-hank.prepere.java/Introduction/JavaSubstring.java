package Introduction;

import java.util.Scanner;

public class JavaSubstring {
    public static void main(String[] args) {
        // https://www.hackerrank.com/challenges/java-substring/problem
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        String newString = s.substring(start, end);

        System.out.println(newString);

    }
}
