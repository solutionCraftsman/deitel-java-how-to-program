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
    void testMinimum3(){
        FindTheMinimum findTheMinimum = new FindTheMinimum();
        assertEquals(30.50, findTheMinimum.minimum3(45.03, 30.50, 50.65));
    }
}