package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        //String s = "He is a very very good boy, isn't he?";
        //String s = "           YES      leading spaces        are valid,    problemsetters are         evillllll";

        String regex = "[ !,?._'@]+";
        s = s.trim();
        String[] result = s.split(regex);
        if(s.length() > 0) {
            System.out.println(result.length);
            Arrays.stream(result).forEach( token -> System.out.println(token));
        } else {
            System.out.println("0");
        }

        scan.close();
    }
}
