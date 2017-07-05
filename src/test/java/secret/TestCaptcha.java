package secret;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by oo8 on 7/5/2017 AD.
 */
public class TestCaptcha {
    private final int DUMMY_OPERATOR = 1;
    private final int DUMMY_RIGHT = 1;
    private final int DUMMY_LEFT = 1;
    private final int DUMMY_PATTERN = 1;

    @Test
    public void firstPatternLeftOperandShouldBeOne() {
        Captcha captcha = new Captcha(1, 1, DUMMY_OPERATOR, DUMMY_RIGHT);
        assertEquals("One", captcha.getLeft());
    }
    @Test
    public void firstPatternLeftOperandShouldBeTwo(){
        Captcha captcha = new Captcha(1, 2, DUMMY_OPERATOR ,DUMMY_RIGHT);
        assertEquals("Two", captcha.getLeft());
    }

    @Test
    public void firstPatternLeftOperandShouldBeNine(){
        Captcha captcha = new Captcha(1,9,DUMMY_OPERATOR,DUMMY_RIGHT);
        assertEquals("Nine",captcha.getLeft());
    }

    @Test
    public void firstPatternRightOperandShouldBe1(){
        Captcha captcha = new Captcha(1, DUMMY_LEFT,DUMMY_OPERATOR,1);
        assertEquals("1", captcha.getRight());
    }

    @Test
    public void firstPatternRightOperandShouldBe9(){
        Captcha captcha = new Captcha(1, DUMMY_LEFT, DUMMY_OPERATOR,9);
        assertEquals("9", captcha.getRight());
    }

    @Test
    public void firstPatternRightOperandShouldBe5(){
        Captcha captcha = new Captcha(1, DUMMY_LEFT, DUMMY_OPERATOR, 5);
        assertEquals("5", captcha.getRight());
    }

    @Test
    public void operatorShouldBePlus(){

        Captcha captcha = new Captcha(DUMMY_PATTERN,DUMMY_LEFT,1,DUMMY_RIGHT);
        assertEquals("+",captcha.getOperator());
    }

    @Test
    public void operatorShouldBeMinus(){
        Captcha captcha = new Captcha(DUMMY_PATTERN,DUMMY_LEFT,3,DUMMY_RIGHT);
        assertEquals("-",captcha.getOperator());
    }

    @Test
    public void operatorShouldBeMultiple(){
        Captcha captcha = new Captcha(DUMMY_PATTERN,DUMMY_LEFT,2,DUMMY_RIGHT);
        assertEquals("*",captcha.getOperator());
    }

    @Test
    public void secondPatternLeftOperandShouldBe1(){
        Captcha captcha = new Captcha(2,1,DUMMY_OPERATOR,DUMMY_RIGHT);
        assertEquals("1",captcha.getLeft());
    }

    @Test
    public void secondPatternLeftOperandShouldBe6(){
        Captcha captcha = new Captcha(2,6,DUMMY_OPERATOR,DUMMY_RIGHT);
        assertEquals("6",captcha.getLeft());
    }

    @Test
    public void secondPatternLeftOperandShouldBe9(){
        Captcha captcha = new Captcha(2,9,DUMMY_OPERATOR,DUMMY_RIGHT);
        assertEquals("9",captcha.getLeft());
    }

    @Test
    public void secondPatternRightOperandShouldBeOne(){
        Captcha captcha = new Captcha(2,DUMMY_LEFT,DUMMY_OPERATOR,1);
        assertEquals("One",captcha.getRight());
    }

    @Test
    public void secondPatternRightOperandShouldBeNine(){
        Captcha captcha = new Captcha(2,DUMMY_LEFT,DUMMY_OPERATOR,9);
        assertEquals("Nine",captcha.getRight());
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
