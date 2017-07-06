package secret;

/**
 * Created by oo8 on 7/5/2017 AD.
 */
public class Captcha {
    private Operand left;
    private Operand right;
    private Operator operator;

    public Captcha(int pattern, int left, int operator, int right) {
        this.left = OperandFactory.createLeft(pattern, left);
        this.right = OperandFactory.createRight(pattern, right);
        this.operator = new Operator(operator);
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
