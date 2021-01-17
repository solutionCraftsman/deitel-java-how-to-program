package one.six;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsingTheEnhancedForStatementTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testSumDouble_passedViaCommandLineArguments() {
        UsingTheEnhancedForStatement.main("9.5", "20.5", "30.5");
        assertEquals(60.5, UsingTheEnhancedForStatement.getSum());
    }
}