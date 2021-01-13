import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WArrayTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void myArrayTest() {
        int studentScores[];
        int testScores[] = new int[4];
        int scores[] = {25, 3, 12, 21, 19};

        testScores[0] = 17;
        testScores[1] = 25;
        testScores[2] = 7;
        testScores[3] = 23;

        String[] names = {"Ibukun", "Onyi", "Akokite"};
        System.out.println("Implementing for loop...");
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name at index " + i + " is " + names[i]);
        }

        System.out.println();
        System.out.println("Implementing while loop...");
        int counter = 0;
        while (counter < names.length) {
            System.out.println("Name at index " + counter + " is " + names[counter]);
            counter++;
        }
    }

    @Test
    void multiDimensionalArrayTest() {
        int[][] grades = new int[3][4];

        int[][] scores = {
                {70, 89, 98, 93},
                {57, 49, 82, 90},
                {75, 34, 99, 45},
        };

        scores[0][1] = 95;

        assertTrue(scores.length == 3);
        assertTrue(scores[0].length == 4);

        for (int row = 0; row < scores.length; row++) {
            System.out.println("Processing row " + row);
            for (int col = 0; col < scores[row].length; col++) {
                System.out.print(scores[row][col]);
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Iterating with enhanced for loop...");
        for (int[] row : scores) {
            System.out.println("Processing a row");
            for (int col : row) {
                System.out.print(col);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    @Test
    void testNative() {
        Native wimp = new Native();
        wimp.setStudentID("SCV5018");
        wimp.setFirstName("Barnabas");
        wimp.setSurname("Oretan");
        wimp.setDatabaseGrade(2);
        wimp.setDesignThinkingGrade(1);
        wimp.setJavaGrade(5);

        Native wimpDozie = new Native("SCV5008", "Dozie", "Uyanwune");
        wimpDozie.setDatabaseGrade(20);
        wimpDozie.setDesignThinkingGrade(15);
        wimpDozie.setJavaGrade(3);

        int[] wimpScores = {75, 90, 78};
        Native onyi = new Native("SCV5001", "Onyi", "Agbo", wimpScores);
        assertEquals(75, onyi.getJavaGrade());
    }
}


