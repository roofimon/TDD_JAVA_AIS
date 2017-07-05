package secret;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by oo8 on 7/5/2017 AD.
 */
public class IntegerOperandTest {
    @Test
    public void itShouldBe1() {
        IntegerOperand integerOperand = new IntegerOperand(1);
        assertEquals("1", integerOperand.toString());
    }
    @Test
    public void itShouldBe9() {
        IntegerOperand integerOperand = new IntegerOperand(9);
        assertEquals("9", integerOperand.toString());
    }
}
