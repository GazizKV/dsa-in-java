

//  author:  ValitovGaziz
//  date:    12.01.2022
//  project: dsa-in-java

public class Functions {

    public static void swapValues(int[] array, int x, int y) {
        int swap;
        swap = array[y];
        array[y] = array[x];
        array[x] = swap;
    }

    public static int minVal(int[] array, int from, int to) {
        int result = Integer.MIN_VALUE;
        int resultIndex = 0;
        for (int i = from; i < to; i++) {
            if (result < array[i]) {
                result = array[i];
                resultIndex = i;
            }
        }
        return resultIndex;
    }

    public static void printArray(int[] array) {
        int arrayLength = array.length;
        if (array.length < 50) {
            for (int j : array) {
                System.out.print(j + " ");
            }
            System.out.println("\nArray length equal to " + array.length);
        } else {
            for (int i = 0; i < 10; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println("\nNumber of values equal to " + array.length);
            // Print last 10 values from integers array
            for (int i = 0; i < 10; i++) {
                System.out.print(array[arrayLength - 1 - i] + " ");
            }
        }
    }
}
