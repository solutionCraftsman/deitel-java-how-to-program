import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayOperationsTest {

    ArrayOperations arrayOperations;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatArrayCanBeInitialized() {
        int[] array = {2, 4, 6, 8};
        arrayOperations = new ArrayOperations(array);
        assertEquals(4, arrayOperations.getItemInArray(1));
    }

    @Test
    void testArraySumsCorrectly() {
        int[] array = {2, 4, 6, 8};
        arrayOperations = new ArrayOperations(array);
        assertEquals(20, arrayOperations.getSum());
    }

    @Test
    void testAverageIsComputedCorrectly() {
        int[] array = {2, 4, 6, 8};
        arrayOperations = new ArrayOperations(array);
        assertEquals(5.0, arrayOperations.getAverage());
    }

    @Test
    void testMaximumIsComputedCorrectly() {
        int[] array = {2, 4, 16, 8};
        arrayOperations = new ArrayOperations(array);
        assertEquals(16, arrayOperations.getMaximumElement());
    }

    @Test
    void testMinimumIsComputedCorrectly() {
        int[] array = {2, 4, 6, 8};
        arrayOperations = new ArrayOperations(array);
        assertEquals(2, arrayOperations.getMinimumElement());
    }

    @Test
    void testMinimumPossibleSumIsComputedCorrectly() {
        int[] array = {3, 6, 1, 3};
        arrayOperations = new ArrayOperations(array);
        assertEquals(7, arrayOperations.getMinimumPossibleSum());
    }

    @Test
    void testMaximumPossibleSumIsComputedCorrectly() {
        int[] array = {2, 4, 6, 8};
        arrayOperations = new ArrayOperations(array);
        assertEquals(18, arrayOperations.getMaximumPossibleSum());
    }

}

