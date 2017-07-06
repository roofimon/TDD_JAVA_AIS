package secret;

import java.util.Random;

/**
 * Created by oo8 on 7/6/2017 AD.
 */
public class RandomFactory {
    Random random;
    public RandomFactory(Random myRandom) {
        this.random = myRandom;
    }

    public int pattern() {
        //this.random.nextInt(2);
        return this.random.nextInt(2);
    }
}
