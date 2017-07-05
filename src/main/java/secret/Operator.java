package secret;

/**
 * Created by oo8 on 7/5/2017 AD.
 */
public class Operator {
    private int value;
    public Operator(int i) {
        this.value = i;
    }
    public String toString() {
        if(this.value == 1)
            return "+";
        if(this.value == 2)
            return "*";
        return "-";
    }
}
