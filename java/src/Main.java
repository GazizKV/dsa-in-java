//  author:  ValitovGaziz
//  date:    09.01.2022
//  project: dsa-in-java

public class Main {

    public static int LENGTH = 10000;

    public static int TIMES = 100;

    public static void main(String[] args) {



        int length = 100;
        int rangeFrom = 0;
        int rangeTo = 1000000;


        NativeJavaSort.sort(Functions.generate(LENGTH));

        Pyramid.sort(Functions.generate(LENGTH));

        Merge.sort(Functions.generate(LENGTH));

        Quick.sort(Functions.generate(LENGTH));

        Selection.sort(Functions.generate(LENGTH));

        Insertion.sort(Functions.generate(LENGTH));

        Comb.sort(Functions.generate(LENGTH));

        Shaker.sort(Functions.generate(LENGTH));

        Bubble.sort(Functions.generate(LENGTH));
    }
}
