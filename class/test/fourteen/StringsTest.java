package fourteen;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class StringsTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void compareString() {
        String name = "John";
        String beloved = "John";
        assertTrue(name == beloved);

        String disciple = new String("John");
        assertFalse(name == disciple);

        assertTrue(name.equals(beloved));
        assertTrue(name.equals(disciple));

        String apostle = "JOHN";
        assertFalse(name == apostle);
        assertTrue(name.equalsIgnoreCase(apostle));

        /*System.out.println(name.hashCode());
        System.out.println(beloved.hashCode());
        System.out.println(System.identityHashCode(name));
        System.out.println(System.identityHashCode(beloved));*/
    }

    @Test
    void regEx() {
        String name = "Sunkanmi";
        String pattern = "[A-Z][a-z]*";
        boolean result = name.matches(pattern);
        assertTrue(result);

        /*Pattern pentaxPattern = Pattern.compile("[A-Z]");
        Mather mather - new*/
    }
}