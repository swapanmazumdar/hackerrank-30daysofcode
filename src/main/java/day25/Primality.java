package day25;

public class Primality {

    private static void printStats(int count, int n, boolean isPrime) {
        String caller = Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.println(caller + " performed " + count + " checks, determined " + n + ((isPrime) ? " is Prime." : " is NOT PRIME."));
    }

    public static boolean isPrimeWorst(int n) {
        int count = 0;
        // 1 is not prime
        if( n == 1 ){
            printStats(++count, n, false);
            return false;
        }

        // return false n is divisible by any i from 2 to n
        int i = 1;
        while( i++ < n - 1 ){
            count++;
            if( n % i == 0 ){
                printStats(++count, n, false);
                return false;
            }
        }

        // n is prime
        printStats(++count, n, true);
        return true;
    }

    /**
     *   O(n^(1/2)) Algorithm
     *    Checks if n is divisible by any number from 2 to sqrt(n).
     *
     *   @param n An integer to be checked for primality.
     *   @return true if n is prime, false if n is not prime.
     **/
    public static boolean isPrimeGood(int n) {
        int count = 0;
        // 1 is not prime
        if( n == 1 ){
            printStats(++count, n, false);
            return false;
        }
        else if( n == 2 ){
            printStats(++count, n, true);
            return true;
        }

        // return false n is divisible by any i from 2 to n
        int i = 1;
        while( i++ < Math.sqrt(n) ){
            System.out.printf("Math.sqrt(%d):%f%n", n, Math.sqrt(n));
            System.out.println(i);
            count++;
            if( n % i == 0 ){
                printStats(++count, n, false);
                return false;
            }
        }

        // n is prime
        printStats(++count, n, true);
        return true;
    }
    /**
     *   Better: O(n) algorithm
     *    Checks if n is divisible by any number from 2 to n/2,
     *    but is asymptotically the same as isPrimeWorst
     *
     *   @param n An integer to be checked for primality.
     *   @return true if n is prime, false if n is not prime.
     **/
    public static boolean isPrimeLessWorst(int n) {
        int count = 0;
        // 1 is not prime
        if( n == 1 ){
            count++;
            printStats(++count, n, false);
            return false;
        }

        int i = 1;
        while(i++ < n / 2) {
            count++;
            if(n % i == 0) {
                count++;
                printStats(++count, n, false);
                return false;
            }
        }

        printStats(++count, n, true);
        return true;
    }

    private static boolean isPrimeBest(int n) {
        int count = 0;
        // check lower boundaries for primality
        if(n == 2) {
            printStats(++count, n, true);
            return true;
        } else if(n ==1 || (n & 1) == 0) { // 1 is not prime, even  numbers are not prime
            printStats(++count, n, false);
            return false;
        }

        // check for primality for odd numbers from 3 to sqrt(n)
        for (int i=3; i<=Math.sqrt(n); i +=2) {
            ++count;
            if(n % i == 0) {
                printStats(++count, n, false);
            }
        }

        printStats(++count, n, true);
        return true;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        //isPrimeGood(2147483647);
        isPrimeBest(2147483647);
        long end = System.currentTimeMillis();
        System.out.printf("Duration: %dms", end - start);
    }
}
