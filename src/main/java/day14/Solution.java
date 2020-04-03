package day14;

import java.util.Scanner;
import java.util.TreeSet;


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

public class Solution {

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