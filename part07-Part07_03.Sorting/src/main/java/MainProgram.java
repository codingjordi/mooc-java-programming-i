
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }

        }

        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallestNumber = smallest(array);
        int smallestNumberIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallestNumber) {
                smallestNumberIndex = i;
            }
        }

        return smallestNumberIndex;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallestNumber = table[startIndex];
        int smallestNumberIndex = startIndex;

        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallestNumber) {
                smallestNumber = table[i];
                smallestNumberIndex = i;
            }
        }

        return smallestNumberIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int index1NumberContainer = 0;
        int index2NumberContainer = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == index1) {
                index1NumberContainer = array[i];
            }

            if (i == index2) {
                index2NumberContainer = array[i];
            }
        }

        array[index1] = index2NumberContainer;
        array[index2] = index1NumberContainer;

    }

    public static void sort(int[] array) {

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            int indexOfTheSmallest = indexOfSmallestFrom(array, i);

            swap(array, i, indexOfTheSmallest);

            System.out.println(Arrays.toString(array));
        }
    }
}
