//  author:  ValitovGaziz
//  date:    09.01.2022
//  project: dsa-in-java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter space separated numbers for sorting");
        String readLine = null;
        try {
            readLine = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert readLine != null;
        String[] array = readLine.split(" ");
        int[] integers = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            integers[i] = Integer.parseInt(array[i]);
        }

        System.out.println("Non sorted entered array " + Arrays.toString(integers));
        int num = Integer.MIN_VALUE;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < integers.length - 1; i++) {
                if (integers[i] > integers[i + 1]) {
                    num = integers[i];
                    integers[i] = integers[i + 1];
                    integers[i + 1] = num;
                    isSorted = false;
                }
            }
        }

        System.out.println("Sorted array " + Arrays.toString(integers));

    }
}
