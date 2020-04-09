import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day28_RegexPatterns_Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        ArrayList<String> list = new ArrayList();
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");
            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];

            String regex = "\\A[\\w+@]+gmail.com";
            Pattern pattern = Pattern.compile(regex);
            Matcher m = pattern.matcher(emailID);

            if (m.find()) {
                list.add(firstName);
            }
        }
        Collections.sort(list);
        list.stream().forEach(System.out::println);

        scanner.close();
    }
}
