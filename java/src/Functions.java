//  author:  ValitovGaziz
//  date:    12.01.2022
//  project: dsa-in-java

public class Functions {

    public static void swap(int[] array, int x, int y) {
        int swap;
        swap = array[y];
        array[y] = array[x];
        array[x] = swap;
    }

    public static int minVal(int[] array, int from, int to) {
        int result = Integer.MIN_VALUE;
        int resultIndex = 0;
        for (int i = from; i < to; i++) {
            if(result < array[i]) {
                result = array[i];
                resultIndex = i;
            }
        }
        return resultIndex;
    }
}
