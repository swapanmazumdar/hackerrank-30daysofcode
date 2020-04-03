package day11;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //int[][] arr = new int[6][6];
        /*int[][] arr = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }*/

        int[][] arr = {
                {-1, -1, 0, -9, -2, -2},
                {-2, -1, -6, -8, -2, -5},
                {-1, -1, -1, -2, -3, -4},
                {-1, -9, -2, -4, -4, -5},
                {-7, -3, -3, -2, -9, -9},
                {-1, -3, -1, -2, -4, -5}
        };
        int rows = arr.length;
        int cols = arr.length;

        int[] sums = new int[16];
        boolean firstTime = true;
        int k = 0;
        for (int i = 0; i <= rows / 2; i++) {
            for (int j = 0; j <= cols / 2; j++) {
                sums[k] = parseHourGlass(i, j, arr);
                k++;
            }
        }
        Arrays.sort(sums);
        System.out.println(sums[15]);
        scanner.close();
    }

    private static int parseHourGlass(int baseRow, int baseCol, int[][] arr) {
        int[][] hourGlassArr = new int[3][3]; // parsed hourglass array

        int i = 0;
        for (int row = baseRow; row < baseRow + 3; row++) {
            int j = -1;
            for (int col = baseCol; col < baseCol + 3; col++) {
                hourGlassArr[i][++j] = arr[row][col];
            }
            i++;
        }

        int sum = calculateHourGlassSum(hourGlassArr);
        return sum;
    }

    private static int calculateHourGlassSum(int[][] hourGlassArr) {
        int sum = 0;
        for (int row = 0; row < hourGlassArr.length; row++) {
            for (int col = 0; col < hourGlassArr[row].length; col++) {
                if(row % 2 != 0 && col % 2 ==0) {
                    continue;
                }
                sum += hourGlassArr[row][col];
            }
        }
        return sum;
    }
}
