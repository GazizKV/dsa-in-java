//  author:  ValitovGaziz
//  date:    18.01.2022
//  project: dsa-in-java

import java.util.Arrays;
import java.util.Calendar;

public class NativeJavaSort {

    private static final String NAME = "NativeJavaSort";

    public static void sort(int[] integers) {

        Calendar timeStart = Calendar.getInstance(); // Measure time start

        int[] sorted = Arrays.stream(integers).sorted().toArray(); // Native sort

        Calendar timeEnd = Calendar.getInstance(); // Measure time end

        Functions.printResult(NAME, sorted, timeStart, timeEnd); // Print result

    }

}
