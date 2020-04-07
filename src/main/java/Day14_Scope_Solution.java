import java.util.Scanner;
import java.util.TreeSet;


/**
 * Complete the Difference class by writing the following:
 *
 * A class constructor that takes an array of integers as a parameter and saves it to the elements instance variable.
 * A computeDifference method that finds the maximum absolute difference between any 2 numbers in N and stores it in the
 * instance variable.
 */
class Difference {
    private int[] elements;
    public int maximumDifference; // not a good idea to declare member variable with public access modifier

    Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeMaximumDifference() {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i : elements) {
            set.add(i);
        }
        maximumDifference = Math.abs(set.first() - set.last());
    }
    // Add your code here

} // End of Difference class

public class Day14_Scope_Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeMaximumDifference();

        System.out.print(difference.maximumDifference);
    }
}