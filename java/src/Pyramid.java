//  author:  ValitovGaziz
//  date:    18.01.2022
//  project: dsa-in-java

import java.util.Arrays;
import java.util.Calendar;
import java.util.TreeSet;

public class Pyramid {

    private static final String NAME = "Pyramid";

    public static void sort(int[] integers) {

        Calendar timeStart = Calendar.getInstance(); // Measure time start

        TreeSet<Integer> treeSet = new TreeSet<>();
        Arrays.stream(integers).forEach(treeSet::add);
        int i = 0;
        for (Integer integer :
                treeSet) {
            integers[i++] = integer;
        }

        Calendar timeEnd = Calendar.getInstance(); // Measure time end

        Functions.printResult(NAME, integers, timeStart, timeEnd); // Print result

    }

}
