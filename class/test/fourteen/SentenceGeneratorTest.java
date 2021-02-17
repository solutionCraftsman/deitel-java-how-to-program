package fourteen;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SentenceGeneratorTest {

    SentenceGenerator generator;

    @BeforeEach
    void setUp() {
        generator = new SentenceGenerator();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getArticleArray() {
        assertNotNull(generator.getArticles());
        assertEquals(5, generator.getArticles().length);
    }

    @Test
    void generateSentence() {

        for (int i = 1; i <= 20; i++) {
            String sentence = generator.getSentence();
            assertNotNull(sentence);
            assertFalse(sentence.isEmpty());
            System.out.println(sentence);
        }

    }

}