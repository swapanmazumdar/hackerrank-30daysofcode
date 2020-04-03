package java_challenges;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */

        StringBuilder transformedConcatenatedName = new StringBuilder();

        String isLexicographicallyGreater = null;
        if (A.compareTo(B) > 0) {
            isLexicographicallyGreater = "Yes";
        } else {
            isLexicographicallyGreater = "No";
        }

        char[] charsOfA = A.toCharArray();
        transformedConcatenatedName.append(String.valueOf(charsOfA[0]).toUpperCase());
        for (int i = 1; i < charsOfA.length; i++) {
            transformedConcatenatedName.append(charsOfA[i]);
        }

        transformedConcatenatedName.append(" ");

        char[] charsOfB = B.toCharArray();
        transformedConcatenatedName.append(String.valueOf(charsOfB[0]).toUpperCase());
        for (int i = 1; i < B.length(); i++) {
            transformedConcatenatedName.append(charsOfB[i]);
        }

        System.out.println(A.length() + B.length());
        System.out.println(isLexicographicallyGreater);
        System.out.println(transformedConcatenatedName);
    }
}