package two.three;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheMinimumTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testMinimum3() {
        FindTheMinimum findTheMinimum = new FindTheMinimum();

        findTheMinimum.setFirstNumber(findTheMinimum.readInput());
        findTheMinimum.setSecondNumber(findTheMinimum.readInput());
        findTheMinimum.setThirdNumber(findTheMinimum.readInput());
        //45.03, 30.50, 50.65
        assertEquals(30.50, findTheMinimum.minimum3());
    }
}

