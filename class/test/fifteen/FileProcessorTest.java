package fifteen;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.*;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class FileProcessorTest {

    String filePath;

    @BeforeEach
    void setUp() {
        filePath = "/home/ayodele/Semicolon Africa/temp/pentax.txt";
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void isValidPathWithNullPath() {
        assertThrows(FileNotFoundException.class,
                () -> FileProcessor.isValidPath(null));
    }

    @Test
    void isValidPathWitEmptyPath() {
        assertThrows(FileNotFoundException.class,
                () -> FileProcessor.isValidPath(""));
    }

    @Test
    void isValidPath() {
        try {
            boolean result = FileProcessor.isValidPath(filePath);
            assertTrue(result);
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    @Test
    void isValidPathWithInvalidPath() {
        filePath = "/home/fakePath.txt";

        assertThrows(FileNotFoundException.class,
                () -> FileProcessor.isValidPath(filePath));
    }

    @Test
    void getFileName() {
        try {
            String fileName = "pentax.txt";
            String name = FileProcessor.getFileName(filePath);
            assertNotNull(name);
            assertTrue(name.equals(fileName));
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    @Test
    void testFileSystem() {
        FileSystem defaultFileSystem = FileSystems.getDefault();
        assertNotNull(defaultFileSystem);

        Iterable<Path> rootDirectories = defaultFileSystem.getRootDirectories();
        Iterator<Path> directories = rootDirectories.iterator();
        while (directories.hasNext()) {
            System.out.println(directories.next());
        }
        directories = rootDirectories.iterator();
        Path root = directories.next();
        assertNotNull(root);

        try {
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(root);
            for(Path aPath : directoryStream) {
                if(Files.isDirectory(aPath) && !Files.isHidden(aPath))
                    System.out.println(aPath);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    void createFile() {
        try {
            String fileName = "/home/ayodele/Semicolon Africa/temp/clients.txt";
            Formatter output = new Formatter(fileName);

            Path filePath = Paths.get(fileName);
            assertNotNull(filePath);
            assertTrue(Files.exists(filePath));

            //output.format("%s%n", "Lolllll!!!!");
            output.format("%d %s %s %.2f%n", 1, "Jo", "Johnson", 50.58);
            output.format("%d %s %s %.2f%n", 2, "Joe", "Joey", 750.09);
            output.format("%d %s %s %.2f%n", 3, "Jon", "Johnson", 50.58);
            output.format("%d %s %s %.2f%n", 4, "Jona", "Joey", 750.09);

            output.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    void readFile() {
        String fileName = "/home/ayodele/Semicolon Africa/temp/clients.txt";

        Path filePath = Paths.get(fileName);
        assertNotNull(filePath);
        assertTrue(Files.exists(filePath));

        try(Scanner input = new Scanner(filePath)) {
            System.out.printf("%-10s%-12s%-12s%10s%n", "Account",
                    "First Name", "Last Name", "Balance");

            System.out.printf("%-10d%-12s%-12s%10.2f%n", input.nextInt(),
                    input.next(), input.next(), input.nextDouble());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}