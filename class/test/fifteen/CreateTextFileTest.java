package fifteen;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class CreateTextFileTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void openFile() {
        String filePath = "/home/ayodele/Semicolon Africa/temp.txt";
        CreateTextFile.openFile(filePath);
        Path path = Paths.get(filePath);

        assertTrue(Files.exists(path));
    }

}