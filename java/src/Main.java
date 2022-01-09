//  author:  ValitovGaziz
//  date:    09.01.2022
//  project: dsa-in-java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
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
        List<Integer> list = Arrays.stream(readLine.split(" ")).map(Integer::parseInt).toList();


        Bubble.sort(getArrayFromList(list));

        ShakerSorting.sort(getArrayFromList(list));
    }

    public static int[] getArrayFromList(List list) {
        int[] integers = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            integers[i] = (int) list.get(i);
        }
        return integers;
    }
}
