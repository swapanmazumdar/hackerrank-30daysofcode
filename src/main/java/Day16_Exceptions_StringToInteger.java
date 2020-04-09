import java.util.Scanner;

public class Day16_Exceptions_StringToInteger {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        try {
            System.out.println(Integer.parseInt(s));
        } catch (NumberFormatException nfe) {
            System.out.println("Bad String");
        }
    }
}