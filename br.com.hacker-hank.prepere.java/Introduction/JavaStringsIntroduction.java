package Introduction;

import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) {
        // https://www.hackerrank.com/challenges/java-strings-introduction/problem
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        String c = a + b;
        int lenghtAeB = c.length();

        System.out.println(lenghtAeB);
        if (a.compareTo(b) <= 0 ) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
        a = a.substring(0,1).toUpperCase().concat(a.substring(1));
        b = b.substring(0,1).toUpperCase().concat(b.substring(1));
        c =  a + " " + b;
        System.out.println(c);
    }
}
