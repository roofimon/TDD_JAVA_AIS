package secret;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Created by oo8 on 7/5/2017 AD.
 */
public class CaptchaTest {
    private final int DUMMY_OPERATOR = 1;
    private final int DUMMY_RIGHT = 1;
    private final int DUMMY_LEFT = 1;
    private final int DUMMY_PATTERN = 1;

    @Test
    public void leftShouldBeInstanceOfOperand() {
        Captcha captcha = new Captcha(DUMMY_PATTERN, DUMMY_LEFT, DUMMY_OPERATOR,DUMMY_RIGHT);
        assertEquals(StringOperand.class, captcha.getLeft().getClass());
    }
    @Test
    public void rightShouldBeInstanceOfOperand() {
        Captcha captcha = new Captcha(2, DUMMY_LEFT, DUMMY_OPERATOR,DUMMY_RIGHT);
        assertEquals(IntegerOperand.class, captcha.getLeft().getClass());
    }

    @Test
    public void operatorShouldBeInstanceOfOperator() {
        Captcha captcha = new Captcha(DUMMY_PATTERN, DUMMY_LEFT, DUMMY_OPERATOR, DUMMY_RIGHT);
        //assert that captcha.getOperator should be instance of Operator
        assertEquals(Operator.class, captcha.getOperator().getClass());
    }

    @Test
    public void getCaptcha1111ShouldBeOnePlus1(){
        Captcha captcha = new Captcha(1,1,1,1);
        assertEquals("One + 1" ,captcha.getCaptchaResult());
    }

    @Test
    public void getCaptcha1211ShouldBeTwoPlus1(){
        Captcha captcha = new Captcha(1,2,1,1);
        assertEquals("Two + 1",captcha.getCaptchaResult());
    }

    @Test
    public void getCaptcha2131ShouldBe1MinusOne(){
        Captcha captcha = new Captcha(2,1,3,1);
        assertEquals("1 - One", captcha.getCaptchaResult());
    }
}
