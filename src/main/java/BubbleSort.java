import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

    private static int[] bubbleSort(int[] intArray) {

        int loopRemaining = intArray.length;

        int numberOfSwaps = 0;

        while(loopRemaining > 0) {
            for (int i = 0; i < intArray.length - 1; i++) {
                int temp = intArray[i];
                if (temp > intArray[i + 1]) {
                    int swapPosition = i;
                    int swapValue = intArray[i + 1];
                    intArray[i + 1] = temp;
                    intArray[i] = swapValue;

                    i = swapPosition;
                    numberOfSwaps++;
                }
            }
            loopRemaining--;

        }
        System.out.println("Number of swaps " + numberOfSwaps);
        return intArray;
    }

    public static void main(String[] args) {
        Random random = new Random();
        /*for (int i = 0; i < 100; i++) {
            System.out.print(random.nextInt(100) + ", ");
        }*/
        int[] unsorted = new int[]{41, 94, 87, 66, 39, 93, 25, 96, 46, 81, 9, 69, 1, 81, 70, 12, 10, 46, 65, 80, 90, 14, 89, 58, 22, 17, 58, 23, 26, 5, 46, 77, 51, 18, 43, 7, 37, 4, 90, 47, 4, 2, 49, 28, 88, 83, 53, 0, 43, 26, 35, 34, 48, 70, 88, 93, 83, 4, 76, 43, 38, 59, 75, 57, 8, 99, 0, 68, 33, 2, 91, 0, 89, 8, 42, 49, 30, 21, 85, 64, 80, 77, 38, 76, 52, 63, 88, 66, 5, 23, 32, 30, 80, 35, 27, 15, 11, 41, 27, 35};
        bubbleSort(unsorted);
        for (int i : unsorted) {
            System.out.print(i + " ");
        }
    }
}
