package printing;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.print.*;

import static org.junit.jupiter.api.Assertions.*;

class PrintTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void printJob() {

        String data = "Print this Job NOW!!!";
        Print.print(data);

    }

    @Test
    void printListOfPrinters() {

        Print.printListOfPrinters();

    }

}