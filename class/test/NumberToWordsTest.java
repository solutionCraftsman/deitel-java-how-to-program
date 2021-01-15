import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberToWordsTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThat_programCan_convertNumbersToWords() {
        NumberToWords numberToWords = new NumberToWords();
        String numberInWords = numberToWords.convert(362);
        assertEquals("Three Hundred and Sixty Two", numberInWords);

        numberInWords = numberToWords.convert(360);
        //assertEquals("Three Hundred and Sixty", numberInWords);

        numberInWords = numberToWords.convert(300);
        //assertEquals("Three Hundred", numberInWords);

        numberInWords = numberToWords.convert(201);
        //assertEquals("Two Hundred and One", numberInWords);
    }
}