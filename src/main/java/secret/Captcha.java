package secret;

/**
 * Created by oo8 on 7/5/2017 AD.
 */
public class Captcha {
    private int left;
    private int right;
    private int operator;
    private int pattern;
    private final String[] operandArr = new String[]{"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

    public Captcha(int pattern, int left, int operator, int right) {
        this.left = left;
        this.right = right;
        this.operator = operator;
        this.pattern = pattern;
    }

    public String getLeft() {
        if (pattern == 2) {
            return String.valueOf(this.left);
        }
        return operandArr[this.left - 1];
    }

    public String getRight() {
        if (pattern == 2) {
            return operandArr[this.right - 1];
        }
        return String.valueOf(this.right);
    }

    public String getOperator() {
        String[] x = {"+", "*", "-"};
        return x[this.operator - 1];
    }

    public String getCaptchaResult() {
        return String.format("%s %s %s", this.getLeft(), this.getOperator(), this.getRight());
    }
}
