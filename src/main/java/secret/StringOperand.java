package secret;

/**
 * Created by oo8 on 7/5/2017 AD.
 */
public class StringOperand extends Operand{
    public StringOperand(int i) {
        super(i);
    }

    public String toString() {
        String[] operandArr = new String[]{"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        return operandArr[this.value - 1];
    }
}
