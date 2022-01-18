//  author:  ValitovGaziz
//  date:    18.01.2022
//  project: dsa-in-java

import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;

public class NativeJavaSort implements Sorting {

    private final SortingType type = SortingType.NATIVE;
    private final String NAME = "NativeJavaSort";

    private final Functions functions = new Functions();


    public void sort(int[] integers) {

        Calendar timeStart = Calendar.getInstance(); // Measure time start

        innerSort(integers); // Native sort

        Calendar timeEnd = Calendar.getInstance(); // Measure time end

        Map<String, Integer> timeMap = functions.averageTimeSort(this);
                                        // Measure average, max and min time of sorting

        functions.printResult(NAME, integers, timeStart, timeEnd, timeMap); // Print result

    }

    @Override
    public void innerSort(int[] integers) {
        int[] sorted = Arrays.stream(integers).sorted().toArray();
    }
}
