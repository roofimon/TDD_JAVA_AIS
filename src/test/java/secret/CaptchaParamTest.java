package secret;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Created by oo8 on 7/6/2017 AD.
 */
@RunWith(JUnitParamsRunner.class)
public class CaptchaParamTest {
    @Test
    @Parameters({
            "1, 1, 1, 1, One + 1",
            "1, 9, 2, 8, Nine * 8",
            "2, 1, 1, 1, 1 + One",
            "2, 8, 3, 6, 8 - Six"
    })
    public void test(int pattern, int left, int operator, int right, String expected) {
        Captcha captcha = new Captcha(pattern, left, operator, right);
        assertEquals(expected, captcha.getCaptchaResult());
    }
}
