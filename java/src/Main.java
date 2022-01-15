//  author:  ValitovGaziz
//  date:    09.01.2022
//  project: dsa-in-java

public class Main {
    public static void main(String[] args) {

        int LengthArrayForSorting = 10000;

        Quick.sort(Functions.generate(LengthArrayForSorting));

        Selection.sort(Functions.generate(LengthArrayForSorting));

        Insertion.sort(Functions.generate(LengthArrayForSorting));

        Comb.sort(Functions.generate(LengthArrayForSorting));

        ShakerSorting.sort(Functions.generate(LengthArrayForSorting));

        Bubble.sort(Functions.generate(LengthArrayForSorting));
    }
}
