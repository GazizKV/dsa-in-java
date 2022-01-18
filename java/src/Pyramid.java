//  author:  ValitovGaziz
//  date:    18.01.2022
//  project: dsa-in-java

import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.TreeSet;

public class Pyramid implements Sorting {

    private final SortingType type = SortingType.PYRAMID;
    private final String NAME = "Pyramid";

    private final Functions functions = new Functions();


    public void sort(int[] integers) {

        Calendar timeStart = Calendar.getInstance(); // Measure time start

        innerSort(integers); // Sort

        Calendar timeEnd = Calendar.getInstance(); // Measure time end

        Map<String, Integer> timeMap = functions.averageTimeSort(this);
        // Measure average, max and min time sort

        functions.printResult(NAME, integers, timeStart, timeEnd, timeMap); // Print result

    }

    @Override
    public void innerSort(int[] integers) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        Arrays.stream(integers).forEach(treeSet::add);
        int i = 0;
        for (Integer integer :
                treeSet) {
            integers[i++] = integer;
        }

    }
}
