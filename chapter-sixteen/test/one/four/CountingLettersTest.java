package one.four;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CountingLettersTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void count() {
        HashMap<Character, Integer> count = CountingLetters.count("HELLO THERE");

        Set<Character> uniqueCharacters = count.keySet();

        assertEquals(6 + 1, uniqueCharacters.size());

        /*while (keys.hasNext()) {
            char key = keys.next();
            int frequency = count.get(key);
            System.out.println(key + " : " + frequency);
        }*/

        for (char key : uniqueCharacters) {
            int frequency = count.get(key);
            System.out.println(key + " : " + frequency);
        }
    }
}