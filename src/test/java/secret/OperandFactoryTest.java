package secret;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by oo8 on 7/6/2017 AD.
 */
public class OperandFactoryTest {
    @Test public void firstPatternCreateStringOperandForLeft() {
        assertTrue(OperandFactory.createLeft(1, 1) instanceof StringOperand);
    }
    @Test public void firstPatternCreateIntegerOperandForRight() {
        assertTrue(OperandFactory.createRight(1, 5) instanceof IntegerOperand);
    }
    @Test public void secondPatternCreateIntegerOperandForLeft() {
        assertTrue(OperandFactory.createLeft(2, 9) instanceof IntegerOperand);
    }
    @Test public void secondPatternCreateStingOperandForRight(){
        assertTrue(OperandFactory.createRight(2, 8) instanceof StringOperand);
    }
}
