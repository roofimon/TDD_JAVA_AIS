package secret;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Created by oo8 on 7/5/2017 AD.
 */
public class CaptchaTest {
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
