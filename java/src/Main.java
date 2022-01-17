//  author:  ValitovGaziz
//  date:    09.01.2022
//  project: dsa-in-java

public class Main {
    public static void main(String[] args) {

        int LengthArrayForSorting = 10000;

/*
        int length = 50;
        int rangeFrom = 0;
        int rangeTo = 100;
*/

        Merge.sort(Functions.generate(LengthArrayForSorting));

        Quick.sort(Functions.generate(LengthArrayForSorting));

        Selection.sort(Functions.generate(LengthArrayForSorting));

        Insertion.sort(Functions.generate(LengthArrayForSorting));

        Comb.sort(Functions.generate(LengthArrayForSorting));

        Shaker.sort(Functions.generate(LengthArrayForSorting));

        Bubble.sort(Functions.generate(LengthArrayForSorting));
    }
}
