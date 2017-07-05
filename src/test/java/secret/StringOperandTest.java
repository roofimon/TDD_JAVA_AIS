package secret;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by oo8 on 7/5/2017 AD.
 */
public class StringOperandTest {
    @Test
    public void itShouldBeOne() {
        StringOperand stringOperand = new StringOperand(1);
        assertEquals("One", stringOperand.toString());
    }

    @Test
    public void itShouldBeNine() {
        StringOperand stringOperand = new StringOperand(9);
        assertEquals("Nine", stringOperand.toString());
    }
}
