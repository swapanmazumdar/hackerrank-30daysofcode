import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Day26_NestedLogic_Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        if(line1.equals(line2)) {
            System.out.println(0);
            return;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d M y");
        LocalDate actualReturnLocalDate = LocalDate.parse(line1, formatter);
        LocalDate expectedReturnLocalDate = LocalDate.parse(line2, formatter);

        System.out.println(calculateFine(actualReturnLocalDate, expectedReturnLocalDate));
    }

    private static long calculateFine(LocalDate actualReturnDate, LocalDate expectedReturnDate) {
        long fine = 0;
        long diffDays = ChronoUnit.DAYS.between(expectedReturnDate, actualReturnDate);
        long diffMonths = ChronoUnit.MONTHS.between(expectedReturnDate, actualReturnDate);
        long diffYear = ChronoUnit.YEARS.between(expectedReturnDate, actualReturnDate);

        // check boundary case
        if(actualReturnDate.compareTo(expectedReturnDate) < 0) {
            return 0;
        }

        if (actualReturnDate.getYear() <= expectedReturnDate.getYear()) {
            if (actualReturnDate.getMonthValue() <= expectedReturnDate.getMonthValue()) {
                if (diffDays >= 0) {
                    fine = 15 * diffDays; // If the book is returned after the expected return day but still within the same calendar month and year as the expected return date
                }
            } else {
                // If the book is returned after the expected return month but still within the same calendar year as the expected return date
                fine = 500 * diffMonths;
            }
        } else {
            fine = 10000; //If the book is returned after the calendar year in which it was expected, there is a fixed fine
        }
        return fine;
    }
}
