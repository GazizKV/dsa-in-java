//  author:  ValitovGaziz
//  date:    10.01.2022
//  project: dsa-in-java

import java.util.Random;
import java.util.random.RandomGenerator;

public class RandomArrayGenerator {

    private static final Random random = new Random();

    public static int[] generate(int length) {
        int[] randomIntegersArray = new int[length];
        for (int i = 0; i < length; i++) {
            randomIntegersArray[i] = random.nextInt();
        }
        return randomIntegersArray;
    }
}
