package seven;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PigLatinTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getLatinWord() {
        assertEquals("umpjay", PigLatin.getLatinWord("jump"));
    }

    @Test
    void encodePhrase() {
        assertEquals("eHay siay umpingjay",
                PigLatin.encodePhrase("He is jumping"));
    }
}