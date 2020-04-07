import java.util.Scanner;

public class Day10_BinaryNumbers_Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String binaryString = Integer.toBinaryString(n);
        String [] splits = binaryString.split("0");
        int largest1sArray = 0;
        for(String split : splits) {
            if(split.length() > largest1sArray) {
                largest1sArray = split.length();
            }
        }
        System.out.println(largest1sArray);
        scanner.close();
    }
}
