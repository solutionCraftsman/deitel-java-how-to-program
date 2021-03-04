package one.six;

import one.four.CountingLetters;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountingDuplicateWordsTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void count() {
        HashMap<String, Integer> count = CountingDuplicateWords.count("HELLO THERE HELLO THERE");

        Set<String> uniqueWords = count.keySet();

        assertEquals(2, uniqueWords.size());

        /*while (keys.hasNext()) {
            char key = keys.next();
            int frequency = count.get(key);
            System.out.println(key + " : " + frequency);
        }*/

        for (String key : uniqueWords) {
            int frequency = count.get(key);
            System.out.println(key + " : " + frequency);
        }
    }
}