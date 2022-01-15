//  author:  ValitovGaziz
//  date:    14.01.2022
//  project: dsa-in-java

public class Merge {

    public static void sort(int[] integers) {
        int arrayLength = integers.length;
        if(arrayLength < 2) {
            System.out.println("Array length is too short");
            return;
        }
        int[] secondArray = new int[arrayLength];
        if (arrayLength % 2 != 0) {

        } else {
            int arrayBinValue = arrayLength / 2;
            int step = 2;
            for (int i = 0; i < arrayBinValue; i = i + step) {
                for (int j = i; j < step; j++) {

                }
                step *= 2;
            }
        }



        if (Functions.checkSortedArray(integers)) {
            System.out.println("Array sorted right");
        } else {
            System.out.println("Array sorted not right");
        }
    }
}
