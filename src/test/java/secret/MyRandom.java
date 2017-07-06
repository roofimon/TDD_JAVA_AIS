package secret;

import java.util.Random;

/**
 * Created by oo8 on 7/6/2017 AD.
 */
public class MyRandom extends Random {
    private int counter = 0;
    private int bound = 0;
    @Override
    public int nextInt(int max){
        this.bound = max;
        this.counter++;
        return 0;
    }

    public int getCounter() {
        return this.counter;
    }

    public int getBound() {
        return this.bound;
    }

    public boolean verifyThatNextIntHaveBeenCalledOnceWithMax2() {
        return (this.counter==1)&&(this.bound==2);
    }
}
