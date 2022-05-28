package Strings;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class JavaSubstringComparisons {
    // https://www.hackerrank.com/challenges/java-string-compare/problem
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String palavra = scan.next();
        int tamanho = scan.nextInt();
        int quantidadePalavras = palavra.length() - tamanho;
        SortedSet<String> sets = new TreeSet<String>();
        for (int i = 0; i <= quantidadePalavras; i++) {
            sets.add(palavra.substring(i, i + tamanho));
        }
        System.out.println(sets.first());
        System.out.println(sets.last());
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        int quantidadePalavras = s.length() - k;
        SortedSet<String> sets = new TreeSet<String>();
        for (int i = 0; i <= quantidadePalavras; i++) {
            sets.add(s.substring(i, i + k));
        }
        smallest = sets.first();
        largest = sets.last();

        return smallest + "\n" + largest;
    }
}
