//  author:  ValitovGaziz
//  date:    09.01.2022
//  project: dsa-in-java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
        String[] array = readLine.split(" ");
        int[] integers = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            integers[i] = Integer.parseInt(array[i]);
        }

        Bubble.sort(integers);
    }
}
