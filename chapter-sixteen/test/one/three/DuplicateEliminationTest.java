package one.three;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateEliminationTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void readFirstNames_array() {
        String[] uniqueFirstNames =
                DuplicateElimination.readFirstNames_array("Ayodele", "Damilola", "Ayodele");
        for(String n : uniqueFirstNames) {
            System.out.println(n);
        }
        assertEquals(2, uniqueFirstNames.length);
    }

    @Test
    void readFirstNames_set() {
        String[] uniqueFirstNames =
                DuplicateElimination.readFirstNames_set("Ayodele", "Damilola", "Ayodele");
        for(String n : uniqueFirstNames) {
            System.out.println(n);
        }
        assertEquals(2, uniqueFirstNames.length);
    }
}