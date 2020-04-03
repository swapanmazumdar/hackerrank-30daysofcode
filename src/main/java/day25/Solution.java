package day25;

import java.util.Scanner;

public class Solution {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(isPrimeWorst(scanner.nextInt()));
        }
    }

    private static String isPrimeWorst(int n) {
        if(n == 1 )
            return "Not prime";
        if(n ==2 || n == 3)
            return "Prime";
        for (int i = 2; i * i <= n; i++) {
            //if divisible
            if (n % i == 0)
                return "Not prime";
        }
        return "Prime";
    }

}