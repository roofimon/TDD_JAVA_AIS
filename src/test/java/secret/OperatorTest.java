package secret;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by oo8 on 7/5/2017 AD.
 */
public class OperatorTest {
    @Test
    public void itShouldBePlus(){
        Operator operator = new Operator(1);
        assertEquals("+", operator.toString());
    }

    @Test
    public void itShouldBeMultiply() {
        Operator operator = new Operator(2);
        assertEquals("*", operator.toString());
    }

    @Test
    public void itShouldBeMinus() {
        Operator operator = new Operator(3);
        assertEquals("-", operator.toString());
    }
}
