//  author:  ValitovGaziz
//  date:    18.01.2022
//  project: dsa-in-java

import java.util.*;

public class Pyramid implements Sorting {

    private final SortingType type = SortingType.PYRAMID;
    private final String NAME = "Pyramid";

    private final Functions functions = new Functions();


    public void sort(int[] integers) {

        Calendar timeStart = Calendar.getInstance(); // Measure time start

        innerSort(integers); // Sort

        Calendar timeEnd = Calendar.getInstance(); // Measure time end

        Map<String, Integer> timeMap = functions.averageTimeSort(this); // Measure average, max and min time sort

        functions.printResult(NAME, integers, timeStart, timeEnd, timeMap); // Print result

    }

    @Override
    public int[] innerSort(int[] integers) {

        int length = integers.length;

        for (int i = length / 2 - 1; i >= 0; i--) {
            heapify(integers, length, i);
        }

        for (int i = length - 1; i > 0; i--) {

            functions.swapValues(integers, 0, i);

            heapify(integers, i, 0);
        }

        return integers;

    }

    void heapify(int[] integers, int length, int i) {

        int largest = i;

        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < length && integers[left] > integers[largest]) largest = left;

        if (right < length && integers[right] > integers[largest]) largest = right;

        if (largest != i) {

            functions.swapValues(integers, i, largest);

            heapify(integers, length, largest);

        }

    }

}
