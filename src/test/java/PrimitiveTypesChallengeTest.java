import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class PrimitiveTypesChallengeTest {

    @Test
    public void primitivesChallengeTest() {
        // Step 0: Test IDE
        //fail("Not Implemented");

        // Step 1: Setup
        byte myByteVariable = 8;
        short myShortVariable = 100;
        int myIntVariable = 1200;
        long myLongVariable = (long) (5000 + (10* (myByteVariable + myShortVariable + myIntVariable)));
        PrimitiveTypesChallenge ptc = new PrimitiveTypesChallenge();

        // Step 2: Exercises

        // Step 3: Assert
        assertEquals(ptc.sum(myByteVariable, myShortVariable, myIntVariable), myLongVariable);

        // Step 4: Teardown
    }
}
