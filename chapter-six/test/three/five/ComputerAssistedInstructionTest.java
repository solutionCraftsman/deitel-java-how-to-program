package three.five;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerAssistedInstructionTest {

    ComputerAssistedInstruction computerAssistedInstruction;

    @BeforeEach
    void setUp() {
        computerAssistedInstruction = new ComputerAssistedInstruction();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThat_programCanProduce_twoPositiveOneDigitIntegers() {
        computerAssistedInstruction.generateRandomNumbers();
        int firstRandomNumber = computerAssistedInstruction.getFirstRandomNumber();
        int secondRandomNumber = computerAssistedInstruction.getSecondRandomNumber();

        assertTrue(firstRandomNumber > 0 && firstRandomNumber < 10);
        assertTrue(secondRandomNumber > 0 && secondRandomNumber < 10);
    }


}