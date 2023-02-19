import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SomeClassTest {

    private SomeClass testee;

    @BeforeEach
    void setUp() {
        testee = new SomeClass();
    }

    @Test
    //[ -5, -1, -2, 3, 8, 10]
    void somePositiveTestCase1(){
        ArrayList testArray = new ArrayList<Integer>();
        testArray.add(-5);
        testArray.add(-1);
        testArray.add(-2);
        testArray.add(3);
        testArray.add(8);
        testArray.add(10);
        int result = testee.getIndex(testArray, 3);
        assertTrue(result == 3);
    }

    @Test
    void someNegativeTestCase1(){
        ArrayList testArray = new ArrayList<Integer>();
        testArray.add(-5);
        testArray.add(-1);
        testArray.add(-2);
        testArray.add(3);
        testArray.add(8);
        testArray.add(10);
        int result = testee.getIndex(testArray, -8);
        assertTrue(result == -1);
    }
}