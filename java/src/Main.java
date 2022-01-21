//  author:  ValitovGaziz
//  date:    09.01.2022
//  project: dsa-in-java

public class Main {

    public static int LENGTH = 100000;

    public static int TIMES = 10;

    public static void main(String[] args) {


        Functions functions = new Functions();

        NativeJavaSort nativeJavaSort = new NativeJavaSort();
        nativeJavaSort.sort(functions.generate());

        Pyramid pyramid = new Pyramid();
        pyramid.sort(functions.generate());

        Merge merge = new Merge();
        merge.sort(functions.generate());

        Quick quick = new Quick();
        quick.sort(functions.generate());

        Selection selection = new Selection();
        selection.sort(functions.generate());

        Insertion insertion = new Insertion();
        insertion.sort(functions.generate());

        Comb comb = new Comb();
        comb.sort(functions.generate());

        Shaker shaker = new Shaker();
        shaker.sort(functions.generate());

        Bubble bubble = new Bubble();
        bubble.sort(functions.generate());

    }

}
