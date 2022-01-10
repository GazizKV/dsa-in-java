//  author:  ValitovGaziz
//  date:    09.01.2022
//  project: dsa-in-java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int LengthArrayForSorting = 10000;

        Comb.sort(RandomArrayGenerator.generate(LengthArrayForSorting));

        ShakerSorting.sort(RandomArrayGenerator.generate(LengthArrayForSorting));

        Bubble.sort(RandomArrayGenerator.generate(LengthArrayForSorting));
    }

}
