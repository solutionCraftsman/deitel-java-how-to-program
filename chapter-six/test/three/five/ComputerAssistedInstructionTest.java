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

    @Test
    void testThat_programCan_promptUserWithAQuestion() {
        computerAssistedInstruction.generateRandomNumbers();
        int firstRandomNumber = computerAssistedInstruction.getFirstRandomNumber();
        int secondRandomNumber = computerAssistedInstruction.getSecondRandomNumber();

        assertEquals("How much is " + firstRandomNumber + " times " +
                secondRandomNumber, computerAssistedInstruction.getQuestion());
    }

    @Test
    void testThat_studentCan_inputAnswer() {
        computerAssistedInstruction.getQuestionAndInputAnswer();
        assertEquals(0, computerAssistedInstruction.getStudentAnswer());

        computerAssistedInstruction.generateRandomNumbers();
        computerAssistedInstruction.getQuestionAndInputAnswer();
        assertEquals(computerAssistedInstruction.getFirstRandomNumber() *
                        computerAssistedInstruction.getSecondRandomNumber(),
                computerAssistedInstruction.getStudentAnswer());
    }

    @Test
    void testThat_programCanCheck_theStudentsAnswer() {
        computerAssistedInstruction.generateRandomNumbers();
        computerAssistedInstruction.getQuestionAndInputAnswer();
        assertEquals("No. Please try again.", computerAssistedInstruction.getQuestionFeedback());

        computerAssistedInstruction.getQuestionAndInputAnswer();
        assertEquals("Very good!", computerAssistedInstruction.getQuestionFeedback());
    }

    @Test
    void testThat_programRetains_orChangesQuestion_basedOnStudentsAnswer() {
        computerAssistedInstruction.generateRandomNumbers();
        String firstQuestion = computerAssistedInstruction.getQuestion();
        computerAssistedInstruction.getQuestionAndInputAnswer();
        computerAssistedInstruction.checkStudentsAnswer();

        String secondQuestion = computerAssistedInstruction.getQuestion();
        assertEquals(firstQuestion, secondQuestion);
        computerAssistedInstruction.getQuestionAndInputAnswer();
        computerAssistedInstruction.checkStudentsAnswer();

        firstQuestion = computerAssistedInstruction.getQuestion();
        assertNotEquals(firstQuestion, secondQuestion);
    }


}