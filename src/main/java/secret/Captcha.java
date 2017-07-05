package secret;

/**
 * Created by oo8 on 7/5/2017 AD.
 */
public class Captcha {
    private Operand left;
    private Operand right;
    private Operator operator;
    private int pattern;
    private final String[] operandArr = new String[]{"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

    public Captcha(int pattern, int left, int operator, int right) {
        this.left = createLeft(pattern, left);
        this.right = createRight(pattern, right);
        this.operator = new Operator(operator);
        this.pattern = pattern;
    }

    public Operand createLeft(int pattern, int value) {
        if (pattern == 2) {
            return new IntegerOperand(value);
        }
        return new StringOperand(value);
    }

    public Operand createRight(int pattern, int value) {
        if (pattern == 2) {
            return new StringOperand(value);
        }
        return new IntegerOperand(value);
    }

    public Operator getOperator() {
        return this.operator;
    }

    public String getCaptchaResult() {
        return String.format("%s %s %s", this.left, this.getOperator(), this.right);
    }

    public Operand getLeft() {
        return this.left;
    }

    public Object getRight() {
        return this.right;
    }
}
