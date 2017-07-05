package secret;

/**
 * Created by oo8 on 7/5/2017 AD.
 */
public class IntegerOperand extends Operand {
    public IntegerOperand(int i) {
        super(i);
    }
    public String toString() {
        return String.valueOf(this.value);
    }
}
